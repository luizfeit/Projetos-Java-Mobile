package com.example.sistemadecadastro;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    Button btcadastrousuario;
    Button btlistagemusuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcadastrousuario = (Button) findViewById(R.id.btcadastrar_usuario);
        btlistagemusuarios = (Button) findViewById(R.id.bt_listar_usuarios_cadastrados);

        btcadastrousuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTelaCadastro = new Intent(MainActivity.this, Cadastro.class);
                startActivity(intentTelaCadastro);
            }
        });

        btlistagemusuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RegistrosManager.getRegistros().size() == 0){
                    (new AlertDialog.Builder(MainActivity.this))
                            .setTitle("Aviso")
                            .setMessage("Não existe nenhum regisdtro cadastrado.")
                            .setNeutralButton("Ok",null)
                            .show();
                    return;
                }
                Intent intentTelaListagem = new Intent(MainActivity.this,Listagem.class);
                startActivity(intentTelaListagem);
            }
        });
    }
}