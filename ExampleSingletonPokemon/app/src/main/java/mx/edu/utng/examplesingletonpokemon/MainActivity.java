package mx.edu.utng.examplesingletonpokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtAtaque;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = (EditText) findViewById(R.id.edt_nombre);
        edtAtaque = (EditText) findViewById(R.id.edt_ataque);
        btnCrear = (Button) findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Pokemon pokemon = Pokemon.getPokemon();
                pokemon.setNombre(edtNombre.getText().toString());
                pokemon.setAtaque(Integer.parseInt(edtAtaque.getText().toString()));

                Toast.makeText(MainActivity.this, "Pokemon: " + pokemon.getNombre() + "\nAtaque: " + pokemon.getAtaque(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
