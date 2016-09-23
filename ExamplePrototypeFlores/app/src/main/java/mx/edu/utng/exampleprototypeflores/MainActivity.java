package mx.edu.utng.exampleprototypeflores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtColor;
    private Button btnClonar;
    private GridView grvFlor;

    private ArrayList<Flor> flores;
    private Flor flor;
    private FlorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtColor = (EditText)findViewById(R.id.edt_color);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvFlor = (GridView)findViewById(R.id.grv_flores);

        flores = new ArrayList<Flor>();
        flor = new Flor();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flor.setColor(edtColor.getText().toString());

                Flor clon = (Flor)flor.clonar();
                flores.add(clon);
                adapter = new FlorAdapter(MainActivity.this, flores);
                grvFlor.setAdapter(adapter);
            }
        });
    }
}
