package mx.edu.utng.factoryexample2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;

public class Gomita implements Dulce {
    @Override



    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        pincel.setColor(Color.YELLOW);
        pincel.setStyle(Paint.Style.FILL);
        Path path = new Path();
        float mitadAncho = canvas.getWidth()/2;
        float mitadAlto = canvas.getHeight()/2;
        path.moveTo(mitadAncho*0.75f, mitadAlto*0.75f);
        path.lineTo(mitadAncho*0.5f, mitadAlto*1.5f);
        path.lineTo(mitadAncho*1.5f, mitadAlto*1.5f);
        path.lineTo(mitadAncho*1.25f, mitadAlto*0.75f);
        path.lineTo(mitadAncho*0.75f, mitadAlto*0.75f);

        path.close();
        canvas.drawPath(path, pincel);

    }


}
