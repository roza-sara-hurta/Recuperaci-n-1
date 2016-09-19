package mx.edu.utng.mementoS2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by jony on 8/9/2016.
 */
public class Lienzo extends View {

    private Flecha flecha;

    public Lienzo(Context context, Flecha flecha){
        super(context);
        this.flecha = flecha;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(flecha !=null){
            flecha.dibujar(canvas, flecha.getColor());
        }
    }

    public Flecha getFlecha() {
        return flecha;
    }

    public void setFlecha(Flecha flecha) {
        this.flecha = flecha;
    }
}
