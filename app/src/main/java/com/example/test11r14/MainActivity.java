package com.example.test11r14;
/**
 * Richard
 *API 24
 *16/03/2026
 * התוכנה אזות מציגה קישורים בgoogle
 */
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

        eAd = findViewById(R.id.etAddress);
        btnGo = findViewById(R.id.btnGo);
        wV = findViewById(R.id.wV);

        wV.setWebViewClient(new WebViewClient());

        wV.getSettings().setJavaScriptEnabled(true);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = eAd.getText().toString().trim();

                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "https://" + url;
                }

                wV.loadUrl(url);
            }
            /**
             * קשי אתה לוחץ אז זה מרה תוכן של הקישור
             * param סורק קישור
             * return מחזיר תוכן של הקישור
             */
        });
    }
}