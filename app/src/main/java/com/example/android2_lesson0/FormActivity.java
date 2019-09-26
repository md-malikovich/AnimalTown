package com.example.android2_lesson0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    static final String MY_KEY = "me_key";

    private EditText editTitle;
    private EditText editDesc;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editTitle = findViewById(R.id.editTitle);
        editDesc = findViewById(R.id.editDesc);
        save = findViewById(R.id.btnSave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editTitle.getText().toString().trim();
                String desc = editDesc.getText().toString().trim();
                Task task = new Task(title, desc);
                Intent intent = new Intent();
                intent.putExtra(MY_KEY, task);
                setResult(RESULT_OK, intent);
                finish();
                Log.d("ololo", "send task");
            }
        });
    }
}
