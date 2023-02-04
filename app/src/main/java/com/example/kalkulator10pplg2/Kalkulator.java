package com.example.kalkulator10pplg2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    double angka1, angka2, hasil;
    EditText txtNumber1, txtNumber2;
    Button plusButton, minusButton, timesButton, dividedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        txtNumber1 = (EditText) findViewById(R.id.txtNumber1);
        txtNumber2 = (EditText) findViewById(R.id.txtNumber2);

        plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((txtNumber1.getText().length()>0) && txtNumber2.getText().length()>0){
                    angka1 = Integer.parseInt(txtNumber1.getText().toString());
                    angka2 = Integer.parseInt(txtNumber2.getText().toString());
                    hasil = angka1 + angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Kalkulator.this, "Masukan Angka", Toast.LENGTH_LONG).show();
                }
            }
        });

        minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((txtNumber1.getText().length()>0) && txtNumber2.getText().length()>0){
                angka1 = Integer.parseInt(txtNumber1.getText().toString());
                angka2 = Integer.parseInt(txtNumber2.getText().toString());
                hasil = angka1 - angka2;
                Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(Kalkulator.this, "Masukan Angka", Toast.LENGTH_LONG).show();
                }
            }
        });

        dividedButton = (Button) findViewById(R.id.dividedButton);
        dividedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((txtNumber1.getText().length()>0) && txtNumber2.getText().length()>0){
                    angka1 = Integer.parseInt(txtNumber1.getText().toString());
                    angka2 = Integer.parseInt(txtNumber2.getText().toString());
                    hasil = angka1 / angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Kalkulator.this, "Masukan Angka", Toast.LENGTH_LONG).show();
                }
            }
        });

        timesButton = (Button) findViewById(R.id.timesButton);
        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((txtNumber1.getText().length()>0) && txtNumber2.getText().length()>0){
                    angka1 = Integer.parseInt(txtNumber1.getText().toString());
                    angka2 = Integer.parseInt(txtNumber2.getText().toString());
                    hasil = angka1 * angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Kalkulator.this, "Masukan Angka", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}