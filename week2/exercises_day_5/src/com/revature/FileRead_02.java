package com.revature;

import com.revature.beans.Employee;

import java.io.*;

public class FileRead_02 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee)objectInputStream.readObject();
            System.out.println("Content from the file");
            System.out.println(employee);
            objectInputStream.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
