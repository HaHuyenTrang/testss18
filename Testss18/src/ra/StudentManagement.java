package ra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Map<String, Student> student = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("==============MENU==============");
            System.out.println("1. Danh sách sinh viên  ");
            System.out.println("2. Thêm mới các sinh viên  ");
            System.out.println("3. Xóa sinh viên theo mã sinh viên ");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn nhất ");
            System.out.println("6. In thông tin sinh viên có tuổi nhỏ nhất   ");
            System.out.println("7. thoát");
            System.out.println("lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("danh sách sinh viên!"+student);
//                    student.toString();
                    break;
                case 2:
                    System.out.println("số sv cần thêm: ");
                    int numStudent = sc.nextInt();
                    for (int i = 0; i < numStudent; i++) {
                        Student s = new Student();
                        s.inputData(sc);
                        student.put(s.getIdStudent(), s);
                    }
                    System.out.println("Thêm sviên thành công!"+student);
                    break;
                case 3:
                    System.out.print("Nhập ID sv cần xóa: ");
                    int removeId = sc.nextInt();
                    if (student.remove(removeId) == null) {
                        System.out.println("sv không tồn tại!");
                    } else {
                        System.out.println("sv đã bị xóa!"+student);
                    }
                case 4:
                    System.out.println("Điểm trung bình sv: "+student.get(student.keySet().toArray()[0]).getAverage());

                    break;
                case 5:
                    break;
                case 6:
                    Student maxage = null;
                    double max = 0;
                    for (Student s: student.values()) {
                        if (s.getAge() > max) {
                            max = s.getAge();
                            maxage = s;
                        }
                    }
                    System.out.println(" sviên có tuổi cao nhất: " + maxage);
                    break;
                case 7:
                    break;
                    default:
                        System.out.println("chọn lại");
            }

        }while(true);
    }
}
