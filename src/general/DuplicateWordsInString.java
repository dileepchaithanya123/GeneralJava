package general;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		int count;
		
		String str = "Big black bug bit a big black dog on his big black nose";
		
		str = str.toLowerCase();
		
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			count = 1;
			for(int j=i+1; j<words.length; j++)
			{
				count++;
				words[j]= "O";
			}
		}
		
	
	}
}
