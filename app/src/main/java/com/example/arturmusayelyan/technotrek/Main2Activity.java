package com.example.arturmusayelyan.technotrek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    static TextView textView;
   // MyHandler handler;

    MyHandlerDEmo myHandlerDEmo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.text_view2);
//        Thread thread2 = new Thread(new ThreadClass());
//        thread2.start();
//
//        WorkingClass workingClass = new WorkingClass(true);
//        Thread thread = new Thread(workingClass);
//        thread.start();


    //    handler = new MyHandler();

        myHandlerDEmo = new MyHandlerDEmo(textView);

      //  new Thread(new MyThread()).start();

    }

//    static class MyHandler extends android.os.Handler {
//
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            if (msg == 0){
//                //say user that download was complite and open video and play
//            }
//
//        }
//    }

    class ThreadClass implements Runnable {

        @Override
        public void run() {
            for (long i = 0; i < 1000000000000l; i++) {
                System.out.println(i + "");
            }
        }
    }

//    class MyThread implements Runnable {
//
//        @Override
//        public void run() {
//            //some logic
//            if (download was finished){
//                handler.sendEmptyMessage(0);
//
//            }
//        }
//    }
}
