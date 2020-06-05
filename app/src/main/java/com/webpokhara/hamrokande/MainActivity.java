package com.webpokhara.hamrokande;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {



    ViewFlipper v_flipper;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] = {R.drawable.s14, R.drawable.s27, R.drawable.s3, R.drawable.s4, R.drawable.s6};

        v_flipper = findViewById(R.id.v_flipper);

        /*
        //for loop
        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);

         */

        //foreach loop instead of for loop
        for (int image : images) {
            flipperImages(image);


        }




        //for buttons to link respective page
        ImageButton aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Activity2.class);

                startActivity(activity2Intent);
            }

        });


        ImageButton discoverButton = findViewById(R.id.discoverButton);
        discoverButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                System.out.println("Button Clicked");

                Intent activity3Intent = new Intent(getApplicationContext(), Activity3.class);

                startActivity(activity3Intent);
            }

        });


        ImageButton aroundButton = findViewById(R.id.aroundButton);
        aroundButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                System.out.println("Button Clicked");

                Intent activity4Intent = new Intent(getApplicationContext(), Activity4.class);

                startActivity(activity4Intent);
            }

        });


        ImageButton galleryButton = findViewById(R.id.galleryButton);
        galleryButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                System.out.println("Button Clicked");

                Intent activity5Intent = new Intent(getApplicationContext(), Activity5.class);

                startActivity(activity5Intent);
            }

        });


        ImageButton getButton = findViewById(R.id.getButton);
        getButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                System.out.println("Button Clicked");

                Intent activity6Intent = new Intent(getApplicationContext(), Activity6.class);

                startActivity(activity6Intent);
            }

        });


        ImageButton foodButton = findViewById(R.id.foodButton);
        foodButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                System.out.println("Button Clicked");

                Intent activity7Intent = new Intent(getApplicationContext(), Activity7.class);

                startActivity(activity7Intent);
            }

        });



        //for web view to load radio dot html in webview
        webView = (WebView)findViewById(R.id.webView1);

        WebSettings webSetting = webView.getSettings();
        webSetting.setBuiltInZoomControls(true);
        webSetting.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("http://bbcmedia.ic.llnwd.net/stream/bbcmedia_radio2_mf_p");
        webView.loadUrl("file:///android_asset/radio.html");






    }

    //private class for radio dot html to load in webview
    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }








    //image slideshow home page
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000); //4sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }





}
