package mx.edu.utng.factoryS2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Lienzo extends View {
    private Dibujo dibujo;

    public Lienzo(Context context, Dibujo dibujo){
        super(context);
        this.dibujo = dibujo;
            }

    @Override
    protected void onDraw(Canvas canvas) {
        if(dibujo !=null){
            dibujo.dibujar(canvas);
        }
    }

    public Dibujo getDibujo() {
        return dibujo;
    }

    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }
}
