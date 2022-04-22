package com.example.productivitybooster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    List<String> items;

    private RecyclerView todoList;
    private Button btnPost;
    private EditText etItem;
    private Button btnAdd;
    ItemsAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoList = findViewById(R.id.todoList);
        btnPost = findViewById(R.id.btnPost);
        btnAdd = findViewById(R.id.btnAdd);
        etItem = findViewById(R.id.addTaskField);

        items = new ArrayList<>();
        items.add("Buy milk");
        items.add("Go to gym");
        items.add("Have a little fun");

        ItemsAdapter.OnLongClickListener onLongClickListener = new ItemsAdapter.OnLongClickListener(){
            @Override
            public void onItemLongClicked(int position) {
                items.remove(position);
                itemsAdapter.notifyItemRemoved(position);
            }
        };
        final ItemsAdapter itemsAdapter = new ItemsAdapter(items, onLongClickListener);
        todoList.setAdapter(itemsAdapter);
        todoList.setLayoutManager(new LinearLayoutManager(this));

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String todoItem = etItem.getText().toString();
                items.add(todoItem);
                itemsAdapter.notifyItemInserted(items.size() - 1);
                etItem.setText("");
            }
        });
    }
}