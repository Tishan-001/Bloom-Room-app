package com.android.bloomroomapp.Admin;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.bloomroomapp.Model.Category;
import com.android.bloomroomapp.R;;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class NewCategoryActivity extends AppCompatActivity {
    StorageReference storageRef;
    DatabaseReference myRootRef;
    Button addBtn;

    private EditText nameEt;
    private ProgressBar progressBar;
    Category category;
    boolean isEdit=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_category);

        initAll();



        SettingClickListners();


    }

    private void SettingClickListners() {




        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nameEt.getText().toString().trim();


                if(TextUtils.isEmpty(name)){
                    nameEt.setError("Enter category name");
                    nameEt.requestFocus();
                }

                else{

                    if(isEdit){
                        category.setName(name);

                    }
                    else{
                        category.setName(name);

                    }


                }

            }
        });
    }

    private void initAll() {

        progressBar = findViewById(R.id.progress_bar);



        addBtn = findViewById(R.id.add_btn);

        nameEt=findViewById(R.id.category_name_et);





        storageRef = FirebaseStorage.getInstance().getReference();
        myRootRef = FirebaseDatabase.getInstance().getReference();
        category=new Category();



        if(getIntent().getSerializableExtra("category")!=null){
            isEdit=true;
            addBtn.setText("Update");
            category= (Category) getIntent().getSerializableExtra("category");
            nameEt.setText(category.getName());

        }
    }

    public void goBack(View view) {
        finish();
    }




    private void SaveInfoToDatabase() {
        String key="";
        if(isEdit){
           key=category.getCategoryId();
        }
        else{
            key=myRootRef.push().getKey();
            category.setCategoryId(key);
        }

        myRootRef.child("Categories").child(key).setValue(category).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                progressBar.setVisibility(View.GONE);
                if(isEdit){
                    Toast.makeText(NewCategoryActivity.this, "Category updated Successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(NewCategoryActivity.this, "Category added Successfully", Toast.LENGTH_SHORT).show();

                }
                finish();
                Log.d("TAG", "Saved to firebase");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressBar.setVisibility(View.GONE);
                Log.d("test", e.toString());
            }
        });
    }
}