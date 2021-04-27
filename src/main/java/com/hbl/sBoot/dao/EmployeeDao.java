package com.hbl.sBoot.dao;

import com.hbl.sBoot.entities.Department;
import com.hbl.sBoot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.util.pattern.PathPattern;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer,Employee>();
        employees.put(1001,new Employee(1001,"AAA","aaa.@qq.com",1,new Department(1001,"G1")));
        employees.put(1002,new Employee(1002,"BBB","bbb.@qq.com",1,new Department(1002,"H1")));
        employees.put(1003,new Employee(1003,"CCC","ccc.@qq.com",1,new Department(1003,"K1")));
        employees.put(1004,new Employee(1004,"DDD","ddd.@qq.com",1,new Department(1004,"Y1")));
        employees.put(1005,new Employee(1005,"EEE","eee.@qq.com",1,new Department(1005,"Z1")));
    }
    private static Integer initId = 1006;
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
}
