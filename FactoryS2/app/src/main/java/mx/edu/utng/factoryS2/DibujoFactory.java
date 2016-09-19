package mx.edu.utng.factoryS2;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class DibujoFactory {
    private Dibujo dibujo;

    public Dibujo crear(String tipo){
        if(tipo == null) {
            return null;
        }
        if  (tipo.equalsIgnoreCase("LAMPARA")){
            return new Lampara();
        }else if (tipo.equalsIgnoreCase("VASO")){
            return new Vaso();
        }else if (tipo.equalsIgnoreCase("CORAZON")){
            return new Corazon();
        }


        return null;
    }
}
