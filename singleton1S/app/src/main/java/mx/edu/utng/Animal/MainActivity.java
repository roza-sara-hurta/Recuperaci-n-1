package mx.edu.utng.Animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText edtNombre;
    private Button btnCrear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNombre = (EditText)findViewById(R.id.edt_nombre);
        btnCrear = (Button) findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Animales animales = new Animales();
                animales.setNombre(edtNombre.getText().toString());
                Toast.makeText(MainActivity.this, " Animal creado:"+
                        animales.getNombre(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}
