package com.sample.libraryunittestexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sample.mathlub.MathLib;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
    }
    public void onBtnClick(View v)
    {
        MathLib m = new MathLib();
        int ret = m.add(5,6);
        btn.setText(String.valueOf(ret));
    }
}