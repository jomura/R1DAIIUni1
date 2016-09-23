package mx.edu.utng.examplefactorypokemones;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by volibear on 13/09/16.
 */
public class Agua implements Pokemon {
    @Override
    public void dibujar(Canvas canvas){
        canvas.drawColor(Color.BLUE);
        Paint pincel = new Paint();

        pincel.setColor(Color.BLACK);
        pincel.setTextSize(100);
        pincel.setTypeface(Typeface.SERIF);

        canvas.drawText("Squirtle", 0, 100, pincel);
        canvas.drawText("Psyduck",0, 200, pincel);
        canvas.drawText("Poliwag",0, 300, pincel);
        canvas.drawText("Seel",0, 400, pincel);
        canvas.drawText("Shellder",0, 500, pincel);
        canvas.drawText("Krabby",0, 600, pincel);
    }
}
