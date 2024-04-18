package com.example.pregunta1tabla;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.view.Gravity;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TableLayout;
import java.util.Random;
import android.widget.TableRow;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        Random random = new Random();
        // Agregar los títulos de la tabla


        for (int i = 0; i < 12; i++) {
            int yards = 4 + random.nextInt(12); // Genera un valor aleatorio entre 4 y 15
            int feet = yardsToFeet(yards);
            int inches = feetToInches(feet);

            TableRow row = new TableRow(this);
            row.addView(createTextView(String.valueOf(yards)));
            row.addView(createTextView(String.valueOf(feet)));
            row.addView(createTextView(String.valueOf(inches)));
            tableLayout.addView(row);
        }

    }
    private TextView createTextView(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(18);
        textView.setPadding(20, 35, 20, 35); // Añade un poco de espacio alrededor del texto
        return textView;
    }


        public static int yardsToFeet(int yards) {
            return yards * 3;
        }

        public static int feetToInches(int feet) {
            return feet * 12;
        }

}