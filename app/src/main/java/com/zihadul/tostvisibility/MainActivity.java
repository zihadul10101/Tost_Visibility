package com.zihadul.tostvisibility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView image;
Button visible,gone,tost;
TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image =findViewById(R.id.image);
        visible=findViewById(R.id.visible);
        gone=findViewById(R.id.gone);
        tost=findViewById(R.id.tost);
        tvText=findViewById(R.id.tvText);


        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class );
                startActivity(myIntent);
            }
        });

        gone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              image.setVisibility(View.GONE);
            }
        });

        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);
            }
        });

        tost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainActivity.this,"Tost is ready",Toast.LENGTH_LONG).show();
            }
        });

    }
}