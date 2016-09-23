package mx.edu.utng.exampleprototypeflores;

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
public class FlorAdapter extends ArrayAdapter<Flor> {
    public  FlorAdapter(Context context, ArrayList<Flor> flores){
        super(context, 0, flores);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Flor flor = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.flor_layout, parent, false);
        }
        TextView textView = (TextView)convertView.findViewById(R.id.txv_tarjeta);
        textView.setText(flor.getColor());
        return convertView;
    }
}
