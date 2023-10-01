package mx.edu.isc.tesoem.eduarx.la2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menuactivity extends AppCompatActivity {
    Button btnsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
        btnsuma = findViewById(R.id.btsuma_p2);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cargarsumatoria = new Intent(Menuactivity.this, suma2Activity.class);
                startActivity(cargarsumatoria);
            }
        });

    }
}