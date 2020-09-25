package com.example.ceng319w20assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {
    TextView tv;
    String c = "\t\t\t\t" + "VR Activity:" +"\n\t\t\t\t" + "onCreate Executed " + "\n\t\t\t\t" + "onStart Executed" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        tv = (TextView)findViewById(R.id.textView3);
        tv.setText(c);

    }
    public void onStart()
    {
        super.onStart();
        tv.setText(c);
        Log.d("VR Activity", "OnStart Executed");
    }
    public void onStop()
    {
        super.onStop();
        tv.setText(c);
        Log.d("VR Activity", "OnStop Executed");;
    }

    public void onDestroy()
    {
        super.onDestroy();
        tv.setText(c);
        Log.d("VR Activity", "OnDestroy Executed");
    }



}