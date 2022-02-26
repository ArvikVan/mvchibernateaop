package mha.service;

import mha.entity.Employee;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 26.02.2022
 */
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
