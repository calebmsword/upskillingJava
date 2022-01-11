package com.revature.fileIO.beans;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Student {
    int id;
    String name;
    int sub1;
    int sub2;
    int sub3;

    public String toCSV(){
        return id+", "+name+", "+sub1+", "+sub2+", "+ sub3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public Student(int id, String name, int sub1, int sub2, int sub3) {
        this.id = id;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public Student() {
    }

    public static Student parseStudent(String csv){
        String[] values = csv.split(",");
        int id = Integer.parseInt(values[0].trim());
        String name = values[1].trim();
        int sub1 = Integer.parseInt(values[2].trim());
        int sub2 = Integer.parseInt(values[3].trim());
        int sub3 = Integer.parseInt(values[4].trim());
        Student student = new Student(id, name, sub1, sub2, sub3);
        return student;

    }
}