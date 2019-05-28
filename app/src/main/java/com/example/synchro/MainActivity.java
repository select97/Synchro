package com.example.synchro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{
    private Fragment modus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zeigeFragment(EmpfängerFrag.erstellen());

        ((Switch) findViewById(R.id.switch1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    zeigeFragment(SenderFrag.erstellen());
                }
                else{
                    zeigeFragment(EmpfängerFrag.erstellen());
                }
            }
        });
    }

    private void zeigeFragment(Fragment frag)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame, frag);
        ft.commit();
        modus = frag;
    }

    private void entferneFragment() {
        if (modus != null) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.remove(modus);
            ft.commit();
            modus = null;
        }
    }



    public void onClickZeigeSenderFragment(View view){

    }
}
