package com.ederson.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.ederson.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        int mvcController = Log.d("MVC_Controller", "Controller iniciada");


        return super.toString();


    }
    public void salvar(Pessoa pessoa){
         Log.d("MVC_Controller", "Salvo: "+pessoa.toString());

    }

}
