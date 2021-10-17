package com.example.trocadetelas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class Tela2Activity extends Activity {

    Button btTelaprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btTelaprincipal = (Button) findViewById(R.id.btTelaprincipal);

        btTelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tela2Activity.this.finish();
            }
        });
    }
}