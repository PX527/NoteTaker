package com.newera.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button btnAddNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Log.d("Home","onPause called!");
        findViews();
        setListener();
    }

    private void findViews(){
        btnAddNote=findViewById(R.id.btnAddNote);

    }

    private void setListener(){
        btnAddNote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(Home.this,AddNoteActivity.class);
                startActivity(i);
            }


        });

    }
}
