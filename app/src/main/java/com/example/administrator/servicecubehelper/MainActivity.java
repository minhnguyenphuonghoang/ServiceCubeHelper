package com.example.administrator.servicecubehelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.usercreator.UserCreator;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        switchOnUserCreatorActivity();
    }






    public void switchOnUserCreatorActivity(View v){
        Toast.makeText(MainActivity.this, "Switched to USER CREATOR activity", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, UserCreator.class));
    }








}
