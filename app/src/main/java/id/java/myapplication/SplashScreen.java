package id.java.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // do something when the button is clicked
                        Intent myIntent = new Intent(SplashScreen.this, Login.class);
                        SplashScreen.this.startActivity(myIntent);
                    }
                },
                300);

    }
}