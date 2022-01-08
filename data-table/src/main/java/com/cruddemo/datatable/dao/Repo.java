package com.cruddemo.datatable.dao;

import com.cruddemo.datatable.structr.Employee;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Employee, Integer> {

}
