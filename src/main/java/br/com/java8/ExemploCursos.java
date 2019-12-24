package br.com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python",45));
        cursos.add(new Curso("Java 8",114));
        cursos.add(new Curso("JavaScript",150));
        cursos.add(new Curso("C",55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        int soma = cursos.stream()
                .filter(c-> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos).sum();

        System.out.println(soma);

        OptionalDouble media = cursos.stream()
                .filter(c-> c.getAlunos() >=100)
                .mapToInt(Curso::getAlunos)
                .average();

        cursos.stream()
                .filter(c-> c.getAlunos()>=50)
                .forEach(c->System.out.println(c.getNome()));

        cursos.stream()
                .filter(c->c.getAlunos() >=100)
                .findAny()
                .ifPresent(c->System.out.println(c.getNome()));

        Optional<Curso> optionalCurso =  cursos.stream()
                .filter(c->c.getAlunos() >=100)
                .findAny();

        cursos.stream()
                .filter(c-> c.getAlunos()>=100)
                .collect(Collectors.toList());

        cursos.stream()
                .filter(c-> c.getAlunos() >=100)
                .collect(Collectors.toMap(
                        c-> c.getNome(),
                        c-> c.getAlunos()))
                .forEach((nome,alunos) -> System.out.println(nome + " tem " +alunos + " alunos"));


        Curso curso = optionalCurso.orElse(null);
        System.out.println(curso.getNome());
    }
}
