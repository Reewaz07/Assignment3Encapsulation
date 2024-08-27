package hmrk;

public class WordsCount {
	public int wordCount(String word) {
		
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
				
	}
	
	public static void main(String[] args) {
		
		WordsCount obj=new WordsCount();
		int abc=obj.wordCount("I want to be a software engineer");
		System.out.println("total words="+abc);		
	}

}
