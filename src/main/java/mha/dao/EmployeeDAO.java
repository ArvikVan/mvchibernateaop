package mha.dao;

import mha.entity.Employee;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 25.02.2022
 */
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
