package mx.edu.utng.state;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by qas on 6/09/16.
 */
public class Noche extends Reloj {
    @Override
    public void presionarSwitch(Cielo cielo, Canvas canvas) {
        cielo.setEstado(new Dia());
        Paint pincel = new Paint();
        canvas.drawColor(Color.BLACK);
        pincel.setStyle(Paint.Style.FILL);
        pincel.setColor(Color.YELLOW);
        Path path = new Path();

        float mitad = canvas.getWidth()/2;
        float min = Math.min(canvas.getWidth(),
                canvas.getHeight());
        float half = min/2;

        mitad = mitad - half;

        path.moveTo(mitad+half*0.5f, half*0.84f);
        path.lineTo(mitad+half*1.5f, half*0.84f);
        path.lineTo(mitad+half*0.68f, half*1.45f);
        path.lineTo(mitad+half*1.0f, half*0.5f);
        path.lineTo(mitad+half*1.32f, half*1.45f);
        path.lineTo(mitad + half * 0.5f, half * 0.84f);

        path.close();
        canvas.drawPath(path, pincel);
    }
}
