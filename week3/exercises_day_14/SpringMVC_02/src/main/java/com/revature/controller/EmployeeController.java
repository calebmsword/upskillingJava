package com.revature.controller;

import com.revature.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping(value ="/empreg", method = RequestMethod.GET)
    public ModelAndView newEmployee() {
        ModelAndView modelAndView = new ModelAndView("EmployeeRegistration", "command", new Employee());
        return modelAndView;
    }

    @RequestMapping(value ="/empreg", method = RequestMethod.POST)
//    public ModelAndView showEmployee(@RequestParam("id") int id,
//                                     @RequestParam("name") String name,
//                                     @RequestParam("deptno") int deptno) {
        public ModelAndView showEmployee(@ModelAttribute("employee") Employee employee) {
        ModelAndView modelAndView = new ModelAndView("ShowEmp");

        /*
        // You would need to implement com.revature.service.EmployeeService
        EmployeeService employeeService = new EmployeeService();
        employeeService.save(employee);
        */

//        String employee = "id: "+id+", name: "+name+", deptno: "+deptno;
//        Employee employee = new Employee(id, name, deptno);
        modelAndView.addObject("emp", employee);
        return modelAndView;
    }
}
