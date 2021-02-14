package com.example.discov;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    String what3wordsKEY = "4J9TTZM9";
    String fitbitOAuth = "22C8FZ";
    String fitbitClientSecret = "0f7e61602ee2dccf8b5e0257390c0786";
    String fitbitOAuthURL = "https://www.fitbit.com/oauth2/authorize";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logbtn = (Button) findViewById(R.id.loginbtn);
        logbtn.setOnClickListener((v) -> {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
        });
    }
}