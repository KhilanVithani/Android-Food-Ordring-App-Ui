package com.example.foodorderingapp;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CartListActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;
    TextView totalFeeTxt,taxTxt,deliveryTxt,totalTxt,emptyTxt;
    private  double tax;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);

        initView();
    }

    private void initView() {
        recyclerViewList=findViewById(R.id.recyclerView);
        totalFeeTxt=findViewById(R.id.totalFeeText);
        taxTxt=findViewById(R.id.taxTax);
        deliveryTxt=findViewById(R.id.deliverTxt);
        totalTxt=findViewById(R.id.totalTxt);
        emptyTxt=findViewById(R.id.emptytxt);
        scrollView=findViewById(R.id.scrollView5);
    }

    private void initList(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        adapter=
    }
}