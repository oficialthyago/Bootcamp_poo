import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static br.com.dio.desafio.dominio.Curso.calcularTotalXp;

public class Main {

 //------------------------------------------------------
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria curso java");
        mentoria.setData(LocalDate.now());


//-----------------------------------------------------------

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp ();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição curso de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThyago = new Dev();
        devThyago.setNome("Thyago");
        devThyago.inscreverBoocamp(bootcamp);
        System.out.println("Conteudos inscritos "+ devThyago.getConteudoInscritos());

        devThyago.progredir();
        devThyago.progredir();

        System.out.println("-");

        System.out.println("Conteudos inscritos "+ devThyago.getConteudoInscritos());
        System.out.println("Conteudos concluidos "+ devThyago.getConteudosConcluidos());
        System.out.println("Voce ganhou "+ devThyago.calcularTotalXp() +" XP");



        System.out.println("--------------");


        Dev devFelps = new Dev();
        devFelps.setNome("Felps");
        devFelps.inscreverBoocamp(bootcamp);
        System.out.println("Conteudos inscritos"+ devFelps.getConteudoInscritos());
        devFelps.progredir();
        devFelps.progredir();
        devFelps.progredir();

        System.out.println("-");
        System.out.println("Voce ganhou "+ devFelps.calcularTotalXp() +" XP");

        double totalXp = calcularTotalXp();
        if (totalXp == 150d) {
            System.out.println("Parabéns! Você completou o curso.");
        }

        System.out.println("Conteudos inscritos "+ devFelps.getConteudoInscritos());
        System.out.println("Conteudos concluidos "+ devFelps.getConteudosConcluidos());


    }


}