package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class Pembayaran2 extends AppCompatActivity {

    private TextView ednama2, edID2, edEmail2, edJumlah2, ednohp2;
    private MaterialButton fab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran2);

        ednama2 = (TextView)findViewById(R.id.edNama2);
        edID2 = (TextView)findViewById(R.id.edID2);
        edEmail2 = (TextView)findViewById(R.id.edEmail2);
        edJumlah2 = (TextView)findViewById(R.id.edJumlah2);
        ednohp2 = (TextView)findViewById(R.id.ednohp2);
        fab2 = findViewById(R.id.fabPesan2);

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ednama2.getText().toString().isEmpty() ||
                        edID2.getText().toString().isEmpty() ||
                        edEmail2.getText().toString().isEmpty() ||
                        edJumlah2.getText().toString().isEmpty()||
                        ednohp2.getText().toString().isEmpty())
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