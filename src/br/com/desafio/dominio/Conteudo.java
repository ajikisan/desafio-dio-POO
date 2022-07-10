/**
 * Herança
 * Conteúdo é o conjunto de valores, conhecimentos, habilidades e atitudes que garante o desenvolvimento
 * e a socialização do estudante. Pode ser classificado como conceitual (que envolve a abordagem de conceitos,
 * fatos e princípios), procedimental (saber fazer) e atitudinal (saber ser).
 *
 * As classes filhas Curso e Mentoria se encaixam numa classe mais genérica chamada Classe Conteúdo.
 * Para simplificação do código, evitando a repetição, as classes filhas vão utilizar os atributos títulos e
 * descrição, além do método calcular XP.
 *  * Curso e Mentoria se encaixam numa classe mais genérica chamada Classe Conteúdo e esta será criada com um
 * valor constante 10 para XP (pontos de experiência).
 *
 * final - Palavra reservada para constante, classe ou método.
 *
 * Modificadores de acesso: Public, Private e Protected
 * static - Curso e Mentoria poderáo acessar XP_PADRAO, pois a constante está numa classe protegida.
 * Para que as classes filhas utilizem os atributos títulos e descrição e o método calcular XP
 * foi criada a classe abstrata que não consegue instanciar o conteúdo, ou seja, simplifica o código.
 *
 */

package br.com.desafio.dominio;

public abstract class Conteudo {
   //Atribuição de constante
   protected static final double XP_PADRAO = 10d;

   //Atributos
   private String titulo;
   private String descricao;

   //Herança
   public abstract double calcularXp();

   //Getter and Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
