package com.example.aliothman.sec4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1 , ed2 , ed3 ;
    TextView te1 , te2 , te3 ;
    String s1 , s2 , s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        te1 = findViewById(R.id.textView);
        te2 = findViewById(R.id.textView2);
        te3 = findViewById(R.id.textView3);
        s1 = ed1.getText().toString();
        s2 = ed2.getText().toString();
        s3 = ed3.getText().toString();
    }

    public void okbtn(View view) {
        if(s1.equals(" ") && s2.equals(" ") && s3.equals(" "))
            Toast.makeText(this, "please fill the gaps", Toast.LENGTH_SHORT).show();
        else  if(s1.equals(" ") || s2.equals(" ") || s3.equals(" "))
            Toast.makeText(this, "please fill the aspecific gap", Toast.LENGTH_SHORT).show();
        else{
            Intent intent = new Intent(this , Main2Activity.class );
            Bundle bundle  = new Bundle();
            bundle.putString("ans1",s1);
            bundle.putString("ans2",s2);
            bundle.putString("ans3",s3);
            bundle.putString("q1",te1.getText().toString());
            bundle.putString("q2",te2.getText().toString());
            bundle.putString("q3",te3.getText().toString());
            intent.putExtra("Bund1",bundle);
            startActivity(intent);
        }

    }
}
