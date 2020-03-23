package com.example.appstagiaires;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class ListStagiairesActivity extends AppCompatActivity {
    private LinkedList<Stagiaire> stagiaires = new LinkedList<>();
    private RecyclerView recyclerView;
    private ListStagiairesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_stagiaires);
        stagiaires = createStagiaires();

        recyclerView = findViewById(R.id.recyclerviewStagiaires);
        adapter = new ListStagiairesAdapter(this, stagiaires);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private LinkedList<Stagiaire> createStagiaires() {
        LinkedList<Stagiaire> stagiaires = new LinkedList<>();

        stagiaires.add(new Stagiaire(
            "Muller",
            "Elisa",
            "6331 Rue Paul Bert 95953 Mulhouse",
            "03-27-91-09-14",
            "elisa.muller@example.com",
            "https://randomuser.me/api/portraits/women/79.jpg"
        ));

        stagiaires.add(new Stagiaire(
            "Leclerc",
            "Malone",
            "162 Place Paul-Duquaire 90168 Nice",
            "05-10-79-72-22",
            "malone.leclerc@example.com",
            "https://randomuser.me/api/portraits/men/35.jpg"
        ));

        stagiaires.add(new Stagiaire(
            "Guillaume",
            "Timeo",
            "162 Rue Bony 10712 Rennes",
            "01-98-81-87-97",
            "timeo.guillaume@example.com",
            "https://randomuser.me/api/portraits/men/91.jpg"
        ));

        return stagiaires;
    }
}
