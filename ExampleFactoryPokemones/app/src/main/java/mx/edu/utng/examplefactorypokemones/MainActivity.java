package mx.edu.utng.examplefactorypokemones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private EditText txtTipoPokemon;
    private Button btnCrear;
    private FabricaDePokemon factory;
    private LinearLayout layPrincipal;
    private Pokemon pokemon;
    private Lienzo lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTipoPokemon = (EditText)findViewById(R.id.edt_tipo);
        btnCrear = (Button)findViewById(R.id.btn_crear);
        factory = new FabricaDePokemon();
        layPrincipal = (LinearLayout)findViewById(R.id.lay_principal);
        lienzo = new Lienzo(MainActivity.this, pokemon);

        layPrincipal.addView(lienzo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemon = factory.crearPokemon(txtTipoPokemon.getText().toString());
                lienzo.setPokemon(pokemon);
                lienzo.invalidate();
            }
        });
    }
}
