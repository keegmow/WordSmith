public class WordSmith {

	public static String getWordSmith(int i) {
		
		String result = String.valueOf(i);
		
		if (i % 3 == 0 && i % 5 == 0) {
			result = "wordsmith";
		} else if (i % 3 == 0) {
			result = "word";
		} else if (i % 5 == 0) {
			result = "smith";
		}
		
		return result;
	}

}
