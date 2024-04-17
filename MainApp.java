package basic.dev;
import java.util.Scanner;

public class MainApp {
	public static void KiemTra(int n) {
		if(n >= 0) {
			System.out.println(n+ "Là Số Nguyên Dương");
		}else {
			System.out.println(n+ "Là Số Nguyên Âm");
		}
	}
	public static void ChiaHetCho3(int n) {
		for(int i = 1; i <= n; i++) {
			if(i%3 == 0) {
				System.out.println("Số chia hết cho 3:  "+i);
			}
		}
	}
	public static void ChiaHetCho5(int n) {
		for(int i = 1; i <= n; i++) {
			if(i%5 == 0) {
				System.out.println("Số Chia Hết cho 5: "+i);
			}
		}
	}
	public static void NgayThangNam(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập vào thăng: ");
		int thang = sc.nextInt();
		switch(thang) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng"+thang+"có 31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng"+thang+"có 30 ngày");
			break;
		case 2:
			System.out.print("Mời nhập năm: ");
			int nam = sc.nextInt();
			if((nam%4 == 0) && (nam%100 != 0) || (nam%400 == 0)) {
				System.out.println("Tháng"+thang+"Năm"+nam+"có 29 ngày");
			}else {
				System.out.println("Tháng"+thang+"Năm"+nam+"có 28 ngày");
			}
			break;
			default:
				System.out.println("Không Hợp Lệ");
				break;
		}
	}
	public static void Ptbac2(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập c: ");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("delta = "+delta);
		if(delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		}else if(delta == 0) {
			double x = -b / (2 * a);
			System.out.println("x= "+x);
		}else if(delta > 0) {
			double x1 = -b + Math.sqrt(delta) / (2 * a);
			double x2 = -b - Math.sqrt(delta) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm: ");
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
		}
	}
	public static void KiemTraCanhTamGiac(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = sc.nextInt();
		System.out.print("Nhập b: ");
		int b = sc.nextInt();
		System.out.print("Nhập c: ");
		int c = sc.nextInt();
		if(a + b > c && b + c > a && a + c > b) {
			System.out.println("Đúng Là Ba cạnh tam giác");
		}else {
			System.out.println("Không Phải Ba cạnh tam giác");
		}
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhập n: ");
    	int n = sc.nextInt();
    	KiemTra(n);
    	ChiaHetCho3(n);
    	ChiaHetCho5(n);
      Ptbac2(n);
      NgayThangNam(n);
      KiemTraCanhTamGiac(n);
    }
}
