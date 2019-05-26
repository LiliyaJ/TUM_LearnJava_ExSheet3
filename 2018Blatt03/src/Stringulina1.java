
public class Stringulina1 {
	
	public static void main(String[] args) {
		
		System.out.println(substringPos("dfrgabcabcierqoewip", "abc"));
	}
	
	public static int substringPos (String haystack, String needle){
		int i;
		for (i = 0; i < haystack.length(); i++){
			boolean ret;
			for (int j = 0; j < needle.length(); j++){
				ret = true;
				if (i + j < haystack.length()){
				System.out.print("i+j: ");
				System.out.print(i + j);
				System.out.print(" ");
				}
			}
		}
		return 0;
	}

}
