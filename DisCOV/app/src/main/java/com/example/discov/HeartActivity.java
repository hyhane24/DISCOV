package com.example.discov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HeartActivity extends AppCompatActivity {
    String what3wordsKEY = "4J9TTZM9";
    String fitbitOAuth = "22C8FZ";
    String fitbitClientSecret = "0f7e61602ee2dccf8b5e0257390c0786";
    String fitbitOAuthURL = "https://www.fitbit.com/oauth2/authorize";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
        Button homebtn = (Button) findViewById(R.id.buttonHome);
        homebtn.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        });
        Button grabtn = (Button) findViewById(R.id.buttonGraph);
        grabtn.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), GraphActivity.class);
            startActivity(intent);
        });
        Button hearbtn = (Button) findViewById(R.id.buttonHeart);
        hearbtn.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), HeartActivity.class);
            startActivity(intent);
        });
        Button chkbtn = (Button) findViewById(R.id.buttonCheck);
        chkbtn.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), CheckActivity.class);
            startActivity(intent);
        });
        Button notibtn = (Button) findViewById(R.id.buttonNoti);
        notibtn.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), NotiActivity.class);
            startActivity(intent);
        });
    }
}