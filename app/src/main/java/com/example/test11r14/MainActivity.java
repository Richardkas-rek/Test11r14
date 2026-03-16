package com.example.test11r14;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText eAd;
    private Button btnGo;
    private WebView wV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eAd = findViewById(R.id.etAddress); // исправлено
        btnGo = findViewById(R.id.btnGo);
        wV = findViewById(R.id.wV);

        wV.setWebViewClient(new WebViewClient());
        wV.getSettings().setJavaScriptEnabled(true);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = eAd.getText().toString();

                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "https://" + url;
                }

                wV.loadUrl(url);
            }
        });
    }
}