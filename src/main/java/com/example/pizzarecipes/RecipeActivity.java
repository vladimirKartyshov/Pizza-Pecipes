package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);

        // извлекаем передаваемую информацию в интенте
        Intent intent = getIntent();
        if (intent != null){
            title.setText(intent.getStringExtra("title"));// по ключу title
            recipe.setText(intent.getStringExtra("recipe"));

        }

    }
}
