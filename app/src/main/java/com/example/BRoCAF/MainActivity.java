package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
    private ImageButton ButtonBoba;
    private ImageButton ButtonFood;
    private ImageButton ButtonDrink;
    private ImageButton ButtonHotdrink;
    private ImageButton ButtonTambahHP;
    private ImageButton ButtonKeranjang;
=======
    private ImageButton btnPelanggan, btnKaryawan;
>>>>>>> e15d9b35afcd6f39c6573dd6df98702a6d451437

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        ButtonBoba = findViewById(R.id.Button_Boba);
        ButtonFood = findViewById(R.id.Button_Food);
        ButtonDrink = findViewById(R.id.Button_Drink);
        ButtonHotdrink = findViewById(R.id.Button_Hotdrink);
        ButtonTambahHP = findViewById(R.id.Button_tambahHP);
        ButtonKeranjang = findViewById(R.id.Button_Keranjang);

        ButtonBoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BobaActivity.class);
                startActivity(intent);
            }
        });
        ButtonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MakananActivity.class);
                startActivity(intent);
            }
        });
        ButtonDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SquashAndFloatActivity.class);
                startActivity(intent);
            }
        });
        ButtonHotdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HotDrinksActivity.class);
                startActivity(intent);
            }
        });
//        BELUM
//        ButtonTambahHP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, )
//            }
//        });
        ButtonKeranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_activity.class);
=======
        btnPelanggan = findViewById(R.id.Button_Pelanggan);
        btnKaryawan = findViewById(R.id.Button_Pemilik);

        btnKaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnPelanggan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, qrcode1_activity.class);
>>>>>>> e15d9b35afcd6f39c6573dd6df98702a6d451437
                startActivity(intent);
            }
        });
    }

}