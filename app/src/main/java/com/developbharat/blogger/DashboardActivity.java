package com.developbharat.blogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void onBtnNewPostClick(View view){
        Intent i = new Intent(getApplicationContext(), NewPostActivity.class);
        startActivity(i);
    }

    public void onBtnPrivatePostsClick(View view){

    }

    public void onBtnPublicPostsClick(View view){

    }

}