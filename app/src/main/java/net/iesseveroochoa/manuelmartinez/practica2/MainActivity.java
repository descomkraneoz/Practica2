package net.iesseveroochoa.manuelmartinez.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNombre;
    Button btAgenda;
    Button btCalculadora;
    Button btReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombre=findViewById(R.id.tvNombre);
        btAgenda=findViewById(R.id.btAgenda);
        btCalculadora=findViewById(R.id.btCalculadora);
        btReceta=findViewById(R.id.btReceta);

        btAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,AgendaActivity.class);
                startActivity(intent);
            }
        });
    }
}
