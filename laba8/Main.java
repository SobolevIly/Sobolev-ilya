package org.example;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(" 1 задание");
        List<String> list = new ArrayList<>(Arrays.asList("papa", "автобус", "игорь", "ресторан", "фонарь", "papa", "автобус", "автобус", "papa"));
        var stringStream = list.stream()
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream()
                .collect(groupingBy(Map.Entry::getValue, mapping(Map.Entry::getKey, toCollection(TreeSet::new))))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(longTreeSetEntry -> longTreeSetEntry.getValue().stream().limit(1).collect(joining(", ")))
                .orElse("");
        //.sorted(Comparator.comparingInt(contact -> contact.getLastName().length()))
        System.out.println(stringStream);
        System.out.println(" 2 задание ");
        List<Kontact> kontacts = Arrays.asList(
                new Kontact("Артем", "Борисов", 19, "+1239454"),
                new Kontact("Богдан", "Рабиновчи", 19, "+881235846"),
                new Kontact("Чарлик", "Лучший", 8, "+1256854"),
                new Kontact("Матвей", "Злобин", 30, "+4529123"),
                new Kontact("Илья", "Соболев", 21, "+45929123")
        );
        String part = "123";

        System.out.println(
                kontacts.stream()
                        .filter(contact -> contact.getPhone().contains(part))
                        .sorted((o1, o2) -> o2.getFirstName().codePointAt(0) - o1.getFirstName().codePointAt(0))
                        .map(Kontact::getFirstName)
                        .collect(Collectors.joining(", ", "Контакты: ", "."))
        );
    }

    }