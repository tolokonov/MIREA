package com.company.pr9_task_2;

class Student implements Comparable <Student>, UserInterface{

    private String FIO;
    private Integer GPA;

    public Student(String FIO, int GPA){
        this.FIO = FIO;
        this.GPA = GPA;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Integer getGPA() {
        return GPA;
    }

    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "FIO = " + FIO +
                ", GPA = " + GPA +
                " }";
    }

    @Override
    public int compareTo(Student o) {
        return o.GPA - this.GPA;
    }
}
