package com.example.appstagiaires;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailStagiaireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_stagiaire);

        Intent intent = getIntent();
        Stagiaire stagiaire = (Stagiaire) intent.getSerializableExtra(Stagiaire.EXTRA_STAGIAIRE);

        TextView nomTextView = findViewById(R.id.detailNom);
        nomTextView.setText(stagiaire.getPrenom() + " " + stagiaire.getNom());
    }
}
