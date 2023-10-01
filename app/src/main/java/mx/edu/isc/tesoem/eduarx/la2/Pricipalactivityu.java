package mx.edu.isc.tesoem.eduarx.la2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Pricipalactivityu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricipalactivityu);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
           Intent lanzar = new Intent(Pricipalactivityu.this, SecurityException.class);
           Intent cargarmenu = new Intent(Pricipalactivityu.this, Menuactivity.class);
           startActivity(cargarmenu);
           finish();
            }
        },4000);
    }
}