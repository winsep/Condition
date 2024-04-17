package Advance.dev;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Person[] persons = new Person[10];

        // Nhập thông tin cho mảng persons
        input(persons);

        // In ra thông tin của mảng persons
        print(persons);

        // Tìm giáo viên có lương cao nhất
        Teacher GVcoLuongCaoNhat = timGV(persons);
        System.out.println("Giáo viên có lương cao nhất:");
        System.out.println("Tên: " + GVcoLuongCaoNhat.name);
        System.out.println("Lương: " + GVcoLuongCaoNhat.heSoLuong());

        // Tìm sinh viên có điểm trung bình cao nhất
        Student SVcoDiemCaoNhat = timSVcoDiemCaoNhat(persons);
        System.out.println("Sinh viên có điểm trung bình cao nhất:");
        System.out.println("Tên: " + SVcoDiemCaoNhat.name);
        System.out.println("Điểm trung bình: " + SVcoDiemCaoNhat.diemTrungBinh());
    }

    public static void input(Person[] persons) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < persons.length; i++) {
            if (i < 4) {
                System.out.println("Nhập thông tin cho giáo viên thứ " + (i + 1) + ":");
                System.out.print("Tên: ");
                String name = scanner.nextLine();
                System.out.print("Tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Số điện thoại: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Mã giáo viên: ");
                String maGV = scanner.nextLine();
                System.out.print("Hệ số lương: ");
                double heSoLuong = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                persons[i] = new Teacher(name, age, phoneNumber, maGV, heSoLuong);
            } else {
                System.out.println("Nhập thông tin cho sinh viên thứ " + (i - 3) + ":");
                System.out.print("Tên: ");
                String name = scanner.nextLine();
                System.out.print("Tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Số điện thoại: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Điểm Toán: ");
                double diemToan = scanner.nextDouble();
                System.out.print("Điểm Lý: ");
                double diemLy = scanner.nextDouble();
                System.out.print("Điểm Hóa: ");
                double diemHoa = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Mã sinh viên: ");
                String MSV = scanner.nextLine();
                System.out.print("Lớp: ");
                String className = scanner.nextLine();

                persons[i] = new Student(name, age, phoneNumber, diemToan, diemLy, diemHoa, MSV, className);
            }
        }
        scanner.close();
    }

    public static void print(Person[] persons) {
        System.out.println("Danh sách các người:");
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Giáo viên: " + teacher.name);
                System.out.println("Lương: " + teacher.heSoLuong());
            } else if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Sinh viên: " + student.name);
                System.out.println("Điểm trung bình: " + student.diemTrungBinh());
            }
        }
    }

    public static Teacher timGV(Person[] persons) {
        Teacher GVcoLuongCaoNhat = null;
        double luongCaoNhat = 0;
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                double luong = teacher.heSoLuong();
                if (luong > luongCaoNhat) {
                    luongCaoNhat = luong;
                    GVcoLuongCaoNhat = teacher;
                }
            }
        }
        return GVcoLuongCaoNhat;
    }

    public static Student timSVcoDiemCaoNhat(Person[] persons) {
        Student SVcoDiemCaoNhat = null;
        double diemCaoNhat = 0;
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                double diemTrungBinh = student.diemTrungBinh();
                if (diemTrungBinh > diemCaoNhat) {
                    diemCaoNhat = diemTrungBinh;
                    SVcoDiemCaoNhat = student;
                }
            }
        }
        return timSVcoDiemCaoNhat(persons);
    }
}
