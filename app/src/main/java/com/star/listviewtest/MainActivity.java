package com.star.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    private List<Fruit> mFruitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruitList();

        FruitAdapter fruitAdapter = new FruitAdapter(this, R.layout.fruit_item, mFruitList);

        mListView = findViewById(R.id.list_view);
        mListView.setAdapter(fruitAdapter);

        mListView.setOnItemClickListener((parent, view, position, id) -> {
            Fruit fruit = mFruitList.get(position);
            Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_LONG).show();
        });
    }

    private void initFruitList() {

        mFruitList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Fruit apple = new Fruit("apple", R.drawable.apple_pic);
            mFruitList.add(apple);

            Fruit banana = new Fruit("banana", R.drawable.banana_pic);
            mFruitList.add(banana);

            Fruit orange = new Fruit("orange", R.drawable.orange_pic);
            mFruitList.add(orange);

            Fruit watermelon = new Fruit("watermelon", R.drawable.watermelon_pic);
            mFruitList.add(watermelon);

            Fruit pear = new Fruit("pear", R.drawable.pear_pic);
            mFruitList.add(pear);

            Fruit grape = new Fruit("grape", R.drawable.grape_pic);
            mFruitList.add(grape);

            Fruit pineapple = new Fruit("pineapple", R.drawable.pineapple_pic);
            mFruitList.add(pineapple);

            Fruit strawberry = new Fruit("strawberry", R.drawable.strawberry_pic);
            mFruitList.add(strawberry);

            Fruit cherry = new Fruit("cherry", R.drawable.cherry_pic);
            mFruitList.add(cherry);

            Fruit mango = new Fruit("mango", R.drawable.mango_pic);
            mFruitList.add(mango);
        }
    }
}
