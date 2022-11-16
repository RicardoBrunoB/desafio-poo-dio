package br.com.dio.dominio;

public class Curso extends Conteudo{
    private int cargahoraria;

    public int getCargahoraria() {
        return cargahoraria;
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public Curso(){
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

}
