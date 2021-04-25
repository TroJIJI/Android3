package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LevelSecond extends AppCompatActivity {
EditText editText;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_second2);
        editText  = findViewById(R.id.answer_second);
        Button send = findViewById(R.id.send);
       send.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (editText.getText().toString().equals("28")){
                   answerSecond();
               }else {
                   answer();
               }
           }
       });
    }
    private  void answer(){
        Toast.makeText(this, "Вы не угадали", Toast.LENGTH_SHORT).show();
    }
    private void answerSecond(){
        Toast.makeText(this, "Вы угадали", Toast.LENGTH_SHORT).show();

    }
}