package com.androidapps.mylocations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowMap = (Button) findViewById(R.id.btnViewMap);

        btnShowMap.setOnClickListener(new Button.OnClickListener() {

                    public void onClick(View view) {
                        Intent mapview = new Intent(MainActivity.this, MapsActivity.class);

                        startActivity(mapview);
                    }
                });

    }
}
