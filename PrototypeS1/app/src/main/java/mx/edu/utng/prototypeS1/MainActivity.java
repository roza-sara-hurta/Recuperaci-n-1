package mx.edu.utng.prototypeS1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private EditText editColor1;
    private EditText editTammaño;
    private Button btnClonar;
    private ArrayList<Vaca> vacas;
    private Vaca vaca;
    private VacaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTammaño =(EditText)findViewById(R.id.edt_tamaño);
        editColor1 =(EditText)findViewById(R.id.edt_color);
        btnClonar=(Button)findViewById(R.id.btn_clonar);
        final GridView grvVaca = (GridView) findViewById(R.id.grv_vaca);
        vacas = new ArrayList<Vaca>();
        vaca =new Vaca();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaca.setColor(editColor1.getText().toString());
                vaca.setTamaño(editTammaño.getText().toString());


                Vaca clon = (Vaca) vaca.clonar();

                vacas.add(clon);
                adapter = new VacaAdapter(MainActivity.this,(ArrayList) vacas);
                grvVaca.setAdapter(adapter);
            }
        });

    }
}
