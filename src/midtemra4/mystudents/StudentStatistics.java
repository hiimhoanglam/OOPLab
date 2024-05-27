package mystudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentStatistics {
    private MyList students;

    /**
     * Khởi tạo dữ liệu cho StudentManager.
     */
    public StudentStatistics(MyList data) {
        /* TODO */
        this.students = data;
    }

    /**
     * Lấy ra danh sách các sinh viên được sắp xếp theo thứ tự phụ thuộc vào tên và họ.
     * Chú ý, không thay đổi thứ tự sinh viên trong danh sách gốc.
     *
     * @param order
     * @return danh sách các sinh viên đã được sắp xếp
     */
    public MyList sortByFullname(boolean order) {
        /*
         TODO

         - Sửa lại lớp Student để sử dụng MyComparable để thực hiện việc so sánh các Student theo tên và họ.
           Thứ tự đầu tiên phụ thuộc vào tên, nếu tên bằng nhau thì thứ tự phụ thuộc vào họ.

         - Sử dụng tiêu chí so sánh trong MyComparable, viết code để sắp xếp danh sách các sinh viên theo thứ tự
           phụ thuộc tham số order. Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì
           sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách sinh viên mới đã được sắp thứ tự.
         */
        MyList studentsList = new MyArrayList();
        for (int i = 0; i < students.size(); i++) {
            studentsList.append(students.get(i));
        }
        for (int i = 0; i < studentsList.size() - 1; i++) {
            for (int j = i + 1; j < studentsList.size(); j++) {
                Student firstStudent = (Student) studentsList.get(i);
                Student secondStudent = (Student) studentsList.get(j);
                if (firstStudent.compareTo(secondStudent) > 0 && order ||
                firstStudent.compareTo(secondStudent) < 0 && !order) {
                    studentsList.set(secondStudent, i);
                    studentsList.set(firstStudent, j);
                }
            }
        }
        return studentsList;
    }

    /**
     * Lấy ra danh sách các sinh viên được sắp xếp theo average.
     * Chú ý, không thay đổi thứ tự sinh viên trong danh sách gốc.
     *
     * @param order
     * @return
     */
    public MyList sortByAverage(boolean order) {
        /*
         TODO

         - Thêm lớp AverageComparison sử dụng StudentComparator để có thể so sánh các sinh viên theo average.

         - Viết code sử dụng AverageComparison để sắp xếp sinh viên theo thứ tự phụ thuộc tham số order.
           Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách các sinh viên mới đã được sắp xếp.
         */
        AverageComparison averageComparison = new AverageComparison();
        MyList studentsList = new MyArrayList();
        for (int i = 0; i < students.size(); i++) {
            studentsList.append(students.get(i));
        }
        for (int i = 0; i < studentsList.size() - 1; i++) {
            for (int j = i + 1; j < studentsList.size(); j++) {
                Student firstStudent = (Student) studentsList.get(i);
                Student secondStudent = (Student) studentsList.get(j);
                if ((averageComparison.compare(firstStudent, secondStudent) > 0 && order) ||
                        (averageComparison.compare(firstStudent, secondStudent) < 0 && !order)) {
                    studentsList.set(secondStudent, i);
                    studentsList.set(firstStudent, j);
                }
            }
        }
        return studentsList;
    }

}
