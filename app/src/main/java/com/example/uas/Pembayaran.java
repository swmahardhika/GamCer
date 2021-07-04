package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class Pembayaran extends AppCompatActivity {
    private TextView ednama, edID, edEmail, edJumlah, ednohp;
    private MaterialButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        ednama = (TextView)findViewById(R.id.edNama);
        edID = (TextView)findViewById(R.id.edID);
        edEmail = (TextView)findViewById(R.id.edEmail);
        edJumlah = (TextView)findViewById(R.id.edJumlah);
        ednohp = (TextView)findViewById(R.id.ednohp);
        fab = findViewById(R.id.fabPesan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ednama.getText().toString().isEmpty() ||
                edID.getText().toString().isEmpty() ||
                edEmail.getText().toString().isEmpty() ||
                edJumlah.getText().toString().isEmpty()||
                ednohp.getText().toString().isEmpty())
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