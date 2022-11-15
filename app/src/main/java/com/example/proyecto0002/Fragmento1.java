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


public class Fragmento1 extends Fragment {

    TextView tv1;
    EditText et1,et2;
    Button button;

    public Fragmento1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et1=view.findViewById(R.id.et1);
        et2=view.findViewById(R.id.et2);
        tv1=view.findViewById(R.id.tv1);
        button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int suma=Integer.parseInt(et1.getText().toString())+Integer.parseInt(et2.getText().toString());
                tv1.setText("La suma es: "+suma);
            }
        });

    }
}