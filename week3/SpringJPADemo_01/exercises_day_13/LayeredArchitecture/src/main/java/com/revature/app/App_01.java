package com.revature.app;

import com.revature.beans.Employee;
import com.revature.controller.SaverController;
import com.revature.service.DBSaverService;
import com.revature.service.FileSaverService;
import com.revature.service.Saver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Caleb", "Sword", 99);
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        SaverController controller = ctxt.getBean(SaverController.class);
        controller.save(employee);
    }
}
