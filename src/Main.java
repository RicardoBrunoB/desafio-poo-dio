import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargahoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria para o curso de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
