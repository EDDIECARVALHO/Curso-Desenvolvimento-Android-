package com.ederson.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.ederson.applistacurso.model.Pessoa;
import com.ederson.applistacurso.view.MainActivity;

public class PessoaController {
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";


    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        SharedPreferences.Editor listaVip;
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {

        int mvcController = Log.d("MVC_Controller", "Controller iniciada");


        return super.toString();


    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobreNome());
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
        listaVip.apply();

    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobreNome", ""));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", ""));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", ""));

        return pessoa;
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();

    }
}
