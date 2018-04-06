package com.example.theoo.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by theoo on 11/9/2017.
 */

public class Register_adminActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
    }
    public void admin_home(View v)
    {
        Intent i=new Intent(this,Admin_homeActivity.class);
        finish();
        startActivity(i);
    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this,MayankActivity.class);
        startActivity(intent);
    }
}
