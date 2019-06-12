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
public class Flauta implements Informacion{

    @Override
    public void familia() {
        System.out.println("De la familia de Viento Madera");
    }

    @Override
    public void precio() {
        System.out.println("el precio es de 7.9€");
    }

    @Override
    public void características() {
        System.out.println("Flauta dulce de bisel. ");
    }

    @Override
    public void numeroDeUnidades() {
        System.out.println("Numero de unidades: 12");
    }
    
}
