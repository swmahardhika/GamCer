package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cvml, cvvalo, cvpubg, cvcsgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvml = (CardView) findViewById(R.id.cvAddML);
        cvvalo = (CardView) findViewById(R.id.cvAddval);
        cvpubg = (CardView) findViewById(R.id.cvAddpubg);
        cvcsgo = (CardView) findViewById(R.id.cvAddcsgo);


        cvml.setOnClickListener(this);
        cvvalo.setOnClickListener(this);
        cvpubg.setOnClickListener(this);
        cvcsgo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.cvAddML:
                i = new Intent(this, Pembayaran.class);
                startActivity(i);
                break;

            case R.id.cvAddval:
                i = new Intent(this, Pembayaran2.class);
                startActivity(i);
                break;

            case R.id.cvAddpubg:
                i = new Intent(this, Pembayaran3.class);
                startActivity(i);
                break;

            case R.id.cvAddcsgo:
                i = new Intent(this, Pembayaran4.class);
                startActivity(i);
                break;
        }

    }
}

