package extendEx3;

public class People {

	String name;
	int birthday;
	String address;
	String phoneNumber;

	public People(String name, int birthday, String address, String phoneNumber) {
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	public void showInfo() {
		System.out.println(name + "  "+ birthday + "  "+ address + "  "+ phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	

}
