package com.example.a3_9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;

import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

public class RadioDialogFragment extends DialogFragment {
    ListenerDialogFragment listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (ListenerDialogFragment) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(getActivity().toString() + " must implement NoticeDialogListener");
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setTitle("Lista. Elige un planeta");

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(getActivity(),
                R.array.planetas, android.R.layout.simple_list_item_1);


        builder.setSingleChoiceItems(R.array.planetas, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                CharSequence strName = adaptador.getItem(i);
                listener.onRadioDialogClick("Has seleccionado " + strName);

            }
        });

        return builder.create();
    }
}
