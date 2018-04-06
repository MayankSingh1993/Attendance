package com.example.theoo.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by theoo on 11/9/2017.
 */

public class TestActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage);
    }
    public void log_out(View v)
    {

        Intent i = new Intent(this,MayankActivity.class);
        finish();
        startActivity(i);
    }
    public void manage_stud(View v)
    {
        Intent i = new Intent(this,ManageActivity.class);
        finish();
        startActivity(i);
    }
    public void mark_att(View v)
    {
        Intent i = new Intent(this,AttendanceActivity.class);
        startActivity(i);
    }
    public void view_att(View v)
    {
        Intent i = new Intent(this,ViewActivity.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this,TestActivity.class);
        finish();
        startActivity(intent);
    }

}
