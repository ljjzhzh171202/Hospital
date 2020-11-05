package com.neuedu.hospital.controller;

import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.Patient;
import com.neuedu.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/department")
@Commit
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //查询所有
    @PostMapping(value = "/listdepartment")
    @ResponseBody
    public List<Department> getdepartmentAll(){
        List<Department> departmentList = departmentService.selectAll();
        return departmentList;
    }
    //根据名称查询
    @PostMapping("/selectByName")
    @ResponseBody
    public Department selectByName(@RequestBody Department department){
        String name = department.getDepartmentName();
        Department departments=departmentService.selectByname(String.valueOf(name));
        return departments;
    }
    //添加
    @PostMapping(value = "/adddepartment")
    @ResponseBody
    public String adddepartment(@RequestBody Department department){
        String departmentName = department.getDepartmentName();

        department.setDepartmentName(departmentName);
        int result = departmentService.insert(department);
        System.out.println("departmentName" +":" + departmentName);
        if(result<=0){
            return "添加失败!";
        }
        return "添加成功!";
    }

    //删除
    @RequestMapping("/deleteDepartment")
    @ResponseBody
    public String deleteUser(@RequestBody Department department){
        Integer id = department.getDepartmentId();
        int result=departmentService.deleteByPrimaryKey(id);
        if(result<=0){
            return "删除失败!";
        }
        return "删除成功!";
    }

    //修改
    @PostMapping(value = "/updatedepartment")
    @ResponseBody
    public String updatedepartment(@RequestBody Department department){
        Integer id = department.getDepartmentId();
        String departmentName = department.getDepartmentName();
        department.setDepartmentName(departmentName);
        int result = departmentService.updateByPrimaryKey(department);
        if(result<=0){
            return "修改失败!";
        }
        return "修改成功!";
    }
}
