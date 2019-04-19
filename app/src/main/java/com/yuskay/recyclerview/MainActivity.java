package com.yuskay.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Create a list of contacts

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Biraj ", "9809716524","pokhara","biraj@gmail.com", R.drawable.biraj));
        contactsList.add(new Contacts("Harry ", "9809716524","ghorahi","harry@gmail.com",R.drawable.harry));
        contactsList.add(new Contacts("Nikhila ", "9809716524","ktm","nikhila@gmail.com",R.drawable.nikhila));
        contactsList.add(new Contacts("Rajesh ", "9809716524","dharan","rajesh@gmail.com",R.drawable.rajesh));
        contactsList.add(new Contacts("Rinku ", "9809716524","Butwal","rinku@gmail.com",R.drawable.rinku));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
   }
}
