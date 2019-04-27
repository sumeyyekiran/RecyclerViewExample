package com.example.olaylirecyclerview;

import android.app.ProgressDialog;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Siniflarca extends AppCompatActivity {


WebView webView;
int id;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siniflarca);
        webView=findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);

        Bundle extras = getIntent().getExtras();
        String value = extras.getString("send_string");
        String personname = extras.getString("send_ad");
        switch (value){
            case "1":
                webView.loadUrl("https://www.dccomics.com/characters/batman");
                break;
            case "2":
                webView.loadUrl("https://www.marvel.com/characters/iron-man-tony-stark");
                break;
            case "3":
                webView.loadUrl("https://dc.fandom.com/wiki/Wonder_Woman_(Diana_Prince)");
                break;
            case "4":
                webView.loadUrl("https://www.dccomics.com/characters/superman");
                break;
            case "5":
                webView.loadUrl("https://www.marvel.com/characters/black-widow-natasha-romanoff");
                break;
            case "6":
                webView.loadUrl("https://www.marvel.com/characters/spider-man-peter-parker");
                break;
            case "7":
                webView.loadUrl("https://www.marvel.com/characters/hulk-bruce-banner/in-comics");
                break;
            case "8":
                webView.loadUrl("https://marvel.fandom.com/wiki/Steven_Rogers_(Earth-616)");
                break;

        }
        final ProgressDialog progress = ProgressDialog.show(this, "Super Hero", personname+" Yukleniyor....", true);
        progress.show();
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(getApplicationContext(), "Sayfa yüklendi", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Bir hata oluştu", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
        });





    }








}
