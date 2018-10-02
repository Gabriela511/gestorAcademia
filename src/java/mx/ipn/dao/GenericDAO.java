/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author gabrielaalejandraperez
 * @param <T> Clase
 * @param <ID> Identificador de clase
 */

public interface GenericDAO<T, ID extends Serializable>{
    public T findById(ID id);
    public void makePersistant(T clase); 
    public void makeTransient(T clase); 
    public List<T> findByExample(T clase, String... excluir);
    public List list();
    
}
