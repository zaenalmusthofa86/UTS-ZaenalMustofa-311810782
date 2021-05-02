package com.zaenal.uts_zaenalmustofa_311810782;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class FirstFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private WebView webviewku;
    private WebSettings websettingsku;
    public FirstFragment(){

    }

    public static FirstFragment newInstance(String param1,String param2) {
        FirstFragment fragment = new FirstFragment();
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
    public  View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        webviewku = view.findViewById(R.id.webview);
        websettingsku = webviewku.getSettings();

        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://id.wikipedia.org/wiki/Halaman_Utama");
        return view;
    }
}
