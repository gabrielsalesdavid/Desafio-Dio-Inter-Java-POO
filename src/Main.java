import br.com.desafio.dio.inter.java.poo.Bootcamp;
import br.com.desafio.dio.inter.java.poo.Curso;
import br.com.desafio.dio.inter.java.poo.Dev;
import br.com.desafio.dio.inter.java.poo.Mentoria;

import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso01 = new Curso();
        Curso curso02 = new Curso();

        Mentoria mentoria01 = new Mentoria();
        Mentoria mentoria02 = new Mentoria();

        curso01.setTitulo("Curso de Java");
        curso01.setDescricao("Java do Zero ao Avançado");
        curso01.setCargaHoraria(8);
        curso02.setTitulo("Curso de JS");
        curso02.setDescricao("Desvendando o JS");
        curso02.setCargaHoraria(10);

        mentoria01.setTitulo("Mentoria em Java");
        mentoria01.setDescricao("Java para iniciante");
        mentoria01.setData(LocalDate.now());
        mentoria02.setTitulo("Mentoria em JS");
        mentoria02.setDescricao("JS para iniciante");
        mentoria02.setData(LocalDate.now());

        curso01.toString();
        curso02.toString();

        mentoria01.toString();
        mentoria02.toString();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Formação Java");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria01);
        bootcamp.getConteudos().add(mentoria02);

        Dev dev01 = new Dev();
        Dev dev02 = new Dev();

        dev01.setNome("Dev 01");
        dev01.inscreverBootcamp(bootcamp);
        dev01.progresso();
        JOptionPane.showMessageDialog(null, "Conteudos Inscritos: " + dev01.getConteudosInscritos());
        JOptionPane.showMessageDialog(null, "Conteudos Concluídos:" + dev01.getConteudosConcluidos());

        dev02.setNome("Dev 02");
        dev02.inscreverBootcamp(bootcamp);
        dev02.progresso();
        JOptionPane.showMessageDialog(null, "Conteudos Inscritos:" + dev02.getConteudosInscritos());
        JOptionPane.showMessageDialog(null, "Conteudos Concluídos:" + dev02.getConteudosConcluidos());
    }
}