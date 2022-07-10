/**
* Curso é uma série de palestras ou lições sobre um determinado assunto, levando a um exame ou qualificação.
* Modificadores de acesso: Public, Private e Protected
* A classe Curso é filho da classe Conteúdo, logo, pode-se apagar os atributos (título e descrição) além,
* do método Getter and Setter repetidos.
* Regra de Negócio: ao concluir o curso vai pegar o XP Padrão e multiplicar pela carga horária;
*
*/
package br.com.desafio.dominio;

public class Curso extends Conteudo {
    //Atributo
    private int cargaHoraria;

    //Método abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){
    };


    //Método Getter and Setter (alt+insert)
    private int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Método toString para impressão (alt+insert)
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}



