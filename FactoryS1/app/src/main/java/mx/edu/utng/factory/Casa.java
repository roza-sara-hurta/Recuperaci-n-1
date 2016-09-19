package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Casa implements Imagen {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, 255, 178, 72));
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();


        path.moveTo(150,50);
        path.lineTo(50,150);

        path.lineTo(90,150);

        path.lineTo(90,250);

        path.lineTo(210,250);

        path.lineTo(210,150);

        path.lineTo(250,150);




        path.close();
        canvas.drawPath(path, paint);



    }
}
