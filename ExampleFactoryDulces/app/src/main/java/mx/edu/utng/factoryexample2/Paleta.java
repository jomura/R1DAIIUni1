package mx.edu.utng.factoryexample2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by volibear on 8/09/16.
 */
public class Paleta implements Dulce {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        Paint pincel2 = new Paint();
        pincel.setColor(Color.RED);
        pincel2.setColor(Color.BLACK);
        pincel.setStyle(Paint.Style.FILL);
        pincel2.setStyle(Paint.Style.FILL);

        canvas.drawRect((canvas.getWidth()/2)-10f, canvas.getWidth()-500f, canvas.getWidth()/2+10f, canvas.getWidth()+100f, pincel2);
        canvas.drawCircle((canvas.getWidth()/2),canvas.getHeight()/2, 100, pincel );
    }
}
