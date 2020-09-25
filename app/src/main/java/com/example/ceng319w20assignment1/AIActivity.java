package com.example.ceng319w20assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_a_i);
        tv = (TextView)findViewById(R.id.textView2);

    }

    public void onStart()
    {
        super.onStart();
        tv.setText("\t\t\t\t" + "AI Activity:" +"\n\t\t\t\t" + "onCreate Executed " + "\n\t\t\t\t" + "onStart Executed");
        Log.d("AI Activity", "OnStart Executed");
    }
    public void onStop() {
        super.onStop();
        tv.setText("\t\t\t\t" + "AI Activity:" +"\n\t\t\t\t" + "onCreate Executed " + "\n\t\t\t\t" + "onStart Executed");
        Log.d("AI Activity", "OnStop Executed");;
    }

    public void onDestroy()
    {
        super.onDestroy();
        tv.setText("\t\t\t\t" + "AI Activity:" +"\n\t\t\t\t" + "onCreate Executed " + "\n\t\t\t\t" + "onStart Executed");
        Log.d("AI Activity", "OnDestroy Executed");
    }

}



