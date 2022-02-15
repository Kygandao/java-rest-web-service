package com.company.javarestwebservice.controllers;

import com.company.javarestwebservice.models.Answer;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AnswerController {

    private static int idCouter = 1;

    private static List<Answer> magicAnswerList = new ArrayList<>(Arrays.asList(
            new Answer("Anything", "It Is Certain", idCouter++),
            new Answer("Anything", "Ask Again Later", idCouter++),
            new Answer("Anything", "My Sources Say No", idCouter++),
            new Answer("Anything", "Without A Doubt", idCouter++),
            new Answer("Anything", "Cannot Predict Now", idCouter++),
            new Answer("Anything", "Don't Count On It", idCouter++)
    ));

    //POST METHOD (ASK 8-BALL A QUESTION)


}
