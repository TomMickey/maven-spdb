package com.spdb.controller;

import com.spdb.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        Employee employee = new Employee();
        employee.setId("123");
        employee.setEmail("18620243154@163.com");
        employee.setGender(0);
        employee.setLastName("Jack");
        employee.setBirth("2022-08-12 12:12");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        model.addAttribute("msg" , "Hello Thymeleaf");
        model.addAttribute("emps" , employeeList);
        return "hello";
    }
}
