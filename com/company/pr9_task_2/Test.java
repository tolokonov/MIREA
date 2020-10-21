package com.company.pr9_task_2;

public class Test {
    public static void main(String[] args) {
        UserInterface []students = new Student[4];
        students[0] = new Student("Петров Петр Петрович", 4);
        students[1] = new Student("Сапожников Александр Александрович", 2);
        students[2] = new Student("Волков Андрей Андреевич", 5);
        students[3] = new Student("Журавлева Анна Анатольевна", 1);

        Sort.quickSort((Student[]) students, 0, students.length - 1);

        Find.findName((Student[])students, "Журавлева Анна Анатольевна");
        Find.findName((Student[])students, "Петров Петр Петрович");
        Find.findName((Student[])students, "Осипов Кирилл Кириллович");
    }
}
