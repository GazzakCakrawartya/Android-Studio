package com.smkrevit.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Barang extends AppCompatActivity {

    TextView tvbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);
        load();
        ambildata();
    }

    public void load(){
        tvbarang = findViewById(R.id.tvBarang);
    }

    public void ambildata(){
        String ambil = getIntent().getStringExtra("ISI");
        tvbarang.setText(ambil);
    }
}