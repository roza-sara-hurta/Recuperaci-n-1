package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Zapato implements Imagen {
    @Override
        public void dibujar (Canvas canvas){
            Paint paint = new Paint();
            paint.setColor(Color.argb(255, 255, 178, 72));
            paint.setStyle(Paint.Style.FILL);
            Path path = new Path();
            path.moveTo(-90, 200);
            path.lineTo(300, 200);
            path.lineTo(300, 100);
            path.lineTo(260, 100);
            path.lineTo(190, 100);
            path.lineTo(190, 150)
            path.lineTo(120,180);
            path.close();
            canvas.drawPath(path, paint);
        }
    }

