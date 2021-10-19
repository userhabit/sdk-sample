package com.test.myapplication


import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

import androidx.appcompat.app.AppCompatActivity
import io.userhabit.service.Userhabit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView = findViewById<View>(R.id.webView) as WebView
        myWebView.getSettings().setJavaScriptEnabled(true)
        myWebView.loadUrl("http://daum.net/")
        val webViewClient = WebViewClient()
        myWebView.setWebViewClient(webViewClient)

        Userhabit.addWebView(myWebView, webViewClient)

    }
}