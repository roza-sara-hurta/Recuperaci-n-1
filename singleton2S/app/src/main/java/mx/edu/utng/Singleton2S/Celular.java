package mx.edu.utng.Singleton2S;

/**
 * Created by Usuario General on 06/09/2016.
 */
public class Celular {
    private String nombre;
    public Celular(){
        this.nombre ="";
    }

    public String getNombre(){
        return nombre;
    }


    public void  setNombre(String nombre){
        this.nombre = nombre;

    }
}
