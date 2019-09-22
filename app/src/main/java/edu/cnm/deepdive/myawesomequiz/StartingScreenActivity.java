package edu.cnm.deepdive.myawesomequiz;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StartingScreenActivity extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_starting_screen);

    Button buttonStartQuiz = findViewById(R.id.button_start_quiz);
      buttonStartQuiz.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
          startQuiz();
        }
      });
    }

    private void startQuiz() {
      Intent intent = new Intent(StartingScreenActivity.this, QuizActivity.class);
      startActivity(intent);
    }
  }

