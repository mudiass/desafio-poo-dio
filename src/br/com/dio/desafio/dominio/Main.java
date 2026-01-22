
package pacote.desafio;

import pacote.desafio.dominio.*;
import java.time.LocalDate;

public class Main {

public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Java Básico");
    curso1.setDescricao("Fundamentos da linguagem");
    curso1.setCargaHoraria(8);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria Java");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria1);

    Dev devFulano = new Dev();
    devFulano.setNome("Fulano");
    devFulano.inscreverBootcamp(bootcamp);

    System.out.println("Inscritos Fulano: " + devFulano.getConteudosInscritos());
    devFulano.progredir(); // Conclui o primeiro conteúdo (Curso)
    System.out.println("-");
    System.out.println("Concluídos Fulano: " + devFulano.getConteudosConcluidos());
    System.out.println("XP Total: " + devFulano.calcularTotalXp());
}
}