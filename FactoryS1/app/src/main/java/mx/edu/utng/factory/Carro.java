package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Carro implements Imagen {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(255, 255, 178, 52));

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
}




