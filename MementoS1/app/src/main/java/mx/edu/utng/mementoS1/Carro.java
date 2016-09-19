package mx.edu.utng.mementoS1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by jony on 8/9/2016.
 */
public class Carro {
    private int color;

    public Carro(){}

    public void dibujar(Canvas canvas, int color){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);

        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;

        Path path = new Path();




        path.moveTo(mitadX*0.5f,mitadY*0.5f);
        path.lineTo(mitadX*0.25f,mitadY);
        path.lineTo(mitadX*0.1f,mitadY);
        path.lineTo(mitadX*0.1f,mitadY*1.5f);
        path.lineTo(mitadX*1.75f,mitadY*1.5f);
        path.lineTo(mitadX*1.75f,mitadY);
        path.lineTo(mitadX*1.5f,mitadY);
        path.lineTo(mitadX*1.25f,mitadY*0.5f);
        path.lineTo(mitadX*0.5f,mitadY*0.5f);

        canvas.drawCircle((canvas.getWidth()*0.3f),(canvas.getHeight()*0.8f),100, paint);
        canvas.drawCircle((canvas.getWidth()*0.6f),(canvas.getHeight()*0.8f),100, paint);

        path.close();
        canvas.drawPath(path, paint);


    }

    public Memento guardarMemento() {
        return new Memento(color);
    }
    public void restaurarMemento(Memento m) {
        color = m.getColor();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
