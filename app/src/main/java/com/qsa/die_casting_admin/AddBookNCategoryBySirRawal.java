package com.qsa.die_casting_admin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.qsa.die_casting_admin.R;
import com.qsa.die_casting_admin.activities.AddBook;
import com.qsa.die_casting_admin.activities.AddCategory;

public class AddBookNCategoryBySirRawal extends AppCompatActivity {

    private Button addcat, addBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook_n_category_by_sir);

        addcat = findViewById(R.id.addCategory);
        addBook = findViewById(R.id.addBook);

        addcat.setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AddCategory.class));
        });

        addBook.setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AddBook.class));
        });
    }
}