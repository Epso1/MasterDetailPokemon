package com.example.masterdetailpokemon;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class PokemonRepository {
    private MutableLiveData<List<Pokemon>> pokemons;

    public PokemonRepository() {
        pokemons = new MutableLiveData<>();
        // Aquí deberías cargar los datos de los Pokemon
        List<Pokemon> listaPokemon = new ArrayList<>();

        listaPokemon.add(new Pokemon("Bulbasaur", "Bulbasaur es un Pokémon de tipo planta/veneno introducido en la primera generación. Es uno de los Pokémon iniciales que puede elegir el jugador al comenzar la aventura en Pokémon Rojo, Azul, Verde y Amarillo. Es el Pokémon número 001 de la Pokédex Nacional.", R.drawable.bulbasaur));
        listaPokemon.add(new Pokemon("Ivysaur", "Ivysaur es un Pokémon de tipo planta/veneno introducido en la primera generación. Es la evolución de Bulbasaur. Es el Pokémon número 002 de la Pokédex Nacional.", R.drawable.ivysaur));
        listaPokemon.add(new Pokemon("Venusaur", "Venusaur es un Pokémon de tipo planta/veneno introducido en la primera generación. Es la evolución de Ivysaur. Es el Pokémon número 003 de la Pokédex Nacional.", R.drawable.venusaur));
        listaPokemon.add(new Pokemon("Charmander", "Charmander es un Pokémon de tipo fuego introducido en la primera generación. Es uno de los Pokémon iniciales que puede elegir el jugador al comenzar la aventura en Pokémon Rojo, Azul, Verde y Amarillo. Es el Pokémon número 004 de la Pokédex Nacional.", R.drawable.charmander));
        listaPokemon.add(new Pokemon("Charmeleon", "Charmeleon es un Pokémon de tipo fuego introducido en la primera generación. Es la evolución de Charmander. Es el Pokémon número 005 de la Pokédex Nacional.", R.drawable.charmeleon));
        listaPokemon.add(new Pokemon("Charizard", "Charizard es un Pokémon de tipo fuego/volador introducido en la primera generación. Es la evolución de Charmeleon. Es el Pokémon número 006 de la Pokédex Nacional.", R.drawable.charizard));
        listaPokemon.add(new Pokemon("Squirtle", "Squirtle es un Pokémon de tipo agua introducido en la primera generación. Es uno de los Pokémon iniciales que puede elegir el jugador al comenzar la aventura en Pokémon Rojo, Azul, Verde y Amarillo. Es el Pokémon número 007 de la Pokédex Nacional.", R.drawable.squirtle));
        listaPokemon.add(new Pokemon("Wartortle", "Wartortle es un Pokémon de tipo agua introducido en la primera generación. Es la evolución de Squirtle. Es el Pokémon número 008 de la Pokédex Nacional.", R.drawable.wartortle));
        listaPokemon.add(new Pokemon("Blastoise", "Blastoise es un Pokémon de tipo agua introducido en la primera generación. Es la evolución de Wartortle. Es el Pokémon número 009 de la Pokédex Nacional.", R.drawable.blastoise));
        listaPokemon.add(new Pokemon("Caterpie", "Caterpie es un Pokémon de tipo bicho introducido en la primera generación. Es el Pokémon número 010 de la Pokédex Nacional.", R.drawable.caterpie));
        listaPokemon.add(new Pokemon("Metapod", "Metapod es un Pokémon de tipo bicho introducido en la primera generación. Es la evolución de Caterpie. Es el Pokémon número 011 de la Pokédex Nacional.", R.drawable.metapod));
        listaPokemon.add(new Pokemon("Butterfree", "Butterfree es un Pokémon de tipo bicho/volador introducido en la primera generación. Es la evolución de Metapod. Es el Pokémon número 012 de la Pokédex Nacional.", R.drawable.butterfree));
        listaPokemon.add(new Pokemon("Weedle", "Weedle es un Pokémon de tipo bicho/veneno introducido en la primera generación. Es el Pokémon número 013 de la Pokédex Nacional.", R.drawable.weedle));
        listaPokemon.add(new Pokemon("Kakuna", "Kakuna es un Pokémon de tipo bicho/veneno introducido en la primera generación. Es la evolución de Weedle. Es el Pokémon número 014 de la Pokédex Nacional.", R.drawable.kakuna));
        listaPokemon.add(new Pokemon("Beedrill", "Beedrill es un Pokémon de tipo bicho/veneno introducido en la primera generación. Es la evolución de Kakuna. Es el Pokémon número 015 de la Pokédex Nacional.", R.drawable.beedrill));
        listaPokemon.add(new Pokemon("Pidgey", "Pidgey es un Pokémon de tipo normal/volador introducido en la primera generación. Es el Pokémon número 016 de la Pokédex Nacional.", R.drawable.pidgey));
        listaPokemon.add(new Pokemon("Pidgeotto", "Pidgeotto es un Pokémon de tipo normal/volador introducido en la primera generación. Es la evolución de Pidgey. Es el Pokémon número 017 de la Pokédex Nacional.", R.drawable.pidgeotto));
        listaPokemon.add(new Pokemon("Pidgeot", "Pidgeot es un Pokémon de tipo normal/volador introducido en la primera generación. Es la evolución de Pidgeotto. Es el Pokémon número 018 de la Pokédex Nacional.", R.drawable.pidgeot));
        listaPokemon.add(new Pokemon("Rattata", "Rattata es un Pokémon de tipo normal introducido en la primera generación. Es el Pokémon número 019 de la Pokédex Nacional.", R.drawable.rattata));
        listaPokemon.add(new Pokemon("Raticate", "Raticate es un Pokémon de tipo normal introducido en la primera generación. Es la evolución de Rattata. Es el Pokémon número 020 de la Pokédex Nacional.", R.drawable.raticate));


        pokemons.setValue(listaPokemon);
    }

    public MutableLiveData<List<Pokemon>> getPokemons() {
        return pokemons;
    }
}