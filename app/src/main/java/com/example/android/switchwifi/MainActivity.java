package com.example.android.switchwifi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=(Switch)findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getBaseContext(),"wifi on",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getBaseContext(), "wifi off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void changeWifi(View v){
        boolean checked=((ToggleButton)v).isChecked();
        if (checked){
            Toast.makeText(getBaseContext(),"wifi on",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getBaseContext(),"wifi off",Toast.LENGTH_LONG).show();
        }
    }
}
