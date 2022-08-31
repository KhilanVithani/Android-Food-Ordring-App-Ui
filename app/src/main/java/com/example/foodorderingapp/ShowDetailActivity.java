package com.example.foodorderingapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.foodorderingapp.Domain.FoodDomain;

public class ShowDetailActivity extends AppCompatActivity {
    private TextView addToCartBtn;
    private TextView titleTxt, feeTxt, descriptionTxt, numberOrderTxt;
    private ImageView plusBtn, minusBtn, picFood;
    private FoodDomain object;
    int numberOrder = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        initView();
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOrder = numberOrder + 1;
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numberOrder > 1) {
                    numberOrder = numberOrder - 1;
                }
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });
        getBundle();
    }

    private void getBundle() {
        object = (FoodDomain) getIntent().getSerializableExtra("object");

        String title = getIntent().getStringExtra("title");
        String pic = getIntent().getStringExtra("pic");
        String des = getIntent().getStringExtra("des");
        Double price = getIntent().getDoubleExtra("price",0.0);

        Log.e("TAG000", "getBundle: "+pic);
        Log.e("TAG000", "getBundle: "+price);

        int drawableResourceId = this.getResources().getIdentifier(pic, "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picFood);

        titleTxt.setText(title);

        descriptionTxt.setText(des);
        feeTxt.setText("\u20B9 "+ price);
        numberOrderTxt.setText(String.valueOf(numberOrder));


    }

    private void initView() {
        addToCartBtn = findViewById(R.id.addToCartBtn);
        titleTxt = findViewById(R.id.titleTxt);
        feeTxt = findViewById(R.id.priceTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        numberOrderTxt = findViewById(R.id.numberOrderTxt);
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        picFood = findViewById(R.id.picFood);
    }
}