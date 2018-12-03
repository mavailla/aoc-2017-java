package puzzle;

//https://adventofcode.com/2017/day/3
public class Day03 {

	public static int manhattanDistance(int location) {
		int x = 0;
		int y = 0;
		int direction = 0;  // east
		
		int counter = 1;
		int step = 1;
		while (counter < location) {
			int remain = location - counter;
			
			int move = Math.min(step, remain);
			
			switch(direction % 4) {
				case 0: { x += move; break; } // east
				case 1: { y += move; break; } // north
				case 2: { x -= move; break; } // west
				case 3: { y -= move; }        // south
			}
			
			counter += move;
			direction++;
			step += (direction % 4 == 0 || direction % 4 == 2) ? 1 : 0; // increment step size by one when changing direction to east or west
		}
		
		return Math.abs(x) + Math.abs(y);  // calculate manhattan distance from origin
	}
	
	public static int firstValueWrittenLargerThanInput(int input) {
		int[][] spiral = new int[20][20];  // todo: size dynamically based on provided input
		int x = 10; // set spiral origin to center of 20x20 matrix 
		int y = 10;
		spiral[x][y] = 1;
		int direction = 0;  // east
		int steps = 1;
		int adjacentSum = 0;
		int movesToGo = steps;
		do {
			switch(direction % 4) {
				case 0: {x++; break; } // east
				case 1: {y++; break; } // north
				case 2: {x--; break; } // west
				case 3: {y--; }        // south
			}

			adjacentSum = spiral[x+1][y] + spiral[x+1][y+1] + spiral[x][y+1] + spiral[x-1][y+1] + spiral[x-1][y] + spiral[x-1][y-1] + spiral[x][y-1] + spiral[x+1][y-1];
			spiral[x][y] = adjacentSum;
				
			movesToGo--;
			if(movesToGo == 0) {
				direction++;
				steps += (direction % 4 == 0 || direction % 4 == 2) ? 1 : 0;  // increment step size by one when changing direction to east or west
				movesToGo = steps;
			}
			
		} while(adjacentSum < input);
		
		return adjacentSum;
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(manhattanDistance(81));
		System.out.println(firstValueWrittenLargerThanInput(361527));
	}

}
