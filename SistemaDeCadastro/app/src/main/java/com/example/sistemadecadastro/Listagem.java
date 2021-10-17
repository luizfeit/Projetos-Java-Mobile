package com.example.sistemadecadastro;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;


public class Listagem extends Activity {

    Button btanterior, btproximo, btfechar;
    TextView txtnome, txttelefone, txtendereco, txtstatus;

    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        btanterior = (Button) findViewById(R.id.btanterior);
        btproximo = (Button) findViewById(R.id.btproximo);
        btfechar = (Button) findViewById(R.id.btfechar);

        txtnome = (TextView) findViewById(R.id.txtnome);
        txtendereco = (TextView) findViewById(R.id.txtendereco);
        txttelefone = (TextView) findViewById(R.id.txttelefone);
        txtstatus = (TextView) findViewById(R.id.txtstatus);

        PreencheCampos(index);
        AtualizaStatus(index);

        btanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index > 0){
                    index--;
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });

        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index < RegistrosManager.getRegistros().size() - 1){
                    index++;
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });

        btfechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Listagem.this.finish();
            }
        });

    }

    private void PreencheCampos(int idx){
        txtnome.setText(RegistrosManager.getRegistros().get(idx).getNome());
        txttelefone.setText(RegistrosManager.getRegistros().get(idx).getTelefone());
        txtendereco.setText(RegistrosManager.getRegistros().get(idx).getEndereco());
    }

    private void AtualizaStatus (int idx){
        int total = RegistrosManager.getRegistros().size();
        txtstatus.setText("Resistros: " + (idx+1 + "/" + total));
    }
}