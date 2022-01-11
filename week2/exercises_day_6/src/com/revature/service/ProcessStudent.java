package com.revature.service;

import com.revature.beans.Student;
import com.revature.beans.ProcessedStudent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProcessStudent {
    public void process(){
        try{
            FileInputStream fileInputStream = new FileInputStream("input.dat");
            FileOutputStream fileOutputStream = new FileOutputStream("output.dat");
            int nobytes = fileInputStream.available();
            byte[] data = new byte[nobytes];
            fileInputStream.read(data);
            String csv = new String(data);
            String[] studentCSV = csv.split("\n");
            for (int i = 0; i < studentCSV.length; i++){
                Student student = Student.parseStudent(studentCSV[i]);
                int total = student.getSub1() + student.getSub2() + student.getSub3();
                double average = (double) total / 3;
                ProcessedStudent processedStudent = new ProcessedStudent();
                processedStudent.setId(student.getId());
                processedStudent.setName(student.getName());
                processedStudent.setSub1(student.getSub1());
                processedStudent.setSub2(student.getSub2());
                processedStudent.setSub3(student.getSub3());
                processedStudent.setTotal(total);
                processedStudent.setAverage(average);
                String proStudent = processedStudent.toCSV()+"\n";
                fileOutputStream.write(proStudent.getBytes());
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}