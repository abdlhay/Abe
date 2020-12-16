package com.abmo.bread;

import android.content.Context;
import android.widget.Toast;

public class Bread {

    public static void show(Context context,String message,int duration){
        Toast.makeText(context, message, duration).show();
    }

}
