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
public class Bombo implements Informacion {

    @Override
    public void familia() {
        System.out.println("Familia de los idiófonos");
    }

    @Override
    public void precio() {
        System.out.println("El precio es de 211€");
    }

    @Override
    public void características() {
        System.out.println("Es un instrumento con un gran potencial sonoro, sin posibilidades de cambios de altura,\n"
                + "pero sí de textura apretando más o menos las clavijas que controlan la tensión con la que se aprieta la tela");
    }

    @Override
    public void numeroDeUnidades() {
        System.out.println("2");
    }
    
}
