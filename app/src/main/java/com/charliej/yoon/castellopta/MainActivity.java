package com.charliej.yoon.castellopta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // opens PTA's Instagram page when the Instagram icon is clicked.
    public void instagramClick(View v) {
        String url = "https://www.instagram.com/helencarrcastellopta/";
        openBrowser(url);
    }

    // opens PTA's Facebook page when the Facebook icon is clicked.
    public void facebookClick(View v) {
        String url = "https://www.facebook.com/HelenCarrCastelloPTA/";
        openBrowser(url);
    }

    // opens PTA's Amazon Smile website when the Amazon icon is clicked.
    public void amazonClick(View v) {
        String url = "https://smile.amazon.com/ch/20-3285880";
        openBrowser(url);
    }

    // open's link to download Castello's app from the Google Play Store.
    public void playStoreClick(View v) {
        String url = "https://play.google.com/store/apps/details?id=com.app_hcces.layout";
        openBrowser(url);
    }

    public void appStoreClick(View v) {
        String url = "https://itunes.apple.com/us/app/castello-elementary/id964816008?mt=8";
        openBrowser(url);
    }

    // method that defines intent to open web address.
    private void openBrowser(String address) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(android.content.Intent.ACTION_VIEW);
        intent.addCategory(android.content.Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(android.net.Uri.parse(address));

        startActivity(intent);
        }

}
