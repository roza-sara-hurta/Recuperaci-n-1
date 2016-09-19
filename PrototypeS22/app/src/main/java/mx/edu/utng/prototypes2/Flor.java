package mx.edu.utng.prototypes2;

/**
 * Created by jony on 7/9/2016.
 */
public class Flor implements Clonable {
    private String color;
    private String tipo;


    public Flor() {
        this.color = "";
        this.tipo = "";
    }


    public Flor(String color, String compañia, String tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public Clonable clonar() {
        Flor clon = new Flor();
        clon.setTipo(tipo);
        clon.setColor(color);
        return clon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}