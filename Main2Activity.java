package com.example.jyxem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.content_battle_fighting);
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this, battle_fighting.class);
                startActivity(intent);
                Main2Activity.this.finish();
            }

        });

    }

}
