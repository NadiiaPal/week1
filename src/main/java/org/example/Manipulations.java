package org.example;

import java.util.HashSet;

public class Manipulations {
    public static Character[] fillListCharacters(String[] sentences){
        HashSet<Character> chars = new HashSet<Character>();
        for(int i = 0; i < sentences.length; i++){
            String[] splitted = sentences[i].toLowerCase().split(" ");
            for(int j = 0; j< splitted.length;j++) {
                for (int k = 0; k < splitted[j].length(); k++) {
                    chars.add(splitted[j].charAt(k));
                }
            }
        }
        Character[] array = new Character[chars.size()];
        chars.toArray(array);
        return array;
    }
}
