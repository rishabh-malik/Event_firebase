package com.example.rishabh.event;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreatePost extends AppCompatActivity {
    private EditText name;
    private EditText location;
    private EditText datetime;
    private EditText count;
    private EditText disp;
    private EditText tag;
    private ImageView back;
    private TextView button;
    // firebase database instances
    private FirebaseDatabase database;
    private DatabaseReference mFirebaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
        name = (EditText) findViewById(R.id.editText);
        location= (EditText) findViewById(R.id.textView4);
        datetime = (EditText) findViewById(R.id.textView3);
//        count= (EditText) findViewById(R.id.editText);
        disp = (EditText) findViewById(R.id.textView5);
        tag = (EditText) findViewById(R.id.editText2);
        button = (TextView) findViewById(R.id.textView6);

        //Initializing Firebase Object
        database = FirebaseDatabase.getInstance();

        mFirebaseReference = database.getReference().child("events");




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Data
                Post post =new Post(location.getText().toString(),
                        disp.getText().toString(),
                        name.getText().toString(),
                       "#" + tag.getText().toString(),
                        datetime.getText().toString(),30);
                mFirebaseReference.push().setValue(post);
                Intent intent = new Intent(CreatePost.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        back = (ImageView) findViewById(R.id.imageView3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreatePost.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
