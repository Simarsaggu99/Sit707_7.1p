package com.example.mylostandfound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;


public class FirstUI extends AppCompatActivity {
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ui);
        EditText postName, phoneNumber, itemDescription, itemDate, itemLoc;
        Button save = (Button)findViewById(R.id.save) ;

        postName = findViewById(R.id.textView3);
        phoneNumber = findViewById(R.id.textView5);
        itemDescription = findViewById(R.id.textView7);
        itemDate = findViewById(R.id.textView9);
        itemLoc = findViewById(R.id.textView11);

        dbHandler = new DBHandler(this);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHandler.addNewItem(postName.getText().toString(), phoneNumber.getText().toString(), itemDescription.getText().toString(), itemDate.getText().toString(), itemLoc.getText().toString());
                Toast.makeText(FirstUI.this, "Saved Successfully!!", Toast.LENGTH_SHORT).show();            }
        });

    }
}