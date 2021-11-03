package com.example.a3_9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;

import androidx.fragment.app.DialogFragment;

public class RadioDialogFragment extends DialogFragment {




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setTitle("Lista. Elige un planeta");

        builder.setSingleChoiceItems(R.array.planetas, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        return builder.create();
    }
}
