package br.com.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Datas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE,5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje,olimpiadasRio);
        System.out.println(periodo.getDays());
    }
}
