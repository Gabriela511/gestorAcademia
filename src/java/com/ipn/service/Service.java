/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.service;

import mx.ipn.dao.FactoryDao;


/**
 *
 * @author gabrielaalejandraperez
 */
public class Service {
    public static final FactoryDao FACTORY_DAO;
    
    static{
        FACTORY_DAO = FactoryDao.instance(FactoryDao.HIBERNATE);
    }
}
