package mx.edu.utng.mementoS1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by jony on 8/9/2016.
 */
public class Lienzo extends View {

    private Carro carro;

    public Lienzo(Context context, Carro carro){
        super(context);
        this.carro = carro;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(carro !=null){
            carro.dibujar(canvas, carro.getColor());
        }
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
