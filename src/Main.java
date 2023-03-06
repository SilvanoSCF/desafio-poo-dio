import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Logica");
        curso2.setDescricao("Descrição curso de logica");
        curso2.setCargaHoraria(12);



        //Conteudo conteudo = new Curso();    //Polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descricao");
        mentoria.setData(LocalDate.now());

        /*

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java");
        bootcamp.getConsteudos().add(curso1);
        bootcamp.getConsteudos().add(curso2);
        bootcamp.getConsteudos().add(mentoria);

        Dev devSilvano = new Dev();
        devSilvano.setNome("Silvano");
        devSilvano.insvreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Silvano" + devSilvano.getConteudosInscritos());
        devSilvano.progredir();
        devSilvano.progredir();

        devSilvano.progredir();

        System.out.println("Conteudo inscritos Silvano" + devSilvano.getConteudosInscritos());

        System.out.println("Conteudo Concluidos Silvano" + devSilvano.getConteudosConcluidos());

        System.out.println("XP:  " + devSilvano.calcularTotalXp());


        System.out.println("---------------------");

        Dev devSilvano2 = new Dev();
        devSilvano2.insvreverBootcamp(bootcamp);
        devSilvano.setNome("Silvano2");
        System.out.println("Conteudo inscritos " + devSilvano.getConteudosInscritos());
        devSilvano2.progredir();
        System.out.println("Conteudo inscritos " + devSilvano.getConteudosInscritos());
        System.out.println("Conteudo Concluidos " + devSilvano2.getConteudosConcluidos());
        System.out.println("XP:  " + devSilvano2.calcularTotalXp());





    }
}
