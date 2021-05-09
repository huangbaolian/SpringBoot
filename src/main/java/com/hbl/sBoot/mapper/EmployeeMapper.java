package com.hbl.sBoot.mapper;

import com.hbl.sBoot.entities.Employee;
import org.mapstruct.Mapper;

//加上@Mapper注解或使用@MapperScan将接口扫描到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
