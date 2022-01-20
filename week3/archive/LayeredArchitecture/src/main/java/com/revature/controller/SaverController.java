package com.revature.controller;

import com.revature.beans.Employee;
import com.revature.service.Saver;

public class SaverController {
    Saver saver;

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }

    public SaverController(Saver saver) {
        this.saver = saver;
    }

    public SaverController() {
    }

    @Override
    public String toString() {
        return "SaverController{" +
                "saver=" + saver +
                '}';
    }

    public void save(Employee employee) {
        saver.save(employee);
    }
}
