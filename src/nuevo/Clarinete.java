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
public class Clarinete implements Informacion {

    @Override
    public void familia() {
        System.out.println("De la familia de viento-madera");
    }

    @Override
    public void precio() {
        System.out.println("El precio es de 1758€");
    }

    @Override
    public void características() {
        System.out.println("Gran versatilidad, propiamente melódico con gran capacidad para las grandes dinámicas.\n"
                + " Alto, de tubo cilíndrico de color negor");
    }

    @Override
    public void numeroDeUnidades() {
        System.out.println("El número de unidades es de 12");
    }        

    @Override
    public void instrumento() {
        System.out.println("Clarinte");
    }
    
}
