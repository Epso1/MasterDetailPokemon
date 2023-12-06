package com.example.masterdetailpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvNombre;
    private TextView tvDescripcion;

    private ImageView ivPokemonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNombre = findViewById(R.id.tvNombre);
        tvDescripcion = findViewById(R.id.tvDescripcion);
        ivPokemonImage = findViewById(R.id.ivImagen);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");
        tvNombre.setText(pokemon.getNombre());
        tvDescripcion.setText(pokemon.getDescripcion());
        ivPokemonImage.setImageResource(pokemon.getImagenResId());
    }
}