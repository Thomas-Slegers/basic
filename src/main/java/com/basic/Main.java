package com.basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sentence sentence = new Sentence();
        sentence.whatIsMyName();
    }
    public String sayMyName(){
        Sentence sentence = new Sentence();
        return sentence.whatIsMyName();
    }
}