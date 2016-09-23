package mx.edu.utng.examplesingletonedadmascota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtRaza;
    private EditText edtEdad;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = (EditText) findViewById(R.id.edt_nombre);
        edtRaza = (EditText) findViewById(R.id.edt_raza);
        edtEdad = (EditText) findViewById(R.id.edt_edad);
        btnCrear = (Button) findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mascota mascota = Mascota.getMascota();
                mascota.setNombre(edtNombre.getText().toString());
                mascota.setRaza(edtRaza.getText().toString());
                mascota.setEdad(Integer.parseInt(edtEdad.getText().toString()));

                Toast.makeText(MainActivity.this, "Nombre de la Mascota: " + mascota.getNombre() + "\nRaza del Animal: " + mascota.getRaza() + "\nEdad: " + mascota.getEdad(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
