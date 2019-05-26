
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
    int bracketCount = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(')
        bracketCount++;
      else if (str.charAt(i) == ')') {
        bracketCount--;
        // Haben wir irgendwann mehr öffnende als schließende
        // Klammern gesehen, ist der String nicht korrekt
        // geklammert.
        if (bracketCount < 0)
          return false;
      }
    }

    return bracketCount == 0;
  }

	 public static boolean matches(String str, String pattern) {
    int posStr = 0;
    int posPat = 0;
    while (posPat < pattern.length()) {
      char nextPat = pattern.charAt(posPat++);
      int multiplicity = 1;
      // Bei öffnender Klammer...
      if (posPat < pattern.length() && pattern.charAt(posPat) == '{') {
        // ... extrahieren wir die Vielfachheit
        String multi_str = "";
        for (int i = posPat + 1; pattern.charAt(i) != '}'; i++)
          multi_str += pattern.charAt(i);
        multiplicity = Integer.parseInt(multi_str);
        // Wir überspringen die Vielfachheits-Angabe im Pattern
        posPat += 2 + multi_str.length();
      }
      // Wir prüfen den Buchstaben aus dem Pattern und seine Vielfachheit auf
      // Vorhandenheit im String
      for (int i = 0; i < multiplicity; i++)
        if (posStr >= str.length() || (str.charAt(posStr++) != nextPat && nextPat != '.'))
          return false;
    }

    return posStr == str.length();
  }
}
}
