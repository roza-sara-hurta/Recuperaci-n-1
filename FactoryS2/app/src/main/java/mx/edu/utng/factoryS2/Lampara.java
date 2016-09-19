package mx.edu.utng.factoryS2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Lampara implements Dibujo {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, 255, 502, 72));
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();


        path.moveTo(150,100);
        path.lineTo(100,200);

        path.lineTo(175,200);

        path.lineTo(175,200);

        path.lineTo(175,400);

        path.lineTo(225,400);

        path.lineTo(225,200);

        path.lineTo(300,200);
        path.lineTo(250,100);






        path.close();
        canvas.drawPath(path, paint);



    }
}
