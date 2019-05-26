
public class StringulinaTest {
	
	public static void main(String[] args) {
	
		System.out.println(substringPos("dfrgabcabcierqoewip", "abc"));
//		System.out.println(Stringulina.countSubstring("aaaacdfrgavcierqoewip", "aa"));
	
	}
	public static int substringPos(String haystack, String needle) {
		int i;
		boolean ret = false;
		for (i = 0; i < haystack.length(); i++) {
			ret = true;
			for (int j = 0; j < needle.length(); j++)
				if (i + j < haystack.length())
					if (haystack.charAt(i + j) != needle.charAt(j))
						System.out.print(haystack.charAt(i + j));
						ret = false;
			if (ret)
				break;
		}
		if (ret)
			return i;
		else
			return -1;
	}

}
