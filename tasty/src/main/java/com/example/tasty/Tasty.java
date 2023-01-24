package com.example.tasty;

import android.content.Context;
import android.widget.Toast;

public class Tasty {
    public static void notsosimple(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
