package id.java.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
    private ImageView ivBanner;
    private LinearLayout btnPanduan, btnTentang, btnPromo, btnPaket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btnPanduan=findViewById(R.id.btnPanduan);
        ivBanner=findViewById(R.id.ivBanner);
        btnTentang=findViewById(R.id.btnTentang);
        btnPromo=findViewById(R.id.btnPromo);
        btnPaket=findViewById(R.id.btnPaket);

        btnPanduan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Home.this, Panduan.class);
                Home.this.startActivity(myIntent);
            }
        });



        ivBanner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Home.this, DetailActivity.class);
                Home.this.startActivity(myIntent);
            }
        });


        btnTentang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Home.this, Tentang.class);
                Home.this.startActivity(myIntent);
            }
        });


        btnPaket.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Home.this, Paket.class);
                Home.this.startActivity(myIntent);
            }
        });

        btnPromo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Home.this, Promo.class);
                Home.this.startActivity(myIntent);
            }
        });





    }
}