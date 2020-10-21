package com.company.pr9_task_2;

class Find {
    public static void findName(Student[] array, String name) {
        Boolean flag = false;
        for (Student student : array) {
            if (student.getFIO().equals(name)) {
                System.out.println("найдено имя: " + name);
                flag = true;
            }
        }
        try {
            if (!flag) {
                throw new StudentNotFoundException(name + " - такого имени нет");
            }
        } catch(StudentNotFoundException e){
            throw new StudentNotFoundException(name + " - такого имени нет");
        }
    }
}

class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String errorMessage){
        super(errorMessage);
    }
}