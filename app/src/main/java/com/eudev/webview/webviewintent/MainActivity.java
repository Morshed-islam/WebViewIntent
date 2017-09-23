package com.eudev.webview.webviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    String fbUrl="http://www.facebook.com";
    String ytUrl="http://www.youtube.com";
    String googleUrll="http://www.google.com";
    String githubUrl="http://www.github.com";

    ImageButton fbBtn,ytBtn,ggBtn,ghBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fbBtn = (ImageButton) findViewById(R.id.fb);
        ytBtn = (ImageButton) findViewById(R.id.youtube);
        ggBtn = (ImageButton) findViewById(R.id.google);
        ghBtn = (ImageButton) findViewById(R.id.github);

        sendDataOnclick();

    }



    private void sendDataOnclick(){


        fbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),WebViewDetails.class);
                intent.putExtra("URL",fbUrl);
                startActivity(intent);
            }
        });


        ytBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),WebViewDetails.class);
                intent.putExtra("URL",ytUrl);
                startActivity(intent);
            }
        });

        ggBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),WebViewDetails.class);
                intent.putExtra("URL",googleUrll);
                startActivity(intent);
            }
        });

        ghBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),WebViewDetails.class);
                intent.putExtra("URL",githubUrl);
                startActivity(intent);
            }
        });
    }



}
