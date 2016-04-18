package com.example.gjbsilva.exemploparametros;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.*;

public class ActSegundaTela extends AppCompatActivity implements View.OnClickListener {

    private EditText edtValor;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_segunda_tela);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnFechar = (Button) findViewById(R.id.btnFechar);

        btnFechar.setOnClickListener(this); //registrando o evento para o botão

        Bundle bundle = getIntent().getExtras();//vai pegar o valor digitado na 1 tela do activity
        //verificar se o parametro que passou na 1 tela da classe Intent ela existe
        if(bundle.containsKey("VALOR")){//se contem a chave chamada VALOR
            String valor = bundle.getString("VALOR");//ira recuperar o valor que foi digitado que é uma String
            edtValor.setText(valor);//irá exibir o valor digitado na 1 activity na caixa de texto da 2 tela
        }
    }

    //Botão fechar
    @Override
    public void onClick(View v) {
        //comando para finalizar a tela
        finish();

    }
}
