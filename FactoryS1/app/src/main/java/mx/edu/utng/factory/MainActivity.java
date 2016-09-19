package mx.edu.utng.factory;

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
    private ImagenFactory factoy;
    private LinearLayout layPrincipal;
    private Imagen imagen;
    private Lienzo lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtImagen=(EditText)findViewById(R.id.edt_Imagen);
        btnCrear = (Button)findViewById(R.id.btn_crear);
        factoy = new ImagenFactory();
        layPrincipal = (LinearLayout)findViewById(R.id.ay_principal);
        lienzo= new Lienzo(MainActivity.this, imagen);

        layPrincipal.addView(lienzo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen = factoy.crear(edtImagen.getText().toString());
                lienzo.setImagen(imagen);
                lienzo.invalidate();
            }
        });
    }
}
