package actividad.azmitia.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> paises = new ArrayList<>();

        paises.add("Egipto");
        paises.add("Rumania");
        paises.add("India");
        paises.add("Australia");
        paises.add("Tailandia");
        paises.add("España");
        paises.add("Alemania");
        paises.add("Mexico");
        paises.add("Brasil");
        paises.add("Argentina");

        System.out.println("Orden alfabético");
        ordenarAlfa(paises);
        System.out.println("-------------------");
        System.out.println("Orden por longitud");
        ordenarLong(paises);

    }

    public static void ordenarAlfa(List<String> p){
        Collections.sort(p);
        for (String elemento:p){
            System.out.println(elemento);
        }
    }

    public static void ordenarLong(List<String> p){
        Comparator<String> c = Comparator.comparingInt(String::length);

        p.sort(c);
        for (String elemento:p){
            System.out.println(elemento);
        }
    }
}
