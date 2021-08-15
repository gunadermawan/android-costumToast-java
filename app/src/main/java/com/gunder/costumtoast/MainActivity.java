package com.gunder.costumtoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import www.sanju.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {

//    inisialisasi button
    Button btnSuccess,btnError, btnInfo, btnWarning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSuccess = findViewById(R.id.btnsuccess);
        btnError = findViewById(R.id.btnerror);
        btnInfo = findViewById(R.id.btninfo);
        btnWarning = findViewById(R.id.btnwarning);

//        set on click
        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkToast(MainActivity.this,
                        "Hurray success 😍",
                        "Upload Completed successfully!",
                        MotionToast.TOAST_SUCCESS,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.SHORT_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkToast(MainActivity.this,
                        "Profile Update Failed!",
                        "Kesalahan tidak diketahui!",
                        MotionToast.TOAST_ERROR,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.SHORT_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkToast(MainActivity.this,
                        "This is information toast!",
                        "This is information toast!",
                        MotionToast.TOAST_INFO,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.SHORT_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkToast(MainActivity.this,
                        "Please fill all the details!",
                        "Please fill all the details!",
                        MotionToast.TOAST_WARNING,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.SHORT_DURATION,
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
    }
}