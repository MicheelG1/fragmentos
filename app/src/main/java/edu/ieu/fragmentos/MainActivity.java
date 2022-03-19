package edu.ieu.fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button_agregar);

        boton.setOnClickListener(view -> {
            agregarFragmento();
        });
    }

    private void agregarFragmento() {
        FragmentManager manejadorFragmento = getSupportFragmentManager();
        FragmentTransaction transaccion = manejadorFragmento.beginTransaction();
        CounterFragment fragmentoContar = new CounterFragment();
        transaccion.add(R.id.activity_main_contaniner, fragmentoContar);
        transaccion.commit();
    }
}