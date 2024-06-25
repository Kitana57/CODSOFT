package com.codesoft.task;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter number of subjects");
		n=scanner.nextInt();
		int marks[]=new int[n];
		int sumOfMarks=0;
		double average;
		String subjectName[]=new String[n];
		System.out.println("enter name of subjects and their marks.");
		for (int i = 0; i < marks.length; i++) {
			
			subjectName[i]=scanner.next();
			marks[i]=scanner.nextInt();
			sumOfMarks+=marks[i];
		}
		average=((double)sumOfMarks/n);
		
		if(average>=90) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: O");
		}
		else if (average>=80 && average<90) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: E");
		}
		else if (average>=70 && average<80) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: A");
		}
		else if(average>=60 && average<70) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: B");
		}
		else if(average>=50 && average<60) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: C");
		}
		else if(average>=40 && average<50) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: D");
		} 
		else if(average>=30 && average<40) {
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Subject: "+subjectName[i]);
				System.out.println(" Marks: "+marks[i]);
			}
			System.out.println(" Total marks obtained: "+sumOfMarks+"\n Average percentage: "+average+"\n and Grade is: F");
		}
		
	}

}
