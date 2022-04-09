package com.shayekh.android.students;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student extends AppCompatActivity {
    private Button fromCampus,fromDhaka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        fromCampus=(Button)findViewById(R.id.fromCampus);
        fromDhaka=(Button)findViewById(R.id.fromDhaka);
        fromCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Student.this,SCampusToDhaka.class);
                startActivity(intent);
            }
        });

        fromDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Student.this,SDhakaToCampus.class);
                startActivity(intent);

            }
        });
    }
}
