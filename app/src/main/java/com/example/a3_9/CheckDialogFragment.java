package com.example.a3_9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class CheckDialogFragment extends DialogFragment {




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setTitle("Lista. Elige un planeta");
        int largoArray = 10;
        boolean booleanos[] = new boolean[largoArray];

        for(int i=0;i<largoArray;i++){
            booleanos[i] = false;
        }
        builder.setMultiChoiceItems(R.array.planetas, booleanos, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

            }
        });

        return builder.create();
    }
}
