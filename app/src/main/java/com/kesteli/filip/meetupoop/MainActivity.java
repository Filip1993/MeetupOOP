package com.kesteli.filip.meetupoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kesteli.filip.meetupoop.drzave.Drzava;
import com.kesteli.filip.meetupoop.drzave.Portugal;

public class MainActivity extends AppCompatActivity {

    private Drzava drzava;
    private Button btnPortugal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drzava = new Portugal();

        initViews();
        setupListeners();
    }

    private void initViews() {
        btnPortugal = (Button) findViewById(R.id.btnPortugal);
    }

    private void setupListeners() {
        btnPortugal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BDP: " + drzava.BDP(1000, 234, 2), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

