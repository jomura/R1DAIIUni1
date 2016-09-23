
package mx.edu.utng.examplesingletonpokemon;

/**
 * Created by volibear on 13/09/16.
 */
public class Pokemon {
    private String nombre;
    private int ataque;
    private static Pokemon pokemon;

    private Pokemon(){
        this.nombre="";
        this.ataque=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public static Pokemon getPokemon(){
        if (pokemon == null){
            pokemon = new Pokemon();
        }
        return pokemon;
    }
}
