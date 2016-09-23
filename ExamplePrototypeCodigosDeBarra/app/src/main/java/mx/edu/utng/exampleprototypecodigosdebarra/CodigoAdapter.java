package mx.edu.utng.exampleprototypecodigosdebarra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by volibear on 14/09/16.
 */
public class CodigoAdapter extends ArrayAdapter<CodigoDeBarras> {
    public CodigoAdapter(Context context, ArrayList<CodigoDeBarras> codigos){
        super(context, 0, codigos);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        CodigoDeBarras codigodebarras = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.codigo_layout, parent, false);
        }
        TextView textView = (TextView)convertView.findViewById(R.id.txv_codigo);
        textView.setText(codigodebarras.getCodigo());
        return convertView;
    }
}
