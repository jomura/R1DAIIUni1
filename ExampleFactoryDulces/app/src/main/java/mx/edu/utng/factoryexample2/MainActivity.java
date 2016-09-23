package mx.edu.utng.factoryexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private EditText txtCambioFig;
    private Button btnCrear;
    private FabricaDeDulces factory;
    private LinearLayout layPrincipal;
    private Dulce dulce;
    private Lienzo lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCambioFig = (EditText)findViewById(R.id.edt_dulce);
        btnCrear = (Button)findViewById(R.id.btn_crear);
        factory = new FabricaDeDulces();
        layPrincipal = (LinearLayout)findViewById(R.id.lay_principal);
        lienzo = new Lienzo(MainActivity.this, dulce);

        layPrincipal.addView(lienzo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dulce = factory.crearDulce(txtCambioFig.getText().toString());
                lienzo.setDulce(dulce);
                lienzo.invalidate();
            }
        });
    }
}
