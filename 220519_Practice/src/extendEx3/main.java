package extendEx3;

public class main {

	public static void main(String[] args) {
		People Jueun = new People("김주은", 19950205, "대전 대덕구", "01071405493");
		Jueun.showInfo();
		
		Library Jueun1 = new Library("김주은", 19950205, "대전 대덕구", "01071405493");
		Jueun1.setBookName("쇼코의 미소");
		
		Jueun1.bookRental();
		
		
		
		
		
	}

}
