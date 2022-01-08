package com.cruddemo.datatable.service;

import com.cruddemo.datatable.dao.Repo;
import com.cruddemo.datatable.structr.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    Repo repo;

    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee getEmployee(int eid) {
        return repo.findById(eid).get();
    }

    public Employee updateEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee deleteEmployee(int eid) {
        Optional<Employee> employee = repo.findById(eid);
        if (employee.isPresent()) {
            repo.delete(employee.get());
            return null;
        } else {
            throw new RuntimeException("Record Not Found");
        }

    }

    public Iterable<Employee> savell(List<Employee> employees){
        return repo.saveAll(employees);
    }
}