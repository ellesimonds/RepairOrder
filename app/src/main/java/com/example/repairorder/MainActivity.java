package com.example.repairorder;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    double numbers = 0.0;

    @Override


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView totalTextView = findViewById(R.id.totalCalculation);

        Random gen = new Random();

        double number = gen.nextDouble();
        String v1 = "$"+number;
        totalTextView.setText(v1);

        // this is to set the name; done also in hardcode; totalTextView.setText(R.string.dollarempty);
        String value = totalTextView.getText().toString();


        Log.i("TEST", value);



    }

}