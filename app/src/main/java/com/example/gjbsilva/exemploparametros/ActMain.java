package com.example.gjbsilva.exemploparametros;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.*;

public class ActMain extends AppCompatActivity implements View.OnClickListener {

    private EditText edtValor;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);//método setContentView() exibir o objeto atribuído, nesse caso o layout da página

        //Recuperar as referencias
        edtValor = (EditText) findViewById(R.id.edtValor);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(this);//registrando o envento da ação para que ele funcione
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        //a classe Intent que é responsável por chamar as activitys, logo será necessario o import android.content
        //Chamar uma tela ou para comando de voz para pesquisar algo dentro do aparelho
        Intent objetoint = new Intent(this, ActSegundaTela.class);
        objetoint.putExtra("VALOR", edtValor.getText().toString());
        startActivity(objetoint);
    }
}
