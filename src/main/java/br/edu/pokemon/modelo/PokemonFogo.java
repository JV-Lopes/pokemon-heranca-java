package br.edu.pokemon.modelo;

public class PokemonFogo extends Pokemon {

    private int temperaturaChama; // em graus Celsius

    public PokemonFogo(String nome, int nivel, int hp, int temperaturaChama) {
        super(nome, nivel, hp);
        this.temperaturaChama = temperaturaChama;
    }

    @Override
    public String atacar() {
        return getNome() + " usa LANÇA-CHAMAS! 🔥 "
             + "(Temperatura da chama: " + temperaturaChama + "°C)";
    }

    public int getTemperaturaChama()        { return temperaturaChama; }
    public void setTemperaturaChama(int t)  { this.temperaturaChama = t; }

    @Override
    public String toString() {
        return "PokemonFogo{nome='" + getNome() + "', nivel=" + getNivel()
             + ", hp=" + getHp() + ", temperaturaChama=" + temperaturaChama + "}";
    }
}
