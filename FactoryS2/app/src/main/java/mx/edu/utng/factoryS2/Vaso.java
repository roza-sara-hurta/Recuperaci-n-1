package mx.edu.utng.factoryS2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Vaso implements Dibujo {
    @Override
        public void dibujar (Canvas canvas){
            Paint paint = new Paint();
            paint.setColor(Color.argb(255, 255, 178, 72));
            paint.setStyle(Paint.Style.FILL);

            Path path = new Path();

        path.moveTo(275, 250);

            path.lineTo(300, 350);

            path.lineTo(350, 350);
        path.lineTo(375, 250);




            path.close();
            canvas.drawPath(path, paint);


        }
    }

