package com.sw.example;

import com.sw.aot.api.AotLoader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("\nStart Data AOT Activity");
        setContentView(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAOTActivity();
            }
        });
    }

    private void startAOTActivity(){
        Intent intent = new Intent(this, ExampleActivity.class);
        intent.putExtra("AOT_LOADER_TASK_KEY", AotLoader.produce(ExampleAotIndex.EXAMPLE_LOADMOCKDATA));
        startActivity(intent);
    }
}
