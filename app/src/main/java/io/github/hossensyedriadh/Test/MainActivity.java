package io.github.hossensyedriadh.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Load the system library here with the file name containing c source code
    static {
        System.loadLibrary("native");
    }

    //initialize the method from native environment
    //name should be exactly the same as in the native source
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