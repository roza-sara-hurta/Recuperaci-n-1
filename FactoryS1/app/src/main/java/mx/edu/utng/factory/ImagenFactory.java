package mx.edu.utng.factory;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class ImagenFactory {
    private Imagen imagen;

    public Imagen crear(String tipo){
        if(tipo == null) {
            return null;
        }
        if  (tipo.equalsIgnoreCase("CASA")){
            return new Casa();
        }else if (tipo.equalsIgnoreCase("ZAPATO")){
            return new Zapato();
        }else if (tipo.equalsIgnoreCase("CARRO")){
            return new Carro();
        }


        return null;
    }
}
