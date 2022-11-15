package com.example.proyecto0002;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fragmento3 extends Fragment {

    EditText et3,et4;
    Button button2;
    TextView tv2;

    public Fragmento3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        et3=view.findViewById(R.id.et3);
        et4=view.findViewById(R.id.et4);
        tv2=view.findViewById(R.id.tv2);
        button2=view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int suma=Integer.parseInt(et3.getText().toString())-Integer.parseInt(et4.getText().toString());
                tv2.setText("La resta es: "+suma);
            }
        });

    }
}