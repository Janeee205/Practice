package demension;

public class main {

	public static void main(String[] args) {

		// 1���� 56���� ������
		int[][] arr = new int[8][7];

		for (int i = 0; i < 8; i++) { // ��
			for (int j = 0; j < 7; j++) { // ��
				System.out.print((arr[i][j] = (i * 7) + (j + 1)) + " ");

			}
			System.out.println();

		}

	}

}
