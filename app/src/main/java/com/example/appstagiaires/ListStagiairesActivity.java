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

        stagiaires.add(new Stagiaire(
                "Robin",
                "Mélissa",
                "7382 Quai Chauveau 31046 Avignon",
                "01-19-70-39-89",
                "melissa.robin@example.com",
                "https://randomuser.me/api/portraits/women/61.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Roche",
                "Célia",
                "1832 Avenue Tony-Garnier 79617 Limoges",
                "04-46-70-31-44",
                "celia.roche@example.com",
                "https://randomuser.me/api/portraits/women/11.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Martinez",
                "Gaël",
                "5353",
                "Rue Baraban 90118 Pau",
                "gael.martinez@example.com",
                "https://randomuser.me/api/portraits/men/8.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Colin",
                "Anaïs",
                "9563 Rue Abel-Ferry 68706 Rueil-Malmaison",
                "05-54-27-19-42",
                "anais.colin@example.com",
                "https://randomuser.me/api/portraits/women/23.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Duval",
                "Kelya",
                "4143 Rue Laure-Diebold 20322 Colombes",
                "01-96-16-08-59",
                "kelya.duval@example.com",
                "https://randomuser.me/api/portraits/women/64.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Gerard",
                "Sélène",
                "7727 Abel-Ferry 35479 Montreuil",
                "05-58-57-88-73",
                "selene.gerard@example.com",
                "https://randomuser.me/api/portraits/women/96.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Moulin",
                "Elia",
                "7335 Avenue des Ternes 41310 Fort-de-France",
                "04-69-56-65-99",
                "elia.moulin@example.com",
                "https://randomuser.me/api/portraits/women/11.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Vidal",
                "Ana",
                "6429 Montée Saint-Barthélémy 21494 Montreuil",
                "03-82-03-93-91",
                "ana.vidal@example.com",
                "https://randomuser.me/api/portraits/women/59.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Thomas",
                "Inaya",
                "2957 Esplanade du 9 Novembre 58442 Poitiers",
                "01-92-03-32-57",
                "inaya.thomas@example.com",
                "https://randomuser.me/api/portraits/women/84.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "David",
                "Léon",
                "557 Rue du Dauphiné 89237 Aubervilliers",
                "03-46-43-40-24",
                "leon.david@example.com",
                "https://randomuser.me/api/portraits/men/47.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Robert",
                "Lena",
                "4218 Place de L'Europe 16354 Aubervilliers",
                "02-37-31-83-14",
                "lena.robert@example.com",
                "https://randomuser.me/api/portraits/women/91.jpg"
        ));

        stagiaires.add(new Stagiaire(
                "Joly",
                "Louane",
                "5337 Rue de L'Abbé-Roger-Derry 88492 Dijon",
                "04-32-85-52-25",
                "louane.joly@example.com",
                "https://randomuser.me/api/portraits/women/8.jpg"
        ));

        return stagiaires;
    }
}
