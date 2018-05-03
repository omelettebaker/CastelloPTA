package com.charliej.yoon.castellopta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // opens dialer to call school number.
    public void dialNumber(View v) {
        String number = getString(R.string.tel_number);

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(number));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // opens PTA's website when link is clicked.
    public void webClick(View v) {
        String url = getString(R.string.web_url);
        openBrowser(url);
    }

    // opens PTA's Instagram page when the Instagram icon is clicked.
    public void instagramClick(View v) {
        String url = getString(R.string.instagram_address);
        openBrowser(url);
    }

    // opens PTA's Facebook page when the Facebook icon is clicked.
    public void facebookClick(View v) {
        String url = getString(R.string.facebook_address);
        openBrowser(url);
    }

    // opens PTA's Amazon Smile website when the Amazon icon is clicked.
    public void amazonClick(View v) {
        String url = getString(R.string.amazon_address);
        openBrowser(url);
    }

    // opens link to download Castello's app from the Google Play Store.
    public void playStoreClick(View v) {
        String url = getString(R.string.play_store_address);
        openBrowser(url);
    }

    // opens link to download Castello's app from App Store.
    public void appStoreClick(View v) {
        String url = getString(R.string.app_store_address);
        openBrowser(url);
    }

    // method that defines intent to open web address.
    private void openBrowser(String address) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(address));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void getMap(View v) {
        String location = getString(R.string.address_url);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(location));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

}
