package com.example.arturmusayelyan.technotrek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.text_view2);
        Thread thread2=new Thread(new ThreadClass());
        thread2.start();

        WorkingClass workingClass=new WorkingClass(true);
        Thread thread=new Thread(workingClass);
        thread.start();
    }
    class ThreadClass implements Runnable{

        @Override
        public void run() {
            for (long i = 0; i <1000000000000l ; i++) {
                System.out.println(i+"");
            }
        }
    }
}
