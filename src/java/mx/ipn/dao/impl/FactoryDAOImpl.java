/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dao.impl;


import mx.ipn.dao.FactoryDao;
import mx.ipn.dao.ProfesorDAO;
import org.springframework.web.context.ContextLoaderListener;

/**
 *
 * @author gabrielaalejandraperez
 */
public class FactoryDAOImpl extends FactoryDao{
    
    @Override
    public ProfesorDAO getProfesorDao() {
        return ContextLoaderListener.getCurrentWebApplicationContext().getBean("ProfesorDAO", ProfesorDAO.class);
    }
}
