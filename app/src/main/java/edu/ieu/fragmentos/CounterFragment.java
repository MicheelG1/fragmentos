package edu.ieu.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CounterFragment extends Fragment {
    private TextView text;
    private Button button;
    private EditText edit;
    public CounterFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_counter, container, false);


        button = root.findViewById(R.id.main_button);
        text = root.findViewById(R.id.main_button);
        edit = root.findViewById(R.id.main_editText);

        button.setOnClickListener( view -> {
            contarLetras();
        });
        return root;
    }

    private void contarLetras() {
        String mensaje = edit.getText().toString();
        text.setText( String.valueOf( mensaje.length() ) );
    }
}