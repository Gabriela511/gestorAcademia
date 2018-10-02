/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dao.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import java.lang.reflect.ParameterizedType;
import mx.ipn.dao.GenericDAO;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @author gabrielaalejandraperez
 */
public class GenericDaoImpl<T, ID extends Serializable> extends HibernateDaoSupport implements GenericDAO<T, ID>{
    
    Class<T> persistente;
    
    public GenericDaoImpl(){
        this.persistente = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    public Class<T> getPersistente(){
        return persistente;
    }
    
    public void setPersistente(Class<T> persistente){
        this.persistente = persistente;
    }
    
    public T findById(ID id){
        try{
            T entidad =  (T) getHibernateTemplate().get(getPersistente(), id);
            
            return entidad;
        }catch(Exception e){
            logger.error("error al obtener el objeto por id", e);
            return null;
        }
    }
    
    public void makePersistant(T clase){
         try{
             getHibernateTemplate().saveOrUpdate(clase);
         }catch(Exception e){
             logger.error("error al guardar o actualizar objeto ");
         }
    } 
    public void makeTransient(T clase){
        try{
             getHibernateTemplate().delete(clase);
         }catch(Exception e){
             logger.error("error al eliminar objeto ");
         }
    }
    
    public List<T> findByExample(T clase, String... excluir){
        try{
            DetachedCriteria criteria = DetachedCriteria.forClass(getPersistente());
            
            Example example = Example.create(clase);
            example.excludeZeroes();
            
            for(String exclude:excluir){
                example.excludeProperty(exclude);
            }
            
            criteria.add(example);
            
            return (List<T>) getHibernateTemplate().findByCriteria(criteria); 
         }catch(Exception e){
             logger.error("error al obtener por example ", e);
             return null;
         }
    }
    
    
    public List list() {
        return getHibernateTemplate().find("from Profesor");
    }
    

}
