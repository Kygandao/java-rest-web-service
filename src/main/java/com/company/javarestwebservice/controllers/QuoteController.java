package com.company.javarestwebservice.controllers;

import com.company.javarestwebservice.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuoteController {

    //HARD CODED DATA FOR EXAMPLES
    private static int idCounter = 1;

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote("Stay foolish to stay sane.", "Maxime Lagacé", idCounter++),
            new Quote("When nothing goes right, go left.", "Unknown", idCounter++),
            new Quote("Try Again. Fail again. Fail better.", "Samuel Beckett", idCounter++),
            new Quote("Good things happen to those who hustle.", "Anaïs Nin", idCounter++),
            new Quote("The fastest road to meaning and success: choose one thing and go all-in.", "Maxime Lagacé", idCounter++),

            new Quote("Never regret anything that made you smile.", "Mark Twain", idCounter++),
            new Quote("Simplicity is the ultimate sophistication.", "Leonardo da Vinci", idCounter++),
            new Quote("Problems are not stop signs, they are guidelines.", "Robert H. Schiuller", idCounter++),
            new Quote("I could agree with you but then we’d both be wrong.", "Harvey Specter", idCounter++),
            new Quote("May your choices reflect your hopes, not your fears.", "Nelson Mandela", idCounter++)
    ));

    //GET ALL QUOTES
    @GetMapping("/quotes")
    @ResponseStatus(value = HttpStatus.OK)

    public List<Quote> allQuotes() {
        return quoteList;
    }

    //GET QUOTE BY ID
    @GetMapping("/quotes/{id}")
    @ResponseStatus(value = HttpStatus.OK)

    public Quote getQuoteById(@PathVariable int id) {
        Quote foundQuote = null;

        for(Quote quote : quoteList) {
            if(quote.getId() == id) {
                foundQuote = quote;
                break;
            }
        }
        return foundQuote;
    }


}
