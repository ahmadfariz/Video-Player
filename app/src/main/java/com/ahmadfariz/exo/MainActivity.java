package com.ahmadfariz.exo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.A1);
        card2 = (CardView) findViewById(R.id.B1);
        card3 = (CardView) findViewById(R.id.C1);
        card4 = (CardView) findViewById(R.id.D1);
        card5 = (CardView) findViewById(R.id.E1);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.A1 :
                i = new Intent(this,Vid1.class);
                startActivity(i);
                break;
        }

        switch (v.getId()) {
            case R.id.B1 :
                i = new Intent(this,Vid2.class);
                startActivity(i);
                break;
        }

        switch (v.getId()) {
            case R.id.C1 :
                i = new Intent(this,Vid3.class);
                startActivity(i);
                break;
        }

        switch (v.getId()) {
            case R.id.D1 :
                i = new Intent(this,Vid4.class);
                startActivity(i);
                break;
        }

        switch (v.getId()) {
            case R.id.E1 :
                i = new Intent(this,Vid1.class);
                startActivity(i);
                break;
        }

    }
}