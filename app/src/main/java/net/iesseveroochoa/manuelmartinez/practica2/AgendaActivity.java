package net.iesseveroochoa.manuelmartinez.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {
    public static String EXTRA_NOMBRE="net.iesseveroochoa.manuelmartinez.practica2.AgendaActivity.NOMBRE";

    TextView tvTituloContacto;
    Button btAceptar;
    Button btReiniciar;
    Button btSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        tvTituloContacto=findViewById(R.id.tvNuevoContacto);
        btAceptar=findViewById(R.id.btAceptar);
        btReiniciar=findViewById(R.id.btReiniciar);
        btSalir=findViewById(R.id.btSalir);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nombre=findViewById(R.id.etNombreAgenda);
                EditText apellidos=findViewById(R.id.etApellidosAgenda);
                tvTituloContacto.setText(nombre.getText().toString()+" "+apellidos.getText().toString());
            }
        });
    }
}
