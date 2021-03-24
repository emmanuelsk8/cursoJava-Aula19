package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramExFix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			cursoA.add(number);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			cursoB.add(number);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			cursoC.add(number);
		}

		Set<Integer> total = new HashSet<Integer>(cursoA);
		total.addAll(cursoB);
		total.addAll(cursoC);
		
		System.out.println("Total students: " + total.size());

		sc.close();
	}

}
