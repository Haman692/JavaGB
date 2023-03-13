package org.example.cw3;

import org.example.cw3.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова",1, 1000.0, List.of(2,2,2));
        Student student2 = new Student("Петров",1, 1001.0, List.of(1,2,2));
        Student student3 = new Student("Сергеевна",1, 1010.0, List.of(2,1,2));
        Student student4 = new Student("Максимовна",2, 1111.0, List.of(3,2,1));
        Student student5 = new Student("Лебедь",2, 2000.0, List.of(5,2,2));
        Student student6 = new Student("Певтров",2, 2001.0, List.of(4,2,4));

        List<Student> sutdentList = new ArrayList<>();
        sutdentList.add(student1);
        sutdentList.add(student2);
        sutdentList.add(student3);
        sutdentList.add(student4);
        sutdentList.add(student5);
        sutdentList.add(student6);

        Scanner scanner = new Scanner(System.in);
        for(Student el : sutdentList){
            double sum = 0;
            for (double es : el.getEvaluation()){
                sum += es;
                if(el.getSurname().endsWith("ова") && sum % 2 == 0){
                    System.out.println(el.getScholarship());
                }
            }
        }
    }
}
