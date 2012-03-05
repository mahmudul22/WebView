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
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.main);
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        myWebView.setWebChromeClient(new WebChromeClient() {
          public void onProgressChanged(WebView view, int progress) {
            activity.setProgress(progress * 100);
          }
        });
        myWebView.setWebViewClient(new WebViewClient() {
          public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            Toast.makeText(activity, "Sorry! " + description, Toast.LENGTH_SHORT).show();
          }
        });
        myWebView.loadUrl("http://129.242.19.250:3000/quiz/set 1");
    }

}