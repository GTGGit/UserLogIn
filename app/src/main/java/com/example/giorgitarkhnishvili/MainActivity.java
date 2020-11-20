package com.example.giorgitarkhnishvili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void OnButtonClicked (View view){
        EditText FirstName = (EditText) findViewById(R.id.FNEditText);
        EditText LastName = (EditText) findViewById(R.id.LNEditText);
        EditText Age = (EditText) findViewById(R.id.AgeEditText);

        if (FirstName.getText().toString().isEmpty() || LastName.getText().toString().isEmpty() || Age.getText().toString().isEmpty()){
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
        }
        else if (Integer.parseInt(Age.getText().toString()) < 1){
            Toast.makeText(this, "Can't enter anything below one", Toast.LENGTH_SHORT).show();
            Age.setText("");
        }
        else if (Integer.parseInt(Age.getText().toString()) < 18){
            Toast.makeText(this, "Must be 18 or older", Toast.LENGTH_SHORT).show();
            Age.setText("");
        }
        else {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
            User newUser = new User(FirstName.getText().toString(),LastName.getText().toString(),Integer.parseInt(Age.getText().toString()));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
