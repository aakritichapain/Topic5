package com.aakriti.topic5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recylerView);

        List<Contacts> contactsList= new ArrayList<>();
        contactsList.add(new Contacts("White", "9800776655",R.drawable.white));
        contactsList.add(new Contacts("Yellow", "9899776655",R.drawable.yellow));

        ContactsAdaptar contactsAdaptar= new ContactsAdaptar(this, contactsList);
        recyclerView.setAdapter(contactsAdaptar);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }
}
