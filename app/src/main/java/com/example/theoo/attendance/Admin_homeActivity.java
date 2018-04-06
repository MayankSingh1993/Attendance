package com.example.theoo.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Admin_homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);

    }
    public void manage_stud(View v)
    {
        Intent i= new Intent(this,StudentActivity.class);
        finish();
        startActivity(i);
    }
    public void manage_fac(View v)
    {
        Intent i= new Intent(this,FacultyActivity.class);
        finish();
        startActivity(i);
    }

    public void log_out(View v)
    {
        Intent i=new Intent(this,MayankActivity.class);
        finish();
        startActivity(i);
    }
    @Override
    public void onBackPressed()
    {
        Intent i= new Intent(this,Admin_homeActivity.class);
        finish();
        startActivity(i);
    }
}
