package com.example.appstagiaires;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ListStagiairesAdapter extends RecyclerView.Adapter<ListStagiairesAdapter.StagiaireViewHolder> {
    private LayoutInflater inflater;
    private LinkedList<Stagiaire> stagiaires = new LinkedList<>();

    public ListStagiairesAdapter(Context context, LinkedList<Stagiaire> stagiaires) {
        this.inflater = LayoutInflater.from(context);
        this.stagiaires = stagiaires;
    }

    @NonNull
    @Override
    public StagiaireViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = this.inflater.inflate(R.layout.recycler_view_item, parent, false);

        return new StagiaireViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull StagiaireViewHolder holder, int position) {
        Stagiaire currentStagiaire = stagiaires.get(position);
        holder.nomStagiaireView.setText(String.format("%s %s", currentStagiaire.getPrenom(), currentStagiaire.getNom()));
        holder.infosStagiaireView.setText(currentStagiaire.getAdresse());
        holder.photoStagiaireView.setImageResource(R.drawable.default_img);
    }

    @Override
    public int getItemCount() {
        return stagiaires.size();
    }

    class StagiaireViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView nomStagiaireView;
        public final TextView infosStagiaireView;
        public final ImageView photoStagiaireView;
        final ListStagiairesAdapter adapter;

        public StagiaireViewHolder(View itemView, ListStagiairesAdapter adapter) {
            super(itemView);
            nomStagiaireView = itemView.findViewById(R.id.nom);
            infosStagiaireView = itemView.findViewById(R.id.infos);
            photoStagiaireView = itemView.findViewById(R.id.photo);
            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();
            Stagiaire currentStagiaire = stagiaires.get(position);

            Context context = v.getContext();
            Intent intent = new Intent(context, DetailStagiaireActivity.class);
            intent.putExtra(Stagiaire.EXTRA_STAGIAIRE, currentStagiaire);

            context.startActivity(intent);
        }
    }

}
