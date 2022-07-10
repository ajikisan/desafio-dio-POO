/**
 *  Herança e Polimorfismo
 *
 *  Developer - Realiza o desenvolvimento técnico e visual de páginas da internet e manutenção de sites,
 *  definindo linguagens, bancos de dados, armazenamento e atualização de informações.
 *  Um dev pode se inscrever no mesmo curso e na mesma mentoria? Não! Portanto, utilizou-se LinkedHashSet
 *  para guardar os nomes na ordem.
 *  A medida em que o dev for progredindo calcula-se XP.
 *  Polimorfismo- iniciado um Hashset a partir de outro HashSet, exemplo de Acoplamento
 *  private HashSet<Conteudo> conteudosInscritos = new LinkedHashSet<>();
 *  Optional - resolve retorno nulos no método
 *
 */

package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

// Métodos sem retorno - Regras de Negócio
// Ao houver inscrição o conteúdo do curso e da mentoria serão adicionados ao perfil do DEV.
public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
}

// O desenvolvedor terá progresso a cada curso concluído na ordem que foi adicionado na plataforma;
public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

    if (conteudo.isPresent()) {
        //colocar
        this.conteudosConcluidos.add(conteudo.get());
        //remover
        this.conteudosInscritos.remove(conteudo.get());
    } //Caso esteja vazio
    else {
        System.err.println("Você não está inscrito em nenhum conteúdo!");
    }
}

//Método com retorno - Para cada conclusão aparece o cálculo da pontuação do XP
public double  calcularXp () {
    return this.conteudosConcluidos
            .stream()
            .mapToDouble(Conteudo::calcularXp)   // .mapToDouble(conteudo -> conteudo.calcularXp())
            .sum();
 }

//Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //Métodos HashCode()


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
                && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
