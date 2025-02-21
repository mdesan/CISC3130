package Homework.Hw2;

import java.io.FileNotFoundException;

public class Student {

    private String first;
    private String last;
    private int id;
    private double grade;

    public Student(String first, String last, int id, double grade){
        this.first=first;
        this.last=last;
        this.id=id;
        this.grade=grade;
    }


    //getters
    public String getFirst(){
        return this.first;
    }
    public String getLast(){
        return this.last;
    }
    public int getId(){
        return this.id;
    }
    public double getGrade(){
        return this.grade;
    }


    @Override
    public String toString(){
        return this.first + " " + this.last + " " + this.id + " " + this.grade;
    }

    public static void main(String[] args) throws FileNotFoundException {
        StudentSorter s = new StudentSorter();
    }

}
