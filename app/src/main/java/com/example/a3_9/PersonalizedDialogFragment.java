package com.example.a3_9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class PersonalizedDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getActivity().getSystemService(infService);

        View inflado = li.inflate(R.layout.dialog, null);
        TextView tvNombre = inflado.findViewById(R.id.eTextNombre);
        TextView tvPass = inflado.findViewById(R.id.eTextPassword);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setTitle("Usuario y contraseña");
        builder.setView(inflado);

        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Has escrito: nombre: '" +
                        tvNombre.getText().toString() +
                        "'. Contraseña: '" + tvPass.getText().toString() + "' y has pulsado 'Aceptar'", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Has pulsado 'Cancelar'",
                        Toast.LENGTH_LONG).show();
            }

        });

        return builder.create();
    }
}
