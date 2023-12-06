package com.example.masterdetailpokemon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {
    private List<Pokemon> pokemons;
    private Context context;

    public PokemonAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.elemento_pokemon, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemons.get(position);
        holder.tvPokemonName.setText(pokemon.getNombre());
        holder.ivPokemonImage.setImageResource(pokemon.getImagenResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("pokemon", pokemon);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return pokemons == null ? 0 : pokemons.size();
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        notifyDataSetChanged();
    }

    class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView tvPokemonName;
        ImageView ivPokemonImage;

        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPokemonName = itemView.findViewById(R.id.tvPokemonName);
            ivPokemonImage = itemView.findViewById(R.id.ivPokemonImage);
        }
    }
}