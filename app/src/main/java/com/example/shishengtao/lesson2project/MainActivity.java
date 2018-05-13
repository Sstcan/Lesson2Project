package com.example.shishengtao.lesson2project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       private String TAG="begin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"please click");
        Button button1=(Button) findViewById(R.id.button_center);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this,"Start click",Toast.LENGTH_LONG).show();
               Log.d(TAG,"you already click");
           }
       });
    }
}
