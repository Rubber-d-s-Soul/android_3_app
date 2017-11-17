package com.example.daisuke.android_third_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getOmikuji(View view){
        //TextView の取得
        TextView tv = findViewById(R.id.myTextView);
        String[]  results = {
                "大吉",
                "吉",
                "凶"
        };

        //乱数の生成
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(results.length);

        //結果の表示
        //String result = Integer.toString(num);

        /*
        *Color.RED
        * Color.BLACK
        *Color.rgb(255,0,0)
        * Color.argba(0,0,0,0)
        * Color.parseColor("#ff0000")
        * */

        if(num == 0){
            tv.setTextColor(Color.RED);
        }else{
            tv.setTextColor(Color.rgb(0,0,0));
        }

        tv.setText(results[num]);
    }
}
