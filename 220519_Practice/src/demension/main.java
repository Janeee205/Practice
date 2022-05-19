package demension;

public class main {

	public static void main(String[] args) {

		// 1부터 56까지 만들어내기
		int[][] arr = new int[8][7];

		for (int i = 0; i < 8; i++) { // 행
			for (int j = 0; j < 7; j++) { // 열
				System.out.print((arr[i][j] = (i * 7) + (j + 1)) + " ");

			}
			System.out.println();

		}

	}

}
