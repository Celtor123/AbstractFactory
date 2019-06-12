/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import javax.swing.JOptionPane;

/**
 * Calse donde el cliente ejecuta el programa
 * se instancia la interfaz servicio a las factorias donde
 * se retorna la clase del producto
 * @author Celso
 * @version 1
 */
public class Cliente {
    public static void main(String[] Args){
         Servicio servicio = null;
        Object[] a={"Clarinete","Flauta","Bombo","Trompeta","Salir del programa"};
        int r=JOptionPane.showOptionDialog(null,"Elija", "Menu Opciones", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE,null,a,null);
        switch(r){
            case 0:
            servicio= new FactoriaCla();
            break;
            case 1:
            servicio=new FactoriaBom();
            break;
            case 2:
            servicio=new FactoriaFlauta();
            break;
            case 3:
            servicio=new FactoriaTrom();
            break;
            case 4:
                System.out.println("Adios");
            break;
        }
        
    
    Informacion as=servicio.crearServicio();
    as.familia();
    as.características();
    as.numeroDeUnidades();
    as.precio();
        
    }
    }
