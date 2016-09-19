package mx.edu.utng.prototypeS1;

/**
 * Created by jony on 7/9/2016.
 */
public class Vaca implements Clonable {
    private String color;
    private String tamaño;


    public Vaca(){
        this.color ="";
        this.tamaño ="";
    }



    public Vaca(String tamaño,  String color){
        this.color = color;
        this.tamaño = tamaño;
     }

    @Override
    public Clonable clonar() {
        Vaca clon = new Vaca();
        clon.setColor(color);
        clon.setTamaño(tamaño);

        return clon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
