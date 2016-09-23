package mx.edu.utng.state;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by qas on 6/09/16.
 */
public class Dia extends Reloj {
    @Override
    public void presionarSwitch(Cielo cielo, Canvas canvas) {
        cielo.setEstado(new Noche());
        Paint pincel = new Paint();
        canvas.drawColor(Color.BLUE);
        pincel.setStyle(Paint.Style.FILL);
        pincel.setColor(Color.YELLOW);
        float mitadX = canvas.getWidth()/2; //x es horizontal
        float mitadY = canvas.getHeight()/2; //Y es vertical

        canvas.drawCircle(mitadX, mitadY, 200, pincel);

    }
}
