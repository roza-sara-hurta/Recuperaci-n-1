package mx.edu.utng.prototypes2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jony on 7/9/2016.
 */
public class FlorAdapter extends ArrayAdapter<Flor>{


    public FlorAdapter(Context context , ArrayList<Flor> flors){
        super(context,0, flors);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Flor flor =getItem(position);
        if (convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.flor_layout, parent, false);
        }
            TextView txtFlor = (TextView)convertView.findViewById(R.id.tvx_flor);
            txtFlor.setText(  flor.getColor()+""+flor.getTipo());
            return convertView;
    }
}








