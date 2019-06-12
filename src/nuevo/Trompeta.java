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
public class Trompeta implements Informacion {

    @Override
    public void familia() {
        System.out.println("de la familia de los Viento-metal");
    }

    @Override
    public void precio() {
        System.out.println("el precio es de 169€");
    }

    @Override
    public void características() {
        System.out.println("Gran capacidad sonora, de boquilla simple. Alargada, con diferentes colores\n "
        +"metálicos con tonos de gris a dorado"
        );
    }

    @Override
    public void numeroDeUnidades() {
        System.out.println("Hay 7 unidades");
    }

    @Override
    public void instrumento() {
        System.out.println("Trompeta");
    }
    
}
