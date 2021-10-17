package com.example.exemplocommenus;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_aplicacao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

        switch (item.getItemId()){

            case R.id.item_novo:
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Você selecionou o menu Novo!");
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
                break;

            case R.id.item_abrir:
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Você selecionou o menu Abrir!");
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
                break;

            case R.id.item_salvar_copia:
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Você selecionou o submenu Salvar Cópia!");
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
                break;

            case R.id.item_salvar_como:
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Você selecionou o submenu Salvar Como!");
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}