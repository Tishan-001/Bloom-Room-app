package com.android.bloomroomapp.Activity;

import static com.android.bloomroomapp.Fragment.HomeFragment.clearClicked;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.bloomroomapp.Fragment.HomeFragment;
import com.android.bloomroomapp.Model.Utils;
import com.android.bloomroomapp.R;;

public class SearchFiltersActivity extends AppCompatActivity implements View.OnClickListener {
    TextView clearFilters;
    LinearLayout  categorySympathyflowers,  categoryHousewarmingflowers,  categoryBirthdayflowers,  categoryAnniversary,  categoryNewBaby,  categoryValentinesDay,  categoryGraduation,  categoryMothersDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filters);

        initAll();

        clearFilters.setOnClickListener(this);

        categorySympathyflowers.setOnClickListener(this);
        categoryHousewarmingflowers.setOnClickListener(this);
        categoryBirthdayflowers.setOnClickListener(this);
        categoryAnniversary.setOnClickListener(this);
        categoryNewBaby.setOnClickListener(this);
        categoryValentinesDay.setOnClickListener(this);
        categoryGraduation.setOnClickListener(this);
        categoryMothersDay.setOnClickListener(this);



    }

    private void initAll() {
        clearFilters = findViewById(R.id.id_clear_btn);

        categorySympathyflowers = findViewById(R.id.cat_Sympathyflowers);
                categoryHousewarmingflowers = findViewById(R.id.cat_Housewarmingflowers);
        categoryBirthdayflowers = findViewById(R.id.cat_Birthdayflowers);
                categoryAnniversary = findViewById(R.id.cat_Anniversary);
        categoryNewBaby = findViewById(R.id.cat_NewBaby);
                categoryValentinesDay = findViewById(R.id.cat_ValentinesDay);
        categoryGraduation = findViewById(R.id.cat_Graduation);
                categoryMothersDay = findViewById(R.id.cat_MothersDay);



    }

    public void goBack(View view) {
        finish();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.cat_Sympathyflowers:
                HomeFragment.category="Sympathyflowers";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_Housewarmingflowers:
                HomeFragment.category="Housewarmingflowers";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_Birthdayflowers:
                HomeFragment.category="Birthdayflowers";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_Anniversary:
                HomeFragment.category="Anniversary";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_NewBaby:
                HomeFragment.category="NewBaby";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_ValentinesDay:
                HomeFragment.category="ValentinesDay";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_Graduation:
                HomeFragment.category="Graduation";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;
            case R.id.cat_MothersDay:
                HomeFragment.category="MothersDay";
                HomeFragment.isCategorySeleted=true;
                HomeFragment.isFiltersApplied=true;
                finish();
                break;


            case R.id.id_clear_btn:
                clearClicked();
                finish();
                break;
        }
    }
}