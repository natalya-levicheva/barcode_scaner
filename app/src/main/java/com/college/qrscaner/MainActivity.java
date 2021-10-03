package com.college.qrscaner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.blue_deep));
        ImageView imageBarcode = findViewById(R.id.image_barcode);

        Animation animationBarcodeToMax = AnimationUtils.loadAnimation(this, R.anim.scale_to_max);
        animationBarcodeToMax.setStartOffset(0);

        imageBarcode.startAnimation(animationBarcodeToMax);

    }
}