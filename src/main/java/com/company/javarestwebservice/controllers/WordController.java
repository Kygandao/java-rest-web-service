package com.company.javarestwebservice.controllers;

import com.company.javarestwebservice.models.Quote;
import com.company.javarestwebservice.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordController {

    //HARD CODED DATA FOR EXAMPLES
    private static int idCounter = 1;

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word("bumfuzzle", "To confuse or fluster", idCounter++),
            new Word("cattywampus", "adjective: askew or awry; positioned diagonally; cater-cornered", idCounter++),
            new Word("fartlek", "A training technique associated with runners", idCounter++),
            new Word("shivoo", "A Boisterous party or celebration", idCounter++),
            new Word("snollygoster", "A clever, unscrupulous person", idCounter++),

            new Word("collywobbles", "Noun: used to describe your upset stomach; butterflies in your stomach", idCounter++),
            new Word("crapulence", "Noun: Sick from excessive drinking or eating", idCounter++),
            new Word("flummox", "To bewilder, confound, or confuse", idCounter++),
            new Word("gazump", "To cheat a house buyer by raising the agreed-upon price at the time a contract is to be signed", idCounter++),
            new Word("panjandrum", "Someone who claims to have a great deal of authority or influence", idCounter++)
    ));

    //GET ALL QUOTES
    @GetMapping("/words")
    @ResponseStatus(value = HttpStatus.OK)

    public List<Word> allWords() {
        return wordList;
    }

    //GET QUOTE BY ID
    @GetMapping("/words/{id}")
    @ResponseStatus(value = HttpStatus.OK)

    public Word getWordById(@PathVariable int id) {
        Word foundWord = null;

        for(Word word : wordList) {
            if(word.getId() == id) {
                foundWord = word;
                break;
            }
        }
        return foundWord;
    }
}
