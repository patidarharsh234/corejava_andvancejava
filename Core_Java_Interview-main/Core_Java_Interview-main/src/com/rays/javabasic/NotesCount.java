package com.rays.javabasic;

public class NotesCount {

	public static void main(String[] args) {
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10 };

		int countNote = 0;
		int rupe = 4500;

		for (int i = 0; i < notes.length; i++) {
			
			countNote = rupe / notes[i];

			if (countNote > 0) {
				System.out.println(notes[i] + "=" + countNote);
			}

			rupe %=notes[i];
			
			
		}

	}

}
