package mx.edu.utng.factoryS2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class
MainActivity extends AppCompatActivity {
    private EditText edtImagen;
    private Button btnCrear;
    private DibujoFactory factoy;
    private LinearLayout layPrincipal;
    private Dibujo dibujo;
    private Lienzo lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtImagen=(EditText)findViewById(R.id.edt_Imagen);
        btnCrear = (Button)findViewById(R.id.btn_crear);
        factoy = new DibujoFactory();
        layPrincipal = (LinearLayout)findViewById(R.id.ay_principal);
        lienzo= new Lienzo(MainActivity.this, dibujo);

        layPrincipal.addView(lienzo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dibujo = factoy.crear(edtImagen.getText().toString());
                lienzo.setDibujo(dibujo);
                lienzo.invalidate();
            }
        });
    }
}
