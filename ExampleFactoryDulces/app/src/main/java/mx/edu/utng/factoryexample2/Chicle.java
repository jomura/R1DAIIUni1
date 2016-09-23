package mx.edu.utng.factoryexample2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by volibear on 8/09/16.
 */
public class Chicle implements Dulce {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        Paint pincel2 = new Paint();
        Paint pincel3 = new Paint();
        Paint pincel4 = new Paint();
        int Mitadalto = canvas.getHeight()/2; //ALTURA
        int Mitadancho = canvas.getWidth()/2; //Ancho
        pincel.setColor(Color.GREEN);
        pincel.setStyle(Paint.Style.FILL_AND_STROKE);
        pincel2.setColor(Color.RED);
        pincel2.setStyle(Paint.Style.FILL_AND_STROKE);
        pincel3.setColor(Color.BLUE);
        pincel3.setStyle(Paint.Style.FILL_AND_STROKE);
        pincel4.setColor(Color.YELLOW);
        pincel4.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawRect(Mitadancho - 160, Mitadalto - 160, Mitadancho + 40, Mitadalto + 40, pincel4);
        canvas.drawRect(Mitadancho - 140, Mitadalto - 140, Mitadancho +  60, Mitadalto +  60, pincel3);
        canvas.drawRect(Mitadancho - 120, Mitadalto - 120, Mitadancho +  80, Mitadalto +  80, pincel2);
        canvas.drawRect(Mitadancho - 100, Mitadalto - 100, Mitadancho + 100, Mitadalto + 100, pincel);
            }
}
