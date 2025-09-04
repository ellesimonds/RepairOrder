package com.example.repairorder;

//import static kotlin.text.ScreenFloatValueRegEx.value;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    double numbers = 0.0;

    TextView totalTextView;
    TextView subtotalTextView;
    EditText orderInputTV;
    TextView paintInputTV;

    Button submitB;


    //create listener
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random gen = new Random();

            double number = gen.nextDouble();
            String v1 = "$" + number;
            totalTextView.setText(v1);

            // this is to set the name; done also in hardcode; totalTextView.setText(R.string.dollarempty);
            String value = totalTextView.getText().toString();

            String orderTypeValue = orderInputTV.getText().toString();

            //String
        }
    };


        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

            subtotalTextView = findViewById(R.id.subtotalCalculation);
            totalTextView = findViewById(R.id.totalCalculation);
            submitB = findViewById(R.id.submitButton);
            submitB.setOnClickListener(buttonListener);
            orderInputTV = findViewById(R.id.ordertypeInput);
            paintInputTV = findViewById(R.id.paintInput);
            //Log.i("TEST", String.valueOf(value));
        }
}