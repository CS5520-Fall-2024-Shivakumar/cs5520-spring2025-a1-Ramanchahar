package com.example.numad25sp_ramanlnu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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

        // Initialize the About Me button using lambda expression
        Button aboutMeButton = findViewById(R.id.btnAboutMe);
        aboutMeButton.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Name: Raman Lnu \nEmail: lnu.raman@northeastern.edu",
                        Toast.LENGTH_LONG).show()
        );
    }
}