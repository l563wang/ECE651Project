package com.libangliang.ece651project.ui.categories;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.libangliang.ece651project.CategoriesDisplayActivity;
import com.libangliang.ece651project.HomeActivity;
import com.libangliang.ece651project.R;

public class CategoriesFragment extends Fragment {

    private CategoriesViewModel categoriesViewModel;

    private ImageView fruitAndVege,meatAndFish, dairyAndEgg, bakery;
    private ImageView frozen, drinks, household, beauty;
    private ImageView toiletries, homeware, baby, pet;

    HomeActivity HA;


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

                HA = (HomeActivity) getActivity();
                HA.byCategory = "fruitAndVege";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
                HA.searchByCategory();

            }
        });

        meatAndFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "meatAndFish";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
                HA.searchByCategory();
            }
        });

        dairyAndEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "dairyAndEgg";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "bakery";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();

            }
        });

        frozen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA = (HomeActivity) getActivity();
                HA.byCategory = "frozen";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "drinks";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "household";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "beauty";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        toiletries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "toiletries";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        homeware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA.byCategory = "homeware";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "baby";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HA = (HomeActivity) getActivity();
                HA.byCategory = "pet";
                Toast.makeText(getActivity(),HA.byCategory,Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
