package mx.edu.utng.factory;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Lienzo extends View {
    private Imagen imagen;

    public Lienzo(Context context, Imagen imagen){
        super(context);
        this.imagen = imagen;
            }

    @Override
    protected void onDraw(Canvas canvas) {
        if(imagen !=null){
            imagen.dibujar(canvas);
        }
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
}
