package com.example.arturmusayelyan.technotrek;

import android.os.Handler;
import android.os.Message;

/**
 * Created by artur.musayelyan on 27/12/2017.
 */

//http://abhiandroid.com/materialdesign/tablayout-example-android-studio.html#Example_2_of_TabLayout_Using_ViewPager
public class WorkingClass implements Runnable {
    public static final int SUCCESS = 1;
    public static final int FAIL = 2;
    private boolean dummyResult;

    public WorkingClass(boolean dummyResult) {
        this.dummyResult = dummyResult;
    }

    @Override
    public void run() {
        if (dummyResult) {
            uiHandler.sendEmptyMessage(SUCCESS);
        } else {
            Message message = Message.obtain();
            message.what = FAIL;
            message.obj = "An error occurred";
            uiHandler.sendMessage(message);
        }
    }

    Handler uiHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case WorkingClass.SUCCESS:
                    Main2Activity.textView.setText("Success");
                    return true;
                case WorkingClass.FAIL:
                    Main2Activity.textView.setText((String) msg.obj);
                    return true;
            }
            return false;
        }
    });
}
