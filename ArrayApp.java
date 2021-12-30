package Arrays;

public class ArrayApp {

	public static void main(String[] args) {
		int[] lotteryNumbers = new int[5];
		lotteryNumbers[0] = 12;
		lotteryNumbers[1] = 13;
		lotteryNumbers[2] = 14;
		lotteryNumbers[3] = 15;
		lotteryNumbers[4] = 16;
		
		for(int lotteryNumber : lotteryNumbers) {
			System.out.println(lotteryNumber);
		}
		
		int[][]weeklyLotteryNumber = {
				{1, 2, 3, 4, 5},
				{1, 2, 3, 4, 6},
				{1, 2, 3, 4, 7},
				{1, 2, 3, 4, 8, 9}
		};
		
		for(int i = 0; i<weeklyLotteryNumber.length; i++) {
			for(int j = 0; j<weeklyLotteryNumber[i].length; j++) {
				System.out.print(weeklyLotteryNumber[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
