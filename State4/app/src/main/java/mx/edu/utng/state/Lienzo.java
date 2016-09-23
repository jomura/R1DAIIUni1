package mx.edu.utng.state;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by qas on 6/09/16.
 */
public class Lienzo extends View{

    private Reloj estado;
    private Cielo cielo;

    public Lienzo(Context context, Reloj estado, Cielo cielo){
        super(context);
        this.estado = estado;
        this.cielo = cielo;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&& cielo !=null){
            cielo.setCanvas(canvas);
            estado.presionarSwitch(cielo, canvas);
        }
    }

    public Reloj getEstado() {
        return estado;
    }

    public void setEstado(Reloj estado) {
        this.estado = estado;
    }
}
