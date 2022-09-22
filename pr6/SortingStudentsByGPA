package pr6;

import java.util.Comparator;

class StudentComparator extends SortingStudentsByGPA{

    public static void quickSort(Student[] arr, int begin, int end) {
        if (begin < end) {
            int pivot = new StudentComparator().separate(arr, begin, end);
            quickSort(arr, begin, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private int separate(Student[] arr, int begin, int end) {
        Student pivot = arr[end];
        Student temp;
        int i = begin - 1;

        for (int j = begin; j < end; ++j) {
            if (compare(arr[j], pivot) >= 0) {
                ++i;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[end] = arr[i+1];
        arr[i+1] = pivot;

        return i+1;
    }


}

class Student {
    int mark;

    public Student (int grade) {this.mark = grade;}

    @Override
    public String toString() {
        return "Student with grade " + this.mark;
    }
}

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student i1, Student i2) {
        return i1.mark - i2.mark;
    }

    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(2);
        students[1] = new Student(4);
        students[2] = new Student(3);
        students[3] = new Student(1);
        students[4] = new Student(6);
        students[5] = new Student(4);
        StudentComparator.quickSort(students, 0, 5);
        for (Student s : students)
            System.out.println(s);
    }
}
