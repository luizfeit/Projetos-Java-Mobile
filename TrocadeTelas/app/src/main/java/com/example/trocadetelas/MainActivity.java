package com.example.trocadetelas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {

    Button btTela2;
    Intent iTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btTela2 = (Button) findViewById(R.id.btTela2);

        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iTela2 = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(iTela2);
            }
        });
    }
}