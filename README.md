# Sistema de Batalha Pokémon — Herança em Java

## Integrantes
- José Vieira Lopes Neto — RA: 42413224
- Gabriel de Carvalho Andrade -RA: 42521801

## Descrição do tema

Este projeto implementa um sistema de batalha Pokémon utilizando
herança em Java. A superclasse abstrata `Pokemon` define atributos
comuns como nome, nível e HP, além do método abstrato `atacar()`.

As subclasses `PokemonFogo` e `PokemonAgua` herdam de `Pokemon` e
sobrescrevem `atacar()` com comportamentos específicos de cada tipo,
demonstrando polimorfismo. No `Main.java`, os objetos são armazenados
em uma `List<Pokemon>` e os métodos são chamados polimorficamente.

## Hierarquia
- `Pokemon` (superclasse abstrata)
  - `PokemonFogo` — atributo: temperaturaChama
  - `PokemonAgua` — atributo: profundidadeMar
