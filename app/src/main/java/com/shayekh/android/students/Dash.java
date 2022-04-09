package com.shayekh.android.students;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Dash extends AppCompatActivity {

  private LinearLayout findbus,transport,teacher,student;
  Button locationsharing;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dash);
    findbus=(LinearLayout) findViewById(R.id.findBus);
    transport=(LinearLayout)findViewById(R.id.office);
    teacher=(LinearLayout)findViewById(R.id.teacher);
    student=(LinearLayout)findViewById(R.id.student);
    locationsharing=(Button)findViewById(R.id.locationsharing);
    findbus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent=new Intent(Dash.this,MainActivity.class);
        startActivity(intent);
      }
    });

    transport.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String phone = "7791045";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
      }
    });

    teacher.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Dash.this, Teacher.class);
            startActivity(intent);

        }
    });

    student.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent=new Intent(Dash.this, Student.class);
        startActivity(intent);

      }
    });

    locationsharing.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.shayekh.android.realtimelocationtracking");
        if (launchIntent != null) {
          startActivity(launchIntent);//null pointer check in case package name was not found
        }

      }
    });
  }
}
