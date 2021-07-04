package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class Pembayaran3 extends AppCompatActivity {

    private TextView ednama3, edID3, edEmail3, edJumlah3, ednohp3;
    private MaterialButton fab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran3);


        ednama3 = (TextView)findViewById(R.id.edNama3);
        edID3 = (TextView)findViewById(R.id.edID3);
        edEmail3 = (TextView)findViewById(R.id.edEmail3);
        edJumlah3 = (TextView)findViewById(R.id.edJumlah3);
        ednohp3 = (TextView)findViewById(R.id.ednohp3);
        fab3 = findViewById(R.id.fabPesan3);

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ednama3.getText().toString().isEmpty() ||
                        edID3.getText().toString().isEmpty() ||
                        edEmail3.getText().toString().isEmpty() ||
                        edJumlah3.getText().toString().isEmpty()||
                        ednohp3.getText().toString().isEmpty())
                {
                    Snackbar.make(v,"Isi seluruh data", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Pemesanan Berhasil...", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}