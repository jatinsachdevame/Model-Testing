package com.example.modeltesting;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private EditText inputMessage;
    private Toolbar toolbar;
    private TextView userTV;
    private TextView chatBotTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputMessage = findViewById(R.id.inputMessage);
        inputMessage.requestFocus();

        applyToolbarChanges();

        userTV = findViewById(R.id.userTV);
        chatBotTV = findViewById(R.id.chatBotTV);
    }

    private void applyToolbarChanges() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Model Testing");
        toolbar.inflateMenu(R.menu.menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void sendMessage(View view) {
        String message = inputMessage.getText().toString();
        if(message.equals("")) {
            Toast.makeText(this, "Message can't be empty.", Toast.LENGTH_SHORT).show();
        } else {
            userTV.setText(message);
            String output = modelOutput(message);
            chatBotTV.setText(output);
        }
    }

    private String modelOutput(String message) {
        String output = "Testing";
        //Todo: Just implement this modelOutput method after doing the intregration part and
        //TODO: just return the output of the model as a string.

        return output;
    }
}
