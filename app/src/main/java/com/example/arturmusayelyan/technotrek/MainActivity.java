package com.example.arturmusayelyan.technotrek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

        WorkingClass workingClass=new WorkingClass();
        Thread thread=new Thread(workingClass);
        thread.start();
    }

    class WorkingClass implements Runnable {

        @Override
        public void run() {
//            textView.post(new Runnable() {
//
//                @Override
//                public void run() {
//                    textView.setText("The job is done!");
//                }
//            });
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    textView.setText("The job is done!"); 
                }
            });
        }
    }
}
