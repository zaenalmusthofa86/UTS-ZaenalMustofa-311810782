package com.zaenal.uts_zaenalmustofa_311810782;

import android.app.Activity;
import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class TelephoneFragment extends Fragment {

    ImageView imageCall;
    EditText edit_text_number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_telephone, container, false);

        edit_text_number = view.findViewById(R.id.edit_text_number);
        imageCall = view.findViewById(R.id.image_call);

        imageCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edit_text_number.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + s));
                startActivity(i);
            }
        });

        return view;
    }
}
