package com.zaenal.uts_zaenalmustofa_311810782;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.nio.channels.InterruptedByTimeoutException;

public class SecondFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private EditText etTo, etSubject, etMessage;
    private Button btSend;
    public SecondFragment(){

    }

    public static SecondFragment newInstance(String param1,String param2) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        if (getArguments() != null){
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_second, container, false);

       etTo = view.findViewById(R.id.et_to);
       etSubject = view.findViewById(R.id.et_subject);
       etMessage = view.findViewById(R.id.et_massage);
       btSend = view.findViewById(R.id.bt_send);

       btSend.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto" + etTo.getText().toString()));
               intent.putExtra(Intent.EXTRA_SUBJECT, etSubject.getText().toString());
               intent.putExtra(Intent.EXTRA_TEXT,etMessage.getText().toString());
               startActivity(intent);
           }
       });

       return view;

    }
}
