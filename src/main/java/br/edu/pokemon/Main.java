package br.edu.pokemon;

import br.edu.pokemon.modelo.Pokemon;
import br.edu.pokemon.modelo.PokemonFogo;
import br.edu.pokemon.modelo.PokemonAgua;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PokemonFogo charmander = new PokemonFogo("Charmander", 12, 78, 1200);
        PokemonAgua squirtle   = new PokemonAgua("Squirtle",   10, 82, 45);

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(charmander);
        pokemons.add(squirtle);

        System.out.println("=== Batalha Pokémon ===\n");

        for (Pokemon p : pokemons) {
            System.out.println(p.apresentar());
            System.out.println(p.atacar());
            System.out.println(p.toString());
            System.out.println("---");
        }
    }
}