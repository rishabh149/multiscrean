package com.example.mymultiscreenapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   // private Button button;
    private EditText ed;
    public static final String key="asdf";
     Intent in=new Intent(this,MainActivity2.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // button = findViewById(R.id.button);
    }
    public  void onclick(View vi){
        ed=findViewById(R.id.ed);
        String s=ed.getText().toString();



    }
}