package com.example.decision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class FormActivity extends AppCompatActivity {

    private static String form_url = "https://docs.google.com/forms/d/e/1FAIpQLSeyvYCoC-SIOdT8hdZL7_8LWCaglrfhb-g-YQSjhchIslR2IQ/viewform?c=0&w=1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        WebView web = (WebView) findViewById(R.id.form_view);


        web = new WebView(this);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(form_url);

        setContentView(web);
    }
}
