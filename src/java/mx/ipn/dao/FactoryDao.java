/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dao;

import mx.ipn.dao.impl.FactoryDAOImpl;

/**
 *
 * @author gabrielaalejandraperez
 */
public abstract class FactoryDao {
    public static Class HIBERNATE = FactoryDAOImpl.class;
    
    public static FactoryDao instance(Class factory){
        try{
            return (FactoryDao) factory.newInstance();
        }catch(Exception e){
            throw new RuntimeException(
                "No se puede crear DAOFactory"+factory);
        }
    }
    
    public abstract ProfesorDAO getProfesorDao();
}
