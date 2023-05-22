package com.example.projetoalternatela;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecundaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_secundary);
        findViewById(R.id.botaoAndar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamarAndar();
            }
        });
    }
private void chamarAndar() {
finish();
    }
}
