package com.example.aliothman.sec4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView te1 , te2 , te3 , te4;
    String que1 , que2 , que3;
    String Answer1 = String.valueOf(1);
    String Answer2 = String.valueOf(2);
    String Answer3 = String.valueOf(3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        te1 = findViewById(R.id.textView8);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bund1");
        String Ans1 = bundle.getString("ans1");
        String Ans2 = bundle.getString("ans1");
        String Ans3 = bundle.getString("ans1");
         que1 = bundle.getString("q1");
         que2 = bundle.getString("q2");
         que3 = bundle.getString("q3");
        check(Ans1 ,Ans2 , Ans3);

    }

    public void  check(String str1 , String str2 , String str3){
        if(str1 == Answer1 && str2 == Answer2 && str3 == Answer3 ){
            te1.setText(String.valueOf(3));
        }else if(str1 == Answer1&& str2 == Answer2 || str3 == Answer3){
            te1.setText(String.valueOf(2));
        }else  if(str1 == Answer1|| str2 == Answer2 && str3 == Answer3){
            te1.setText(String.valueOf(2));
        }else  if(str1 == Answer1|| str2 == Answer2 || str3 == Answer3){
            te1.setText(String.valueOf(1));
        }

    }
}
