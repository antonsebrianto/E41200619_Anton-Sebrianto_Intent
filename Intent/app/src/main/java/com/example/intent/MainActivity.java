package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Implicit Intent
    // Intent panggil yang digunakan untuk telepon dial admin
    public void panggil(View view) {
        String nomor = "082228905435" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    // Intent whatsapp yang digunakan untuk chat admin melalui whatsapp
    public void whatsapp(View view) {
        String url = "https://wa.me/6282228905435" ;
        Intent whatsapp = new Intent(Intent. ACTION_VIEW);
        whatsapp.setData(Uri. parse(url));
        startActivity(whatsapp);
    }

    // Explicit Intent
    public void about(View view) {
        Intent tentang= new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }
}