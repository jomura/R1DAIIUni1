package mx.edu.utng.examplefactorypokemones;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by volibear on 13/09/16.
 */
public class Normal implements Pokemon {
    @Override
    public void dibujar(Canvas canvas){
        canvas.drawColor(Color.WHITE);
        Paint pincel = new Paint();

        pincel.setColor(Color.BLACK);
        pincel.setTextSize(100);
        pincel.setTypeface(Typeface.SERIF);

        canvas.drawText("Rattata", 0, 100, pincel);
        canvas.drawText("Meowth",0, 200, pincel);
        canvas.drawText("Persian",0, 300, pincel);
        canvas.drawText("Kangaskhan",0, 400, pincel);
        canvas.drawText("Tauros",0, 500, pincel);
        canvas.drawText("Eevee",0, 600, pincel);
    }
}
