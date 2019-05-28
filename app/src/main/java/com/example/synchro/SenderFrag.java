package com.example.synchro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SenderFrag extends Fragment {
    private final static String KEY_TEXT = "KEY_2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.fragment_dyn_sender, container, false);
        return view;
    };

    public static SenderFrag erstellen(){
        SenderFrag frag = new SenderFrag();
        Bundle b = new Bundle();
        b.putString(KEY_TEXT,"");
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
    }
}
