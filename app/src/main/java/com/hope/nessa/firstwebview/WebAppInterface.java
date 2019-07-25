package com.hope.nessa.firstwebview;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {

    private Context context;

    public WebAppInterface(Context context) {
        this.context = context;
    }

    //we are telling it that this comes from the Webkit and it needs to be passed to the Android object in our JavaScript function
    @JavascriptInterface
    public void showToast(String toastMessage){
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void registerUser(String email, String password){

        String welcomeText = email + " is Registered!";

        Toast.makeText(context, welcomeText, Toast.LENGTH_SHORT).show();
    }
}
