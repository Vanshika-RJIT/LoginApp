package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button b;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Name=findViewById(R.id.edittext1);
        Password=findViewById(R.id.editText2);
        b=findViewById(R.id.button1);
        Info=findViewById(R.id.textview1);
        Info.setText("No. of Attempts remaining:5");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });


    }
    private void validate(String userName,String userPassword)

    {
        if(userName.equals("Vanshika Sikarwar")&&(userPassword.equals("traditional2183")))
        {
            Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(i);
        }
        else if(userName.equals("")&&(userPassword.equals("")))
        {Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(i);

        }
        else {
            counter--;
            Info.setText("No. of attempts remaining"+String.valueOf(counter));
            if(counter==0)
            {
                b.setEnabled(false);
            }
        }
    }}
