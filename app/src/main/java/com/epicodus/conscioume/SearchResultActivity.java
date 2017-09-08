package com.epicodus.conscioume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SearchResultActivity extends AppCompatActivity {
    private TextView mSearchResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        mSearchResultTextView = (TextView) findViewById(R.id.searchResultTextView);
        Intent intent = getIntent();
        String itemsearch = intent.getStringExtra("itemsearch");
        mSearchResultTextView.setText("Here are the results for your searched item: " + itemsearch);
    }
}
