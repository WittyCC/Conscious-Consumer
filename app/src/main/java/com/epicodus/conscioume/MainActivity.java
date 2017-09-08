package com.epicodus.conscioume;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mSearchItem;
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button center = (Button) findViewById(R.id.findItemButton);
        Button left = (Button) findViewById(R.id.aboutButton);
        Button right = (Button) findViewById(R.id.profileButton);

        mSearchItem = (EditText) findViewById(R.id.searchForm);

        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);

        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemsearch = mSearchItem.getText().toString();
                Log.d(TAG, itemsearch);
                Intent intent = new Intent(MainActivity.this, SearchResultActivity.class);
                intent.putExtra("itemsearch", itemsearch);
                startActivity(intent);
                }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your profile here", Toast.LENGTH_LONG).show();
            }
        });

        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
        Typeface champagneFont = Typeface.createFromAsset(getAssets(), "fonts/cac_champagne.ttf");
        mAppNameTextView.setTypeface(champagneFont);
    }
}
