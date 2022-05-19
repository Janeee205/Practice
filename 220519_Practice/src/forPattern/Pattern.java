package forPattern;

public class Pattern {
// for문 패턴찍기 연습
	public static void main(String[] args) {

//이렇게 찍어보기

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

		for (int i = 1; i < 6; i++) { // 총 5줄
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

}
