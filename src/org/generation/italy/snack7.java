package org.generation.italy;

public class snack7 {

	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		String Sentence = "";
		String maxSentence = "";
		for(int i =0;i<words.length;i++) {
			Sentence += words[i];
			if(words[i].length()>maxSentence.length()) {
				maxSentence = words[i];
			}
			
		}
		System.out.println(Sentence);
		StringBuilder strb = new StringBuilder(Sentence);
		Sentence = strb.reverse().toString();
		System.out.println(Sentence);
		System.out.println("la parola piu lunga è " + maxSentence);
		
	}

}
