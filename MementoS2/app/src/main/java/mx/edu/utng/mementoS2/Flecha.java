package mx.edu.utng.mementoS2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by jony on 8/9/2016.
 */
public class Flecha {
    private int color;

    public Flecha(){}

    public void dibujar(Canvas canvas, int color){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getWidth()/2;
        Path path = new Path();


        path.moveTo(150,50);
        path.lineTo(50,150);
        path.lineTo(100,150);
        path.lineTo(100,525);
        path.lineTo(200,525);
        path.lineTo(200,150);
        path.lineTo(250,150);
        path.lineTo(150,50);
        path.lineTo(150,50);



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
