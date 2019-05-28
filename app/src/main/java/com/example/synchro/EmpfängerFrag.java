package com.example.synchro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EmpfängerFrag extends Fragment {
    private final static String KEY_TEXT = "KEY_1";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.fragment_dyn_empfaenger, container, false);
        return view;
    };

    public static EmpfängerFrag erstellen(){
        EmpfängerFrag frag = new EmpfängerFrag();
        Bundle b = new Bundle();
        b.putString(KEY_TEXT,"");
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        //initColorPicker();
    }
//
//    public void initColorPicker(){
//        getView().findViewById(R.id.colorBut).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new ColorPickerPopup.Builder(v.getContext())
//                        .initialColor(0xFFFFFFFF)
//                        .enableAlpha(true)
//                        .okTitle("Choose")
//                        .cancelTitle("Cancel")
//                        .showIndicator(true)
//                        .showValue(true)
//                        .onlyUpdateOnTouchEventUp(true)
//                        .build()
//                        .show(new ColorPickerPopup.ColorPickerObserver() {
//                            @Override
//                            public void onColorPicked(int color) {
//                                getView().findViewById(R.id.colorBut).getBackground().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
//                            }
//                        });
//            }
//        });
//    }
}
