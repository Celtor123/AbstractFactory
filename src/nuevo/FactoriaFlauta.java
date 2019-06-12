
package nuevo;


public class FactoriaFlauta implements Servicio{

    @Override
    public Informacion crearServicio() {
        return new Flauta();
    }
    
}
