![thumbnail-Desafio Java](https://user-images.githubusercontent.com/66698429/225426397-327dc314-7e00-4ed7-8875-e68d0317e995.png)


# Projeto Alura - Minhas Músicas

Este projeto faz parte do segundo desafio da Formação Java da Alura, a maior escola de programação online. O objetivo do projeto é criar uma aplicação para gerenciar músicas e podcasts favoritos. Alterei partes do codigo pelo meu gosto pessoal.

## Descrição do Projeto

O projeto consiste em uma classe principal chamada `Principal` que contém o método `main` onde a execução do programa se inicia. Dentro desse método, são criadas instâncias das classes `Musica`, `Podcast` e `Preferidas`, pertencentes ao pacote `br.com.alura.minhasmusicas.modelos`.

A classe `Musica` representa uma música e possui atributos como título e cantor. Ela também possui métodos para reproduzir e curtir a música.

A classe `Podcast` representa um podcast e possui atributos como título e host. Ela também possui métodos para reproduzir e curtir o podcast.

Dentro do método `main`, são feitas algumas iterações em um loop `for`, que executa 6000 vezes. Dentro desse loop, são feitas verificações utilizando operadores `%` para determinar se o índice atual do loop é divisível por 3 ou 2.

Se o índice for divisível por 3, a música é reproduzida e, se o índice também for divisível por 2, a música é curtida.

Se o índice for divisível por 2, o podcast é reproduzido e, se o índice também for divisível por 3, o podcast é curtido.

No final do loop, as instâncias de `Musica` e `Podcast` são adicionadas à instância de `Preferidas`, que representa a lista de músicas e podcasts favoritos.

## Execução

Para executar o projeto, basta rodar a classe `Principal` que contém o método `main`. Durante a execução, serão reproduzidas músicas e podcasts de acordo com as condições definidas no loop.

## Requisitos

- JDK (Java Development Kit) instalado
- Ambiente de desenvolvimento Java (IDE) ou um compilador Java




