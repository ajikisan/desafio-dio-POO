/**
* Classe Main - Execução do programa
* Uma instância de uma classe é um novo objeto criado dessa classe, com o operador new.
* Polimorfismo - pode-se instanciar algo a partir da classe Pai Conteúdo.
* Exemplo: List<String> palavras = new ArrayList<>();
* Conteudo conteudo = new Curso();
* Conteudo mentoria = new Mentoria();
*
*/

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
  //Instanciar Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução a linguagem Java");
        curso1.setDescricao("Java é uma linguagem de programação orientada a objeto " +
        "e desenvolvida pela Sun Microsystems na década de 90, que atualmente, pertence a Oracle.");
        curso1.setCargaHoraria(20);
        //System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript Completo");
        curso2.setDescricao("JavaScript é uma linguagem de programação interpretada estruturada, " +
        "de script em alto nível com tipagem dinâmica fraca e multiparadigma.");
        curso2.setCargaHoraria(16);


        Curso curso3 = new Curso();
        curso3.setTitulo("HTML para Iniciantes");
        curso3.setDescricao("Conhecida em inglês como Hypertext Markup Language, ela permite que os " +
         "desenvolvedores desenhem como serão exibidos pelo navegador os elementos da página, como texto," +
         "hiperlinks e arquivos multimídia.");
        curso3.setCargaHoraria(10);

     //Instanciar Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Abstraindo um Bootcamp Usando Orientaçao a Objetos em Java");
        mentoria.setDescricao("Desmistifique a Programação Orientada a Objetos (POO) com Java e pratique esse" +
        " conceito fundamental");
        mentoria.setData(LocalDate.now());

/**
        System.out.println(curso1);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(curso2);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(curso3);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(mentoria);
*/

     //Instanciar Bootcamp

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Code Developer");
        bootcamp.setDescricao("Um novo desafio a cada aula para você entender a teoria e aprender praticando.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);


        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Fullstack Developer");
        bootcamp2.setDescricao("Aprenda todas as etapas e partes de um sistema, como o servidor e o " +
                "banco de dados.");
        bootcamp2.getConteudos().add(mentoria);
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);


    //Instanciando Developers
        Dev devMirian = new Dev();
        devMirian.setNome("Mirian Ajiki Molicawa");
        devMirian.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos para Mirian: "
                + devMirian.getConteudosInscritos());

        devMirian.progredir();
        System.out.println("Conteúdos inscritos para Mirian, após o primeiro progresso : "
                + devMirian.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Mirian, após o primeiro progresso : "
                + devMirian.getConteudosConcluidos());

        devMirian.progredir();
        System.out.println("Conteúdos inscritos para Mirian, após o segundo progresso: "
                + devMirian.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Mirian, após o segundo progresso: "
                + devMirian.getConteudosConcluidos());


        devMirian.progredir();
        System.out.println("Conteúdos inscritos para Mirian, após o terceiro progresso: "
                + devMirian.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Mirian, após o terceiro progresso: "
                + devMirian.getConteudosConcluidos());

        devMirian.progredir();
        System.out.println("Conteúdos inscritos para Mirian, após o quarto progresso: "
                + devMirian.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Mirian, após o quarto progresso: "
                + devMirian.getConteudosConcluidos());

        System.out.println("Mirian, bootcamp score : "
                +  devMirian.calcularXp());

        System.out.println("*************************************************************");

        Dev devSan = new Dev();
        devSan.setNome("San");
        devSan.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos inscritos para San: "
        + devSan.getConteudosInscritos());
        devSan.progredir();
        System.out.println("Conteúdos concluídos para San: "
                + devSan.getConteudosConcluidos());

        System.out.println("Pontuação XP de San: "
                +  devSan.calcularXp());
    }

}
