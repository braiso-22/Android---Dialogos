package com.example.a3_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.botonMensaje:
                MensajeDialogFragment mensaje = new MensajeDialogFragment();
                mensaje.show(getSupportFragmentManager(), "AlertDialog");
                break;
            case R.id.botonTres:
                BotonesDialogFragment botones = new BotonesDialogFragment();
                botones.show(getSupportFragmentManager(),"OptionsDialog");
                break;
            case R.id.botonLista:
                ListaDialogFragment lista = new ListaDialogFragment();
                lista.show(getSupportFragmentManager(),"ListDialog");
                break;
            case R.id.botonRadioB:
                RadioDialogFragment radio = new RadioDialogFragment();
                radio.show(getSupportFragmentManager(),"RadioDialog");
                break;
            case R.id.botonCheckB:
                CheckDialogFragment check = new CheckDialogFragment();
                check.show(getSupportFragmentManager(), "CheckDialog");
                break;
            case R.id.botonPersonalizado:
                PersonalizedDialogFragment personalizado = new PersonalizedDialogFragment();
                personalizado.show(getSupportFragmentManager(),"PersonalizedDialog");
                break;
            default:
                break;
        }
    }

}