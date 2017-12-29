package com.example.arturmusayelyan.technotrek;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/**
 * Created by artur.musayelyan on 28/12/2017.
 */

public class MyHandlerDEmo extends Handler {

    private TextView myText;

    public MyHandlerDEmo(TextView myText) {
        this.myText = myText;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        if (myText != null) myText.setText(String.valueOf(msg));
    }

    public TextView getMyText() {
        return myText;
    }

    public void setMyText(TextView myText) {
        this.myText = myText;
    }
}
