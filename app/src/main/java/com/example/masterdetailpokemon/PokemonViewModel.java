package com.example.masterdetailpokemon;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class PokemonViewModel extends ViewModel {
    private MutableLiveData<List<Pokemon>> pokemons;
    private PokemonRepository repo;

    public PokemonViewModel() {
        repo = new PokemonRepository();
        pokemons = repo.getPokemons();
    }

    public LiveData<List<Pokemon>> getPokemons() {
        return pokemons;
    }
}