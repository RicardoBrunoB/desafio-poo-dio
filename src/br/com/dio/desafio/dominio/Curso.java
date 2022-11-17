package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargahoraria;

    public int getCargahoraria() {
        return cargahoraria;
    }

    @Override
    public double calcularXp() {
        return cargahoraria;
    }

    public Curso(){
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "\nCurso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

}
