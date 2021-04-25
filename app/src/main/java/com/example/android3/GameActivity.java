package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        editText  = findViewById(R.id.answer_tv);
        Button send_bottom = findViewById(R.id.send_Bottom);
        send_bottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (editText.getText().toString().equals("35")){
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

    public void NextLevel(View view) {
        Intent intent = new Intent(GameActivity.this,LevelSecond.class);
        startActivity(intent);
    }
}