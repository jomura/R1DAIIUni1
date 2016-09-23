package mx.edu.utng.state;

import android.graphics.Canvas;

/**
 * Created by qas on 6/09/16.
 */
public class Cielo {
    private Reloj estado;
    private Canvas canvas;

    public Cielo(Reloj estado){
        this.estado = estado;
    }

    public void presionarBoton(){
        estado.presionarSwitch(this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Reloj getEstado() {
        return estado;
    }

    public void setEstado(Reloj estado) {
        this.estado = estado;
    }

}
