package mx.edu.utng.exampleprototypeflores;

/**
 * Created by volibear on 14/09/16.
 */
public class Flor implements Clonable{

    private String color;

    public Flor(){

    }

    public Flor(String color){
        this.color = color;
    }
    @Override
    public Clonable clonar(){
        Flor florClonada = new Flor(color);
        return florClonada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
