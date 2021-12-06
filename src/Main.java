import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlejandro = new Dev();
        devAlejandro.setNome("Alejandro");
        devAlejandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devAlejandro.getConteudosInscritos());
        devAlejandro.progredir();
        devAlejandro.progredir();
        System.out.println("Conteúdos inscritos: " + devAlejandro.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devAlejandro.getCounteudosConcluidos());
        System.out.println("XP: " + devAlejandro.calcularXpTotal());
        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devJoao.getCounteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXpTotal());
    }
}
