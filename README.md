<h1 align="center">
  <p align="center">Learning_Java :coffee: </p>
  <a><img height="250" src="https://user-images.githubusercontent.com/63310044/205043136-2b938c2c-7f16-4c68-9db3-99888f87c6e8.jpg" alt="Java banner"></a>
</h1>

<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>

## Descrição :scroll:
Neste repositório demonstro como está caminhando meu aprendizado com a linguagem Java, desde de toda parte teórica até a parte prática com exemplos de cada tópico.


## Sumário :books:
* [Inicio](https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--inicio-snail) 	:snail:
  * Estrutura sequencial
  * Estrutura condicional
  * Estruturas repetitivas
* [Introdução à Programação Orientada a Objetos](https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--introdu%C3%A7%C3%A3o-%C3%A0-programa%C3%A7%C3%A3o-orientada-a-objetos-wave) :wave:
  * Construtores, palavra this, sobrecarga, encapsulamento
  * Comportamento de memória, arrays, listas
  * Tópicos especiais em Java
  * Enumerações, composição
  * Herança e polimorfismo
  * Tratamento de exceções
* [Projeto Sistema Jogo de Xadrez](https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--projeto-sistema-jogo-de-xadrez-chess_pawn) :chess_pawn:
* [POO e Programação Funcional](https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--poo-e-programa%C3%A7%C3%A3o-funcional-computer) :computer:
  * Trabalhando com arquivos
  * Interfaces
  * Generics, Set, Map
  * Programação funcional e expressões lambda
  * Acesso a banco de dados com JDBC
  * Interface Gráfica com JavaFX
* [Projeto aplicação desktop com JavaFX e banco de dados MySQL com JDBC](
https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--projeto-aplica%C3%A7%C3%A3o-desktop-com-javafx-e-banco-de-dados-mysql-com-jdbc-desktop_computer) :desktop_computer:
* [Projeto Web services com Spring Boot e JPA / Hibernate](https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--projeto-web-services-com-spring-boot-e-jpa--hibernate-shamrock) :shamrock:
* [Projeto Web services com Spring Boot e NoSQL (MongoDB)](https://github.com/caiocfpeixoto/Learning_Java/edit/master/README.md#--projeto-web-services-com-spring-boot-e-nosql-mongodb-four_leaf_clover) :four_leaf_clover:

<h2 align="center">
  <p align="center">Inicio :snail:</p>
</h2>

## Estrutura sequencial
* Operadores aritméticos

<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205053582-7749b0ad-b524-4115-9753-d1f3bd673a02.png"/>
</p>

* Declaração de variáveis: <tipo> <nome> = valor;
* Tipos primitivos:
  * Números inteiros: byte, short, int, long
  * Números com ponto flutuante: float, double
  * Valor verdade: boolean
  * Um caractere Unicode: char
* Tipo String: cadeia de caracteres (palavras, textos)
* Nomes de variáveis / padrão camel case
* Para escrever na tela um texto qualquer
  * System.out.print
  * System.out.println
  * System.out.printf
    * %d
    * %f
    * %s
    * %n
* Para considerar o separador de decimais como ponto, <strong>ANTES</strong> da declaração do Scanner, faça:
  * Locale.setDefault(Locale.US);
* Processamento de dados
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205056022-5f204ccb-01a6-4902-971a-cb6990309fca.png"/>
</p>

* Casting
  * É a conversão explícita de um tipo para outro.É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.
* Entrada de dados 
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205056621-8140de65-97a1-488f-8dcf-334e77a41c87.png"/>
</p>

* Scanner
  * next()
  * nextInt()
  * nextDouble()
  * next().charAt(0)
* Locale
* Como ler até a quebra de linha
  * nextLine()
  * como limpar o buffer de leitura
* Funções matemáticas
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205057410-d8028451-a69d-4b3e-9370-9bb66c1ca6d8.png"/>
</p>

## Estrutura condicional
* Operadores Comparativos
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205712485-2858739f-c2d4-43c2-9bb4-99120022b92d.png"/>
</p>

* Operadores Lógicos
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205712727-b8d9c125-15be-408c-8296-8fe171fd55ae.png"/>
</p>

* Sintaxe da estrutura Condicional
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205713222-4e6be258-2307-4f92-a0ea-8f92c6a521e1.png"/>
</p>

* Sintaxe da estrutura Switch-Case
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205713575-a45be4a9-2a37-4700-82d7-783a0fcc561a.png"/>
</p>

* Expressão condicional ternária
  * Estrutura opcional ao if-else quando se deseja decidir um <strong>VALOR</strong> com base em uma condição.
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205713837-fb121932-c90d-450f-a47c-1427d87f3ce4.png"/>
</p>

* Escopo e inicialização
  * Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
  * Uma variável não pode ser usada se não for iniciada

## Estruturas repetitivas
* Estrutura Repetitiva While
  * É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
  * Quando usar: quando <strong>não</strong> se sabe previamente a quantidade de repetições que será realizada.
* Sintaxe:
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205715991-0168ae62-61c8-42a3-8f20-5d3161f9104a.png"/>
</p>

* Estrutura Repetitiva For
  * É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
  * Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
* Sintaxe:
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205716761-5b76dd13-c4c1-489b-add8-e9af4e5614da.png"/>
</p>

* Estrutura Repetitiva Do-While
  * O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
* Sintaxe:
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205717029-a30cdb32-6d53-43f4-8a13-4f449181e740.png"/>
</p>

<h2 align="center">
  <p align="center">Introdução à Programação Orientada a Objetos :wave:</p>
</h2>

* Classes: É um tipo estruturado que pode conter (membros):
    * Atributos (dados / campos)
    * Métodos (funções / operações)
  * A classe também pode prover muitos outros recursos, tais como:
    * Construtores
    * Sobrecarga
    * Encapsulamento
    * Herança
    * Polimorfismo
  * Exemplos:
    * Entidades: Produto, Cliente, Triangulo
    * Serviços: ProdutoService, ClienteService, EmailService, StorageService
    * Controladores: ProdutoController, ClienteController
    * Utilitários: Calculadora, Compactador
    * Outros (views, repositórios, gerenciadores, etc.)
* Classe: é a definição do tipo
* Objetos: são instâncias da classe
* Métodos:
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205746574-e50b1eb2-c632-4361-bbd6-30b44a705d72.png"/>
</p>

* Exemplo de diagrama UML:
<p align="center">
<img src="https://user-images.githubusercontent.com/63310044/205746745-8f93fbc3-791b-407a-9281-ee3eb440196d.png"/>
</p>

* Classe Object: Toda classe em Java é uma subclasse da classe Object
* Object possui os seguintes métodos:
  * getClass- retorna o tipo do objeto
  * equals - compara se o objeto é igual a outro
  * hashCode - retorna um código hash do objeto
  * toString - converte o objeto para string
  
* Membros Estático: Também chamados membros de classe
  * Em oposição a membros e instância
  * São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
  * Aplicações comuns:
    * Classes utilitárias
    * Declaração de constantes
  * Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

## Construtores, palavra this, sobrecarga, encapsulamento

## Comportamento de memória, arrays, listas

## Tópicos especiais em Java

## Enumerações, composição

## Herança e polimorfismo

## Tratamento de exceções

<h2 align="center">
  <p align="center">Projeto Sistema Jogo de Xadrez :chess_pawn:</p>
</h2>

## Descrição :scroll:
Neste tópico será mostrado o primeiro projeto usando os conteúdos aprendidos anteriormente.

* Composição de objetos, herança, coleções, etc.
* Desenvolvimento em camadas
* Padrões de projetos

<h2 align="center">
  <p align="center">POO e Programação Funcional :computer:</p>
</h2>

## Trabalhando com arquivos

## Interfaces

## Generics, Set, Map

## Programação funcional e expressões lambda

## Nivelamento Álgebra Relacional, SQL, MySQL

## Acesso a banco de dados com JDBC

## Interface Gráfica com JavaFX

<h2 align="center">
  <p align="center">Projeto aplicação desktop com JavaFX e banco de dados MySQL com JDBC :desktop_computer:</p>
</h2>

## Descrição :scroll:
Neste tópico será mostrado o primeiro projeto usando os conteúdos aprendidos anteriormente.

* Padrão MVC - Model View Controller
* FXML, SceneBuilder
* Tratamento de eventos de UI
* Padrões de projetos
* CRUD completo
* Padrão Camadas

<h2 align="center">
  <p align="center">Projeto Web services com Spring Boot e JPA / Hibernate :shamrock:</p>
</h2>

## Descrição :scroll:
Neste tópico será mostrado o primeiro projeto usando os conteúdos aprendidos anteriormente.

* Padrão camadas
* Web e HTTP
* REST / web services
* Nivelamento ORM com JPA / Hibernate
* Modelo de domínio complexo
* Maven
* Banco de dados H2
* Spring Data JPA
* CRUD completo
* Tratamento de exceções

<h2 align="center">
  <p align="center">Projeto Web services com Spring Boot e NoSQL (MongoDB) :four_leaf_clover:</p>
</h2>

## Descrição :scroll:
Neste tópico será mostrado o primeiro projeto usando os conteúdos aprendidos anteriormente.

* Nivelamento NoSQL e MongoDB
* Modelo de domínio: agregados e desnormalização
* Padrão DTO
* Spring Data MongoDB
* CRUD completo
* Tratamento de exceções
