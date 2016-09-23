package mx.edu.utng.factoryexample2;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class Caramelo implements Dulce {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        pincel.setColor(Color.YELLOW);
        pincel.setStyle(Paint.Style.FILL);
        float mitadX = canvas.getWidth()/2; //x es horizontal
        float mitadY = canvas.getHeight()/2; //Y es vertical

        canvas.drawCircle(mitadX, mitadY, 200, pincel);


    }
}
