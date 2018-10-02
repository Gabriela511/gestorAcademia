/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.service;

import java.util.List;
import mx.ipn.bean.Profesor;
import mx.ipn.dao.ProfesorDAO;

/**
 *
 * @author gabrielaalejandraperez
 */
public class ProfesorService {
    
    private static ProfesorDAO dao;
    
    public ProfesorService(){
        
    }
    
    private ProfesorDAO getDao(){
        if(dao==null){
            dao = Service.FACTORY_DAO.getProfesorDao();
        }
        return dao;
    }
    
    public Profesor findById(Integer id){
        return getDao().findById(id);
    }
    
    public List<Profesor> findByExample(Profesor clase){
        return getDao().findByExample(clase);
    }
    
    public List list(){
        return getDao().list();
    }
    
    /*guarda encuesta*/
    public void makePersistant(Profesor clase){
        getDao().makePersistant(clase);
    }
    
    /*borra encuesta*/
    public void makeTransient(Profesor clase){
        getDao().makeTransient(clase);
    }
}
