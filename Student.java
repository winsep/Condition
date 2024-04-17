package Advance.dev;

public class Student extends Person{
	 private double diemToan;
	    private double diemLy;
	    private double diemHoa;
	    private String MSV;
	    private String className;

		public Student(String name, int age, String phoneNumber, double diemToan, double diemLy, double diemHoa,
				String mSV, String className) {
			super(name, age, phoneNumber);
			this.diemToan = diemToan;
			this.diemLy = diemLy;
			this.diemHoa = diemHoa;
			MSV = mSV;
			this.className = className;
		}



		public double diemTrungBinh() {
	        return (diemToan + diemLy + diemHoa) / 3.0;
	    }
	}
