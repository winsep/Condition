package Advance.dev;

public class Teacher extends Person{
	  private String maGV;
	    private double heSoLuong;

		public Teacher(String name, int age, String phoneNumber, String maGV, double heSoLuong) {
			super(name, age, phoneNumber);
			this.maGV = maGV;
			this.heSoLuong = heSoLuong;
		}

		public double heSoLuong() {
	        return 10000 * heSoLuong;
	    }
}
