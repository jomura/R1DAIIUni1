package mx.edu.utng.examplefactorypokemones;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by volibear on 13/09/16.
 */
public class Fuego implements Pokemon{
    @Override
    public void dibujar(Canvas canvas){
        canvas.drawColor(Color.RED);
        Paint pincel = new Paint();

        pincel.setColor(Color.BLACK);
        pincel.setTextSize(100);
        pincel.setTypeface(Typeface.SERIF);

        canvas.drawText("Charmander", 0, 100, pincel);
        canvas.drawText("vulpix",0, 200, pincel);
        canvas.drawText("Growlithe",0, 300, pincel);
        canvas.drawText("Ponyta",0, 400, pincel);
        canvas.drawText("Magmar",0, 500, pincel);
        }
}
