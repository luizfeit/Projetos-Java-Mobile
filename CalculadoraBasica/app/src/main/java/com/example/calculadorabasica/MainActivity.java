package com.example.calculadorabasica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class MainActivity extends Activity {

    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);

        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double subtracao = num1 + num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle(("Resultado Soma"));
                dialogo.setMessage("A Soma é " + subtracao);

                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double subtracao = num1 - num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle(("Resultado Subtração"));
                dialogo.setMessage("A Subtração é " + subtracao);

                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double multiplicacao = num1 * num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado Multiplicação");
                dialogo.setMessage("A Multiplicação é " + multiplicacao);

                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double divisao = num1 / num2;

                if(num2 == 0){
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Resultado Divisão");
                    dialogo.setMessage("Não existe divisão por ZERO");
                    dialogo.setNeutralButton("Ok", null);
                    dialogo.show();
                }
                else{
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Resultado Divisão");
                    dialogo.setMessage("A Divisão é " + divisao);
                    dialogo.setNeutralButton("Ok", null);
                    dialogo.show();
                }
            }
        });
    }
}