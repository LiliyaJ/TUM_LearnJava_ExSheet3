
public class Stringulina {

	public static int substringPos(String haystack, String needle) {
		int i;
		boolean ret = false;
		for (i = 0; i < haystack.length(); i++) {
			ret = true;
			for (int j = 0; j < needle.length(); j++)
				if (i + j < haystack.length())
					if (haystack.charAt(i + j) != needle.charAt(j))
						ret = false;
			if (ret)
				break;
		}
		if (ret)
			return i;
		else
			return -1;
	}

	public static int countSubstring(String haystack, String needle) {
		int count = 0;
		boolean ret = false;
		for (int i = 0; i < haystack.length(); i++) {
			ret = true;
			for (int j = 0; j < needle.length(); j++)
				if (i + j < haystack.length())
					if (haystack.charAt(i + j) != needle.charAt(j))
						ret = false;
			if (ret)
				count++;
		}
		return count;
	}

	public static boolean correctlyBracketed(String str) {
		return false;
	}

	public static boolean matches(String str, String pattern) {
		return true;

	}
}
