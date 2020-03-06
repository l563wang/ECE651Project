package com.libangliang.ece651project.ui.categories;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.libangliang.ece651project.CategoriesDisplayActivity;
import com.libangliang.ece651project.R;

public class CategoriesFragment extends Fragment {

    private CategoriesViewModel categoriesViewModel;

    private ImageView fruitAndVege,meatAndFish, dairyAndEgg, bakery;
    private ImageView frozen, drinks, household, beauty;
    private ImageView toiletries, homeware, baby, pet;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoriesViewModel =
                ViewModelProviders.of(this).get(CategoriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_categories, container, false);

        fruitAndVege = root.findViewById(R.id.user_fruit_and_vegetable_pic);
        meatAndFish = root.findViewById(R.id.user_meat_and_fish_pic);
        dairyAndEgg = root.findViewById(R.id.user_dairy_and_egg_pic);
        bakery = root.findViewById(R.id.user_bakery_pic);

        frozen = root.findViewById(R.id.user_frozen_pic);
        drinks = root.findViewById(R.id.user_drinks_pic);
        household = root.findViewById(R.id.user_household_pic);
        beauty = root.findViewById(R.id.user_beauty_pic);

        toiletries = root.findViewById(R.id.user_toiletries_and_health_pic);
        homeware = root.findViewById(R.id.user_homeware_pic);
        baby = root.findViewById(R.id.user_baby_pic);
        pet = root.findViewById(R.id.user_pet_pic);


        fruitAndVege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoriesDisplayActivity.class);
                intent.putExtra("category","fruitAndVege");
                startActivity(intent);
            }
        });

        meatAndFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","meatAndFish");
                startActivity(intent);
            }
        });

        dairyAndEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","dairyAndEgg");
                startActivity(intent);
            }
        });

        bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","bakery");
                startActivity(intent);
            }
        });

        frozen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","frozen");
                startActivity(intent);
            }
        });

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","drinks");
                startActivity(intent);
            }
        });

        household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","household");
                startActivity(intent);
            }
        });

        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","beauty");
                startActivity(intent);
            }
        });

        toiletries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","toiletries");
                startActivity(intent);
            }
        });

        homeware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","homeware");
                startActivity(intent);
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","baby");
                startActivity(intent);
            }
        });

        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CategoriesDisplayActivity.class);
                intent.putExtra("category","pet");
                startActivity(intent);
            }
        });

        return root;
    }
}
