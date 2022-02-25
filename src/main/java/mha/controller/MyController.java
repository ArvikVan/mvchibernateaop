package mha.controller;

import mha.dao.EmployeeDAO;
import mha.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 25.02.2022
 */
@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @RequestMapping("/")
    public String showAllEmployee(Model model) {
        List<Employee> allEmployee = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployee);
        return "allEmployees";
    }
}