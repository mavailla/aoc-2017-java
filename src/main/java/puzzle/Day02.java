package puzzle;

//https://adventofcode.com/2017/day/2
public class Day02 {

	private static int[] toIntArray(String[] arr){
		int[] ints = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        ints[i] = Integer.parseInt(arr[i]);
	    }
	    return ints;
	}
	
	public static int calcChecksum(String[] rows) {
		int checksum = 0;
		for(String row: rows) {
			int[] values = toIntArray(row.split(","));
			
			int highest=values[0];
			int lowest=values[0];
			for(int value: values){
				highest = (value > highest) ? value : highest;
				lowest = (value < lowest) ? value : lowest;
			}
			System.out.println("highest: " + highest + ", lowest: " + lowest);
			checksum += highest - lowest;
		}
		
		return checksum;
	}

	private static int resultOfEvenlyDivision(int[] values){
		for(int i = 0; i < values.length; i++){
			for(int j = i + 1; j < values.length; j++) {
				if(values[i] % values[j] == 0 ) return values[i] / values[j];
				if(values[j] % values[i] == 0 ) return values[j] / values[i];
			}
		}
		return 0;
	}
	
	public static int evenlyDiv(String[] rows) {
		int checksum = 0;
		for(String row: rows) {
			int[] values = toIntArray(row.split(","));
			
			checksum += resultOfEvenlyDivision(values);
		}
		return checksum;
	}
	
}
