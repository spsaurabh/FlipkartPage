package com.firstapp.flipkartui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    EditText editText;
    ImageView Img;
    InputMethodManager inputMethodManager;
    private View v;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.file_01);
        searchView = findViewById(R.id.searchview);
        SearchView searchView2= (SearchView) findViewById(R.id.searchview);
        getSupportActionBar().hide();
        int id = searchView.getContext()

                .getResources()
                .getIdentifier("android:id/search_src_text", null, null);
        TextView textView = (TextView) searchView.findViewById(id);
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(13);

        Img = findViewById(R.id.imageView16);
        Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Notification.class);
                startActivity(intent);
            }
        });
    }

}