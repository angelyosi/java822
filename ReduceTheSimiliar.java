package letters;

public class ReduceTheSimiliar {

	public static void main(String[] args) {
		
		 String str1="the quick brown fox";
		 String str2="queen";
		 
		 
		char[] chars = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars2.length; j++) {
				if (chars[i]==(chars2[j])) {chars[i]=0;}}}
		
			
			char[] toString= chars;
		System.out.println(toString);
				
		
			
		

	}

}
