package mx.edu.utng.factoryexample2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class Lienzo extends View {

    private Dulce dulce;

    public Lienzo (Context context, Dulce dulce){
        super(context);
        this.dulce = dulce;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(dulce!=null){
            dulce.dibujar(canvas);
        }
    }

    public Dulce getDulce() {
        return dulce;
    }

    public void setDulce(Dulce dulce) {
        this.dulce = dulce;
    }
}
