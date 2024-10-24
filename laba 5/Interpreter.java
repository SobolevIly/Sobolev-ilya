package org.example;
import java.util.*;


public class Interpreter {
    private Map<String, LinkedHashSet<String>> dict = new TreeMap<>(Collections.reverseOrder());

        public void add(String word, String translation) {
        for (Map.Entry<String, LinkedHashSet<String>> entry : dict.entrySet()) {
            if (!entry.getKey().equals(word) && entry.getValue().contains(translation)) {
                System.out.println("Предупреждение: перевод '" + translation + "' уже существует для слова '" + entry.getKey() + "'");
            }
        }
        dict.computeIfAbsent(word, _ -> new LinkedHashSet<>()).add(translation);
    }
    public void get(String word)
    {
        System.out.println(dict.get(word));
    }
    public void printAll() {
        System.out.println(dict.entrySet());
    }
}

