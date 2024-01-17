package com.ederson.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ederson.applistacurso.R;
import com.ederson.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa; // pascalCase - camelCase
    String  dadosOutraPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteúdo, dados valores para o objeto
        // Conforme o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("EDIIE");
        pessoa.setSobreNome("Carvalho");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-98989595");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Carlos");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("11-333366");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Curso Desejado: ";
        dadosPessoa += "Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += "Curso Desejado: ";
        dadosOutraPessoa += "Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();
        int parada = 0;
    }
}