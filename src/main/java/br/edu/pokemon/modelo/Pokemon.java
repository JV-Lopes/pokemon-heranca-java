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

    public abstract String atacar();

    public String apresentar() {
        return nome + " (Nível " + nivel + ") — HP: " + hp;
    }

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
