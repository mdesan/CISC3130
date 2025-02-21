package Homework.Hw2;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentSorter {

    List<Student> list = new ArrayList<>();
    File file = new File("/home/mike/Desktop/students.txt");
    Scanner sc = new Scanner(file);

    public StudentSorter() throws FileNotFoundException {
        sorter();
    }


    private void read(Scanner sc){
        while(sc.hasNext()){
            list.add(new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble()));
        }
        sc.close();
    }

    public void menu(){
        System.out.println("Choices:");
        System.out.println("F - sort by first name");
        System.out.println("L - sort by last name");
        System.out.println("I - sort by id");
        System.out.println("G - sort by grade");
        System.out.println("Q - quit");
        System.out.println();
    }

    public void sorter(){
        read(sc);
        Scanner in = new Scanner(System.in);

        menu();

        String c = in.next();

        while(true){
            switch (c){
                case "F":
                    this.list.sort(new StudentFirstNameComparator());
                    System.out.println("students sorted by first name");
                    for(Student s : list){
                        System.out.println(s);
                    }
                    System.out.println();
                    menu();
                    c = in.next();
                    break;
                case "L":
                    this.list.sort(new StudentLastNameComparator());
                    System.out.println("students sorted by last name");
                    for(Student s : list){
                        System.out.println(s);
                    }
                    System.out.println();
                    menu();
                    c = in.next();
                    break;
                case "I":
                    this.list.sort(new StudentIdComparator());
                    System.out.println("students sorted by ID");
                    for(Student s : list){
                        System.out.println(s);
                    }
                    System.out.println();
                    menu();
                    c = in.next();
                    break;
                case "G":
                    this.list.sort(new StudentGradeComparator());
                    System.out.println("students sorted by grade");
                    for(Student s : list){
                        System.out.println(s);
                    }
                    System.out.println();
                    menu();
                    c = in.next();
                    break;
                case "Q":
                    System.exit(0);
            }
        }

    }

    private static class StudentFirstNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getFirst().compareTo(s2.getFirst());
        }
    }
    private static class StudentLastNameComparator implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getLast().compareTo(s2.getLast());
        }
    }
    private static class StudentIdComparator implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
    private static class StudentGradeComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.getGrade(),s2.getGrade());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
      StudentSorter s = new StudentSorter();

    }

    private static class Student{
        private final String first;
        private final String last;
        private final int id;
        private final double grade;

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

    }




}

