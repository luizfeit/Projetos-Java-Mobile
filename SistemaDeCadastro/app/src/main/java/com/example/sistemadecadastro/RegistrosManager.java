package com.example.sistemadecadastro;

import java.util.ArrayList;

public class RegistrosManager {

    private static ArrayList<Registro> aRegistro = null;

    public static  ArrayList<Registro> getRegistros(){
        if(aRegistro == null){
            aRegistro = new ArrayList<Registro>();
        }
        return aRegistro;
    }
}
