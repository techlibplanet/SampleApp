package appdesign.example.com.sampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    private lateinit var myWebView : WebView
    private val url = "http://padmabhushanenglish.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.webview)

        myWebView.loadUrl(url)
    }
}
