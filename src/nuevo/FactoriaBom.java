/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

/**
 *
 * @author Juan
 */
public class FactoriaBom implements Servicio{

    @Override
    public Informacion crearServicio() {
        return new Bombo();       
    }
    
}
