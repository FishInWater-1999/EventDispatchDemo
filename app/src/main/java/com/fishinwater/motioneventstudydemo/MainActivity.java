package com.fishinwater.motioneventstudydemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.fishinwater.motioneventstudydemo.view.MyButton;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "DeBugMainActivity";

    /**
     * 自定义控件 MyButton
     */
    private MyButton mMyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniView();
    }

    /**
     * 实例化控件
     */
    private void iniView() {
        mMyButton = findViewById(R.id.my_button);

        mMyButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d(TAG, "----OnTouch----");
                        break;
                    default:
                        break;
                }
                return false;
            }
        });

        mMyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "----OnClick----");
            }
        });

        mMyButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                return true;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
