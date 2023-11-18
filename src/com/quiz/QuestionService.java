package com.quiz;

import java.util.Scanner;

public class QuestionService {
	
	Question[] question = new Question[5];
	String[] useranswer = new String[5];
	Scanner sc = new Scanner(System.in);
	
	
	public QuestionService() {
		question[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
		question[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
		question[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
		question[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
		question[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
	}
	
	int i=0;
	
	public void playQuiz() {
		int score = 0;
		for(Question q : question) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println("Option 1: "+q.getOpt1());
			System.out.println("Option 2: "+q.getOpt2());
			System.out.println("Option 3: "+q.getOpt3());
			System.out.println("Option 4: "+q.getOpt4());
			System.out.print("Enter your answer: ");
			useranswer[i] = sc.nextLine();
			if(useranswer[i].equals(q.getAnswer()))
				score++;
			i++;					
		}
		
		System.out.println("Your score is: "+score);
		
		System.out.print("Your Answers: ");
		
		for(String s : useranswer)
			System.out.print(s+" ");
		System.out.println();
	}
	

}