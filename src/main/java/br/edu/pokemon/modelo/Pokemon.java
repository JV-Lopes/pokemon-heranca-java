package br.edu.pokemon.modelo;

public abstract class Pokemon {

    private String nome;
    private int nivel;
    private int hp;

    public Pokemon(String nome, int nivel, int hp) {
        this.nome  = nome;
        this.nivel = nivel;
        this.hp    = hp;
    }

    // Método abstrato: cada subclasse vai sobrescrever com seu ataque
    public abstract String atacar();

    // Método comum a todos os Pokémon
    public String apresentar() {
        return nome + " (Nível " + nivel + ") — HP: " + hp;
    }

    // Getters e Setters
    public String getNome()       { return nome; }
    public void setNome(String n) { this.nome = n; }

    public int getNivel()         { return nivel; }
    public void setNivel(int n)   { this.nivel = n; }

    public int getHp()            { return hp; }
    public void setHp(int hp)     { this.hp = hp; }

    @Override
    public String toString() {
        return "Pokemon{nome='" + nome + "', nivel=" + nivel + ", hp=" + hp + "}";
    }
}
