package com.example.projetoalternatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.botaoParar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamarParar();
            }
        });

    }

    private void chamarParar() {
        startActivity(new Intent(this,SecundaryActivity.class));
    }
}
