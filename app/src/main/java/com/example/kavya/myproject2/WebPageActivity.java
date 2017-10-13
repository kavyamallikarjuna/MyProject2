package com.example.kavya.myproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebPageActivity extends Activity {

    private WebView myWebView;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        Intent intent4=getIntent();
        pos=intent4.getIntExtra("position1",0);
        //webview used to go to browser
        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        switch(pos)
        {
            case 0:
                myWebView.loadUrl("https://global.astonmartin.com/en-us");
                break;

            case 1:
                myWebView.loadUrl("https://www.audiusa.com/");
                break;

            case 2:
                myWebView.loadUrl("https://www.bmw.co.uk/en/index.html");
                break;

            case 3:
                myWebView.loadUrl("https://www.bugatti.com/home/");
                break;

            case 4:
                myWebView.loadUrl("https://www.ferrari.com/en-US");
                break;

            case 5:
                myWebView.loadUrl("https://www.jaguarusa.com/index.html");
                break;

            case 6:
                myWebView.loadUrl("https://www.lamborghini.com/en-en/");
                break;

            case 7:
                myWebView.loadUrl("https://www.mbusa.com/mercedes/index");
                break;

            case 8:
                myWebView.loadUrl("https://www.porsche.com/");
                break;
        }

    }
}
