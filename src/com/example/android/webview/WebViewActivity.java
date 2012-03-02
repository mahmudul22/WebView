package com.example.android.webview;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends Activity {
    /** Called when the activity is first created. */
    WebView myWebView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://129.242.19.250:3000/quiz/set 1");
    }

}