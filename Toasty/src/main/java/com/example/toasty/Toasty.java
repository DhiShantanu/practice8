package com.example.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void whysosimple(Context context, String msg){

        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();

    }
}
