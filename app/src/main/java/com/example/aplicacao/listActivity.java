package com.example.aplicacao;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class listActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.lista);

        recyclerView = findViewById(R.id.recyclerView_lista);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        // setar o adpater

        Adapter adapter = new Adapter<>();
//        RecyclerView adapter;
        adapter = new RecyclerView(this, recyclerView, false);
        recyclerView.setAdapter(RecyclerView.Adapter);
        }
//        RecyclerView.Adapter adapter = new RecyclerView();

    }
}
