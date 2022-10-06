package br.unigran.hello.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.unigran.hello.R;
import br.unigran.hello.fragmento.Primeiro;
import br.unigran.hello.fragmento.SegundoFragmento;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        getIntent().getStringExtra("Nome");
        setResult(80);

        Primeiro primeiro = new Primeiro(); //cria fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();//add fragmento
        transaction.add(R.id.idframe, primeiro);
        transaction.commit();//valida a adição

    }

    public void segundaTela(View view){
        getSupportFragmentManager().beginTransaction().add(R.id.idframe, new SegundoFragmento()).commit();
    }

    public void primeiraTela(View view){
        getSupportFragmentManager().beginTransaction().add(R.id.idframe, new Primeiro()).commit();
    }
}