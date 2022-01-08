package com.cruddemo.datatable.controller;

import com.cruddemo.datatable.service.EmpService;
import com.cruddemo.datatable.structr.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("/create")
    public Employee saveEmployee(@RequestBody Employee employee){
        return empService.saveEmployee(employee);
    }
    @PostMapping("/bulkadd")
    public Iterable<Employee> saveAll(@RequestBody List<Employee> employees){
        return empService.savell(employees);
    }

    @GetMapping("/read/{eid}")
    public Employee getEmployee(@PathVariable("eid") int eid){
        return empService.getEmployee(eid);
    }


    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
       return empService.updateEmployee(employee);

    }
    @DeleteMapping("/delete/{eid}")
    public Employee deleteEmployee(@PathVariable("eid") int eid){
        empService.deleteEmployee(eid);
        return null;
    }

}