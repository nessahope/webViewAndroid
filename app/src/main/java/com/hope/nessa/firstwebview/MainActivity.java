package com.hope.nessa.firstwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    WebAppInterface appInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for webviews, most of the browser features are off
        //you don't have caching option
        //you don't have javascript enables by default
        //you don't have cookies
        webView = findViewById(R.id.mainWebView);
        webView.loadUrl("http://10.0.2.2:8080/register.html");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        appInterface = new WebAppInterface(this);
        //this is where we define the Android obj
        webView.addJavascriptInterface(appInterface, "Android");

        ApiWebViewClient apiWebViewClient = new ApiWebViewClient();
        webView.setWebViewClient(apiWebViewClient);
    }


}
