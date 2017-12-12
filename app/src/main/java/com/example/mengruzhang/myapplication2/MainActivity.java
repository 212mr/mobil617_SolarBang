package com.example.mengruzhang.myapplication2;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    //step 1 -declaration
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2 -hookup
        myWebView = (WebView) findViewById(R.id.wv1);
        loadmyWebView(myWebView);
    }
    private void loadmyWebView(WebView webView){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);

//        alow javascript
//        reinstall/reload updated url



        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://mengruzhang.com/aau/wnm617/m15/");
    }
}
