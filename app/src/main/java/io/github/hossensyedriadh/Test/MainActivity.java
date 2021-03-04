package io.github.hossensyedriadh.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native");
    }

    private native String getURL();

    private TextView urlTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlTextView = findViewById(R.id.urlTextView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        urlTextView.setText(getURL());
    }
}