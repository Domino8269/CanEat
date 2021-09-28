package com.example.caneat;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro); // xml파일과 자바파일 연결
        Handler handler=new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent (getApplicationContext(), SelectActivity.class);
                startActivity(intent); //인트로 실행후 MainActivity 실행
                finish();
            }
        },1500); //1.5초후 인트로 실행

    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
        //멈추는 함수
    }

}

