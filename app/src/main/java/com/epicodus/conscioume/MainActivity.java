package com.epicodus.conscioume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private Button mFindItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button center = (Button) findViewById(R.id.findItemButton);
        Button left = (Button) findViewById(R.id.aboutButton);
        Button right = (Button) findViewById(R.id.profileButton);

        center.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Welcome to Conscious Consumer", Toast.LENGTH_LONG).show();
                }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Epicodus independent project for Android, September 8, 2017", Toast.LENGTH_LONG).show();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your profile here", Toast.LENGTH_LONG).show();
            }
        });
    }
}
