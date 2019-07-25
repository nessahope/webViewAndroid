package com.hope.nessa.firstwebview;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ApiWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (Uri.parse(url).getHost().equals("https://10.0.2.2:8080")) {
            return false;
        }
       // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        return true;
    }
}
