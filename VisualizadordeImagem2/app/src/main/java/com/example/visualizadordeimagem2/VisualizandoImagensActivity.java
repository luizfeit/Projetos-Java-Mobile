package com.example.visualizadordeimagem2;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;
import android.view.*;

public class VisualizandoImagensActivity extends Activity {

    ImageSwitcher imgFoto, imgSobre;
    Button btanterior, btproximo;
    int indice = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizando_imagens);

        //Carregando o Objeto de animação de entrada da Imagem
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        //Carregando o Objeto de animação de saída de imagem:
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        imgFoto = (ImageSwitcher) findViewById(R.id.imgFoto);
        imgFoto.setInAnimation(in);
        imgFoto.setOutAnimation(out);

        btanterior = (Button) findViewById(R.id.btanterior);
        btproximo = (Button) findViewById(R.id.btproximo);



        imgFoto.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                    myView.setScaleType(ImageView.ScaleType.FIT_XY);
                    myView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                            ActionBar.LayoutParams.WRAP_CONTENT));
                    return myView;

            }
        });

        imgSobre = (ImageSwitcher) findViewById(R.id.imgSobre);
        imgSobre.setInAnimation(in);
        imgSobre.setOutAnimation(out);

        imgSobre.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                myView.setScaleType(ImageView.ScaleType.FIT_XY);
                myView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                        ActionBar.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });

        //Para carregar a foto do Dead Pool
        imgFoto.setImageResource(R.drawable.foto_deadpool);
        //Para carregar a info sobre Dead Pool
        imgSobre.setImageResource((R.drawable.frase_sobre_deadpool));

        btanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(indice > 1){
                    indice--;
                    mostrarInfoPersonagem();
                }
            }
        });

        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(indice < 3){
                    indice++;
                    mostrarInfoPersonagem();
                }
            }
        });

    }
    public void mostrarInfoPersonagem(){
        switch (indice){
            case 1: {
                imgFoto.setImageResource(R.drawable.foto_deadpool);
                imgSobre.setImageResource(R.drawable.frase_sobre_deadpool);
            }break;
            case 2: {
                imgFoto.setImageResource(R.drawable.foto_colossus);
                imgSobre.setImageResource(R.drawable.frase_sobre_colossus);
            }break;
            case 3: {
                imgFoto.setImageResource(R.drawable.foto_megasonico);
                imgSobre.setImageResource(R.drawable.frase_sobre_megasonico);
            }break;
        }

    }

}