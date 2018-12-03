package puzzle;

// https://adventofcode.com/2017/day/1
public class Day01 {
	
	public static int sumWhenSameDigitAhead(String input, int delta) {
		int result = 0;
		char[] charArray = input.toCharArray();
		int length = charArray.length;
		
		for (int i = 0; i < length; i++) {
			int posAhead = (i + delta) >= length ? i - length + delta : i + delta ;
			result += (charArray[i] == charArray[posAhead] ? charArray[i]-48 : 0);
		}
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println("part1: " + sumWhenSameDigitAhead(args[0], 1));  		//solution was 1141
		
		System.out.println("part2: " + sumWhenSameDigitAhead(args[0], args[0].length() / 2));  		//solution was 950 

	}

}
