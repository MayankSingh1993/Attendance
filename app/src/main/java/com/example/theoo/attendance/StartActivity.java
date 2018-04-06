package com.example.theoo.attendance;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by theoo on 11/9/2017.
 */

public class StartActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home);
        askForPermission(Manifest.permission.SEND_SMS,SMS1);
        ImageView img=  findViewById(R.id.imageView);
        img.setOnClickListener(this);
     }
    static final Integer SMS1 = 0x1;
    private void askForPermission(String permission, Integer requestCode) {
        if (ContextCompat.checkSelfPermission(StartActivity.this, permission) != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(StartActivity.this, permission)) {

                //This is called if user has denied the permission before
                //In this case I am just asking the permission again
                ActivityCompat.requestPermissions(StartActivity.this, new String[]{permission}, requestCode);

            } else {

                ActivityCompat.requestPermissions(StartActivity.this, new String[]{permission}, requestCode);
            }
        }
    }
     @Override
    public void onClick(View v){
         Intent i= new Intent(this,MayankActivity.class);
         finish();
         startActivity(i);

     }

    public void onBackPressed()
    {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}
