package mx.edu.utng.examplefactorypokemones;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by volibear on 13/09/16.
 */
public class Yerba implements Pokemon {
    @Override
    public void dibujar(Canvas canvas){
        canvas.drawColor(Color.GREEN);
        Paint pincel = new Paint();

        pincel.setColor(Color.BLACK);
        pincel.setTextSize(100);
        pincel.setTypeface(Typeface.SERIF);

        canvas.drawText("Tangea", 0, 100, pincel);
        canvas.drawText("Chikorita",0, 200, pincel);
        canvas.drawText("Bellossom",0, 300, pincel);
        canvas.drawText("Sunflora",0, 400, pincel);
        canvas.drawText("TReecko",0, 500, pincel);
        canvas.drawText("Shaymin",0, 600, pincel);
    }
}
