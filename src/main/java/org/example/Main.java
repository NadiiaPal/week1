package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

import static org.example.Manipulations.fillListCharacters;

public class Main {
    public static void main(String[] args) {

        String[] sentences = { "This sentence must be edited", "Lorem input", "My edition"};

        Character[] characters;
        characters = fillListCharacters(sentences);

        for(int i = 0; i<characters.length; i++){
            System.out.print(characters[i]);
        }
    }
}