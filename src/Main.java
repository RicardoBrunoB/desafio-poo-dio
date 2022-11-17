import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso C#");
        curso3.setDescricao("Descrição curso C#");
        curso3.setCargahoraria(8);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso C++");
        curso4.setDescricao("Descrição curso C++");
        curso4.setCargahoraria(7);

        Curso curso5 = new Curso();
        curso5.setTitulo("Curso SQL");
        curso5.setDescricao("Descrição curso SQL");
        curso5.setCargahoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria para o curso de Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria C#");
        mentoria2.setDescricao("Mentoria para o curso de C#");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp C# Developer");
        bootcamp2.setDescricao("Descrição Bootcamp C# Developer");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(curso5);
        bootcamp2.getConteudos().add(mentoria2);

//      System.out.println(curso1);
//      System.out.println(curso2);
//      System.out.println(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: \n" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\nConteudos Concluídos João: \n" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

        System.out.println("\n*------------------------------------------------*");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria: \n" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("\nConteudos Concluídos Maria: \n" + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularXp());

        System.out.println("\n*------------------------------------------------*");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos Inscritos Jose: \n" + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("\nConteudos Concluídos Jose: \n" + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularXp());

    }
}
