package com.example.rishabh.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        CheckBox chkIos = (CheckBox) findViewById(R.id.is_orga);

        chkIos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                {
                    EditText orgaName = (EditText)findViewById(R.id.orga_name);
                    TextView orgaNameLabel = (TextView) findViewById(R.id.orga_name_text);

                    orgaName.setVisibility(View.VISIBLE);
                    orgaNameLabel.setVisibility(View.VISIBLE);
                }
                else
                {
                    EditText orgaName = (EditText)findViewById(R.id.orga_name);
                    TextView orgaNameLabel = (TextView) findViewById(R.id.orga_name_text);

                    orgaNameLabel.setVisibility(View.VISIBLE);
                    orgaName.setVisibility(View.GONE);
                }
            }
        });

        Button submit = (Button) findViewById(R.id.btnRegister);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}