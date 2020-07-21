package id.java.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Panduan extends AppCompatActivity {
    private LinearLayout btnLarangan, btnPersiapan, btnPHaji, btnPUmroh;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduan);
        btnLarangan=findViewById(R.id.btnLarangan);
        btnPersiapan=findViewById(R.id.btnPersiapan);
        btnPHaji=findViewById(R.id.btnPHaji);
        btnPUmroh=findViewById(R.id.btnPUmroh);

        btnLarangan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Panduan.this, Larangan.class);
                Panduan.this.startActivity(myIntent);
            }
        });


        btnPersiapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Panduan.this, Persiapan.class);
                Panduan.this.startActivity(myIntent);
            }
        });



        btnPHaji.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Panduan.this, PHaji.class);
                Panduan.this.startActivity(myIntent);
            }
        });


        btnPUmroh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent myIntent = new Intent(Panduan.this, PUmroh.class);
                Panduan.this.startActivity(myIntent);
            }
        });


    }
}