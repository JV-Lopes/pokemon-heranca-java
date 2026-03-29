package main.java.br.edu.pokemon.modelo;

public class PokemonAgua extends Pokemon {

    private int profundidadeMar;

    public PokemonAgua(String nome, int nivel, int hp, int profundidadeMar) {
        super(nome, nivel, hp);
        this.profundidadeMar = profundidadeMar;
    }

    @Override
    public String atacar() {
        return getNome() + " usa HIDROBOMBA! 💧 "
             + "(Profundidade do mar: " + profundidadeMar + "m)";
    }

    public int getProfundidadeMar()       { return profundidadeMar; }
    public void setProfundidadeMar(int p) { this.profundidadeMar = p; }

    @Override
    public String toString() {
        return "PokemonAgua{nome='" + getNome() + "', nivel=" + getNivel()
             + ", hp=" + getHp() + ", profundidadeMar=" + profundidadeMar + "}";
    }
}