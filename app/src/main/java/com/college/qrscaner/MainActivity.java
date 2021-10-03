package com.college.qrscaner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ImageView imageBarcode = findViewById(R.id.image_barcode);
        Animation animationBarcodeToMax1 = AnimationUtils.loadAnimation(this, R.anim.scale_to_max);
        Animation animationBarcodeToMin1 = AnimationUtils.loadAnimation(this, R.anim.scale_to_min);
        Animation animationBarcodeToMax2 = AnimationUtils.loadAnimation(this, R.anim.scale_to_max);
        Animation animationBarcodeToMin2 = AnimationUtils.loadAnimation(this, R.anim.scale_to_min);
        animationBarcodeToMax1.setStartOffset(1);
        animationBarcodeToMax2.setStartOffset(2000);
        animationBarcodeToMin1.setStartOffset(1000);
        animationBarcodeToMin2.setStartOffset(3000);
        imageBarcode.startAnimation(animationBarcodeToMax1);
        imageBarcode.startAnimation(animationBarcodeToMin1);
        //imageBarcode.startAnimation(animationBarcodeToMax2);
        //imageBarcode.startAnimation(animationBarcodeToMin2);
    }
}