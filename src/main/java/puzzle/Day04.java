package puzzle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shared.FileUtil;

public class Day04 {

	public static boolean isPassphraseValid(String passphrase, boolean preventAnagrams) {
	
		String[] words = passphrase.split(" ");

		if(preventAnagrams) {
			// sort the letters in each words, so that when we add them to a set, anagrams will cause duplicate words.
			for(int i = 0; i< words.length; i++) {
				char[] letters = words[i].toCharArray();
				Arrays.sort(letters);
				words[i] = new String(letters);
			}
		}
		
		Set<String> wordsSet = new HashSet<String>(Arrays.asList(words));
		
		return words.length == wordsSet.size();
	}
	
	public static int validPassphrases(String fileName, boolean preventAnagrams) {
		int result = 0;
		List<String> lines = FileUtil.loadFileinStrings(fileName);
		
		for(String passphrase: lines) {
			result += isPassphraseValid(passphrase, preventAnagrams) ? 1 : 0;
		}
		return result;
	}

}
