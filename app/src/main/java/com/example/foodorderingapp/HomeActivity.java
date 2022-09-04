package com.example.foodorderingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderingapp.Adaptor.CategoryAdaptor;
import com.example.foodorderingapp.Adaptor.PoplurarAdaptor;
import com.example.foodorderingapp.Domain.CategoryDomain;
import com.example.foodorderingapp.Domain.FoodDomain;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2,adapter3;
private RecyclerView recyclerViewCategoryList,recyclerViewPopularlist,recyclerViewAllCategortyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        recyclerViewCategoryList();
        recyclerViewPopular();
        recyclerViewAllCAtegory();
    }


    private void recyclerViewCategoryList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain>category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza","cat_1"));
        category.add(new CategoryDomain("Burger","cat_2"));
        category.add(new CategoryDomain("HotDog","cat_3"));
        category.add(new CategoryDomain("Drink","cat_4"));
        category.add(new CategoryDomain("Donut","cat_5"));

        adapter=new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularlist = findViewById(R.id.recyclerView2);
        recyclerViewPopularlist.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain>foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Pepperoni pizza","pop_1","slices pepperoni,mozzerella cheese,fresh oregano,ground black pepper,pizza sauce",1400.0));
        foodList.add(new FoodDomain("Cheeshe Burger","pop_2","beef, Goude Cheese, Special sauce, Lettuce, tomato",100.0));
        foodList.add(new FoodDomain("Vegetable Pizza","pop_3","olive oil, vegetable oil, pitted kalamata, chrrey tomatoes,fresh oregano, basil",1250.0));
        foodList.add(new FoodDomain("Maggi","pop_4","Classic Maggi adorned with cheese",50.0));
        foodList.add(new FoodDomain("French Fries","pop_5","Crispy golden Fries, fried to perfection and lightly salted.",200.0));

        adapter2 = new PoplurarAdaptor(foodList);
        recyclerViewPopularlist.setAdapter(adapter2);


    }
    private void recyclerViewAllCAtegory(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularlist = findViewById(R.id.recyclerView3);
        recyclerViewPopularlist.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain>foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Pepperoni pizza","pop_1","slices pepperoni,mozzerella cheese,fresh oregano,ground black pepper,pizza sauce",1400.0));
        foodList.add(new FoodDomain("Signature Cold Coffee","pop_8","Our classic filter coffee on the rocks, Serving Size(gm/ml) - 300, Energy (kcal) - 227.52 Contains Milk",229.99));
        foodList.add(new FoodDomain("Veg Sub Combo","pop_6","Choose your favourite tasty combo of one veg sub (15cm, 6\") along with choice of your drink.",268.50));
        foodList.add(new FoodDomain("Cheeshe Burger","pop_2","beef, Goude Cheese, Special sauce, Lettuce, tomato",100.0));
        foodList.add(new FoodDomain("Vegetable Pizza","pop_3","olive oil, vegetable oil, pitted kalamata, chrrey tomatoes,fresh oregano, basil",1250.0));
        foodList.add(new FoodDomain("Maggi","pop_4","Classic Maggi adorned with cheese",50.0));
        foodList.add(new FoodDomain("French Fries","pop_5","Crispy golden Fries, fried to perfection and lightly salted.",200.0));
        foodList.add(new FoodDomain("Veg American Hotdog","pop_7","[Veg Preparation] The American Hot Dog, with Soya Sausage,topped with Mustard & Mayo Sauce" ,125.50));

        adapter3 = new PoplurarAdaptor(foodList);
        recyclerViewPopularlist.setAdapter(adapter3);


    }

}