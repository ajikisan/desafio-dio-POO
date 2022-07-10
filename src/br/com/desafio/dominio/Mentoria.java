/**
 * Mentoria é o processo de crescimento profissional acompanhado por um mentor,
 * profissional experiente que compartilha com você experiências de sucesso.
 * Modificadores de acesso: Public, Private e Protected
 * Extends - palavra reservada para dizer que é filha da classe Pai
 * A classe Mentoria é filha da classe Conteúdo, logo, pode-se apagar os atributos (título e descrição)
 * além, do método Getter and Setter repetidos.
 * E implementar o método abstrato calcularXp() em conteúdo.
 * A regra do negócio: Quando iniciar uma mentoria vai pegar o XP Padrão e adicionar +20 de XP
 *
 */
package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //Atributo
    private LocalDate data;

    //Método Abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //Método Getter and Setter
   public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Método toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
