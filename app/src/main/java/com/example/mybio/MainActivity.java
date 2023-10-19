package com.example.mybio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSave;
    private TextView txtHobbies;
    private EditText edtHobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = findViewById(R.id.btnSave);
        txtHobbies = findViewById(R.id.txtHobbies);
        edtHobbies = findViewById(R.id.adtHobbies);

        //Raghad Commented

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hobbies = edtHobbies.getText().toString();
                if (! hobbies.isEmpty()){
                    txtHobbies.setText(hobbies);
                    txtHobbies.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}