package mx.edu.utng.exampleprototypecodigosdebarra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtCodigo;
    private Button btnClonar;
    private GridView grvFlor;

    private ArrayList<CodigoDeBarras> codigos;
    private CodigoDeBarras codigo;
    private CodigoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtCodigo= (EditText)findViewById(R.id.edt_codigo);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvFlor = (GridView)findViewById(R.id.grv_codigosdebarra);

        codigos = new ArrayList<CodigoDeBarras>();
        codigo = new CodigoDeBarras();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codigo.setCodigo(edtCodigo.getText().toString());

                CodigoDeBarras clon = (CodigoDeBarras) codigo.clonar();
                codigos.add(clon);
                adapter = new CodigoAdapter(MainActivity.this, codigos);
                grvFlor.setAdapter(adapter);
            }
        });
    }
}
