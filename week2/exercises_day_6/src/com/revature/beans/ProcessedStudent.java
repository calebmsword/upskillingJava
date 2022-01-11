package com.revature.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessedStudent {
    int id;
    String name;
    int sub1;
    int sub2;
    int sub3;
    int total;
    double average;

    public String toCSV(){
        return id+", "+name+", "+sub1+", "+sub2+", "+sub3+", "+total+", "+average;
    }

    public static ProcessedStudent parseProcessedStudent(String csv){
        String[] values = csv.split(",");
        int id = Integer.parseInt(values[0].trim());
        String name = values[1].trim();
        int sub1 = Integer.parseInt(values[2].trim());
        int sub2 = Integer.parseInt(values[3].trim());
        int sub3 = Integer.parseInt(values[4].trim());
        int total = Integer.parseInt(values[5].trim());
        double average = Double.parseDouble(values[6].trim());
        ProcessedStudent student = new ProcessedStudent(id, name, sub1, sub2, sub3, total, average);
        return student;
    }
}
ProcessStudent
        package com.revature.jan11.service;

        import com.revature.jan11.studentprocessing.Student;
        import com.revature.jan11.studentprocessing.ProcessedStudent;

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
