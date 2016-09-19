package mx.edu.utng.factoryS2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Corazon implements Dibujo {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, 255, 178, 72));
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();


        path.moveTo(200,150);
        path.lineTo(150,200);

        path.lineTo(250,350);

        path.lineTo(350,200);

        path.lineTo(300,150);
        path.lineTo(250,200);





        path.close();
        canvas.drawPath(path, paint);



    }
}




