package com.example.proyecto0002;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragmento1 fragmento1=new Fragmento1();
        fragmentTransaction.add(R.id.frameLayout,fragmento1);
        fragmentTransaction.commit();
    }

    public void sumar(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragmento1 fragmento1=new Fragmento1();
        fragmentTransaction.replace(R.id.frameLayout,fragmento1);
        fragmentTransaction.commit();
    }

    public void restar(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragmento3 fragmento3=new Fragmento3();
        fragmentTransaction.replace(R.id.frameLayout,fragmento3);
        fragmentTransaction.commit();
    }
}