package com.example.sistemadeclassificacao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {

    TextView txtstatus;
    RatingBar rtbvotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtstatus = (TextView) findViewById(R.id.txtstatus);
        rtbvotacao = (RatingBar) findViewById(R.id.rtbvotacao);

        txtstatus.setText("Status: Ruim");

        rtbvotacao.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 1) {
                    txtstatus.setText("Status: Regular");
                } else if (rating == 2) {
                    txtstatus.setText("Status: Bom");
                }
                else if (rating == 3){
                    txtstatus.setText("Status: Ótimo");
                }
                else if (rating == 4){
                    txtstatus.setText("Status: Excelente");
                }
                else if(rating == 5){
                    txtstatus.setText("Status: Espetacular");
                }
            }
        });
    }
}