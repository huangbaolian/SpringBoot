package com.hbl.sBoot.controller;


import com.hbl.sBoot.entities.Department;
import com.hbl.sBoot.entities.Employee;
import com.hbl.sBoot.mapper.DepartmentMapper;
import com.hbl.sBoot.mapper.EmployeeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags={"department增删改查"})
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DepartmentMapper departm;

    @Autowired
    EmployeeMapper employeeM;
    @ApiOperation(value = "查询一个department")
    @GetMapping("/deptSelect/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departm.getDeptByid(id);
    }
    @ApiOperation(value = "插入一个department")
    @GetMapping("/deptInsert")
    public Department insertDepartment(Department department){
        departm.insertDept(department);
        return department;
    }
    @ApiOperation(value = "删除一个department")
    @GetMapping("/deptDelete/{id}")
    public int deleteDepartment(@PathVariable("id") Integer id){
        int i = departm.deleteDeptById(id);
        return i;
    }
    @ApiOperation(value = "更新一个department")
    @GetMapping("/deptUpdate")
    public Department updateDepartment(Department department){
        departm.updateDept(department);
        return department;
    }
    @ApiOperation(value = "查询一个Employee")
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeM.getEmpById(id);
    }
}
