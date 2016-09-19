package mx.edu.utng.prototypeS1;

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
public class VacaAdapter extends ArrayAdapter<Vaca>{


    public VacaAdapter(Context context , ArrayList<Vaca> vacas){
        super(context,0, vacas);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Vaca vaca =getItem(position);
        if (convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.vaca_layout, parent, false);
        }
            TextView txtVaca = (TextView)convertView.findViewById(R.id.tvx_vaca);
            txtVaca.setText( vaca.getTamaño()+" "+vaca.getColor() );
            return convertView;
    }
}








