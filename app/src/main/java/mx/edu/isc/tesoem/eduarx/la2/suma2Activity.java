package mx.edu.isc.tesoem.eduarx.la2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class suma2Activity extends AppCompatActivity {
   EditText num1, num2;
   TextView lblresultado;
   Button btncalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma2);
        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.lblresultado);
        lblresultado = findViewById(R.id.lblresultado);
    }
    public void calculaoperacion(View v){
        Integer n1,n2;
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parsenInt(num2.getText().toString());
        lblresultado.setText(String.valueOf());
    }
}