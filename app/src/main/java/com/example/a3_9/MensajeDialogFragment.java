package com.example.a3_9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MensajeDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Hola Mundo");
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setTitle("Mensaje");

        return builder.create();
    }
}
