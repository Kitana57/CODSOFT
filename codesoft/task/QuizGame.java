package com.codesoft.task;

import java.io.ObjectInputStream.GetField;
import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
	 private static boolean answered = false;
    public static void main(String[] args) {
        getQuestion();
    }

    private static void getQuestion() {
        Scanner sc = new Scanner(System.in);
        List<String> questionStrings = new ArrayList<>();
        List<List<String>> optionStrings = new ArrayList<>();
        List<String> correctOption = new ArrayList<>();

        System.out.println("Enter the number of questions:");
        int noOfQuestion = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < noOfQuestion; i++) {
            System.out.println("Enter question " + (i + 1) + ":");
            String input = sc.nextLine();
            questionStrings.add(input);

            List<String> options = new ArrayList<>();
            System.out.println("Enter the options for question " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Option " + (j + 1) + ":");
                String inputOption = sc.nextLine();
                options.add(inputOption);
            }
            optionStrings.add(options);
        }

        System.out.println("Enter the correct options:");
        for (int i = 0; i < noOfQuestion; i++) {
            System.out.println("Correct option for question " + (i + 1) + ":");
            String inputCorrect = sc.nextLine();
            correctOption.add(inputCorrect);
        }

        runQuestion(questionStrings, optionStrings, correctOption);
        sc.close();
    }

    private static void runQuestion(List<String> questionStrings, List<List<String>> optionStrings, List<String> correctOption) {
        Scanner scanner = new Scanner(System.in);
        int n = questionStrings.size();
        int score = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Question " + (i + 1) + ": " + questionStrings.get(i));
            List<String> options = optionStrings.get(i);
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }
            answered = false;
            Thread timerThread = new Thread(() -> {
                try {
                    Thread.sleep(10000); // 10 seconds for each question
                    if (!answered) {
                        System.out.println("Time's up!");
                        // Proceed to the next question
                        answered = true; // Mark as answered to prevent further input
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            timerThread.start();
            System.out.println("Your answer:");
            // Get user input
            String getAnswer = scanner.nextLine();
            answered = true; // Mark as answered
            timerThread.interrupt(); 
            
           

            if (correctOption.get(i).equalsIgnoreCase(getAnswer)) {
                score++;
                System.out.println("CORRECT!");
            } else {
                System.out.println("INCORRECT! The correct answer is: " + correctOption.get(i));
            }
        }

        System.out.println("Scores: " + score+" out of "+n);
        scanner.close();
    }
}
