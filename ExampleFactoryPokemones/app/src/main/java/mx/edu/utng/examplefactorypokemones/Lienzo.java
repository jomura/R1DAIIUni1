package mx.edu.utng.examplefactorypokemones;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by volibear on 13/09/16.
 */
public class Lienzo extends View {

    private Pokemon pokemon;

    public Lienzo (Context context, Pokemon pokemon){
        super(context);
        this.pokemon = pokemon;
    }

    @Override
    protected void onDraw(Canvas canvas){
        if(pokemon!=null){
            pokemon.dibujar(canvas);
        }
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
