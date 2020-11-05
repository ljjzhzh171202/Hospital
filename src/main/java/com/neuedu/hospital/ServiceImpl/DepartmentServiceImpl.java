package com.neuedu.hospital.ServiceImpl;

import com.neuedu.hospital.mapper.DepartmentMapper;
import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.DepartmentExample;
import com.neuedu.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DataSourceTransactionManager dataSourceTransactionManager;
    @Autowired
    TransactionDefinition transactionDefinition;
    @Autowired
    private DepartmentMapper departmentMapper;

    //查询所有
    @Override
    public List<Department> selectAll() {
        DepartmentExample departmentExample=new DepartmentExample();
        DepartmentExample.Criteria criteria=departmentExample.createCriteria();
        criteria.andDepartmentIdIsNotNull();
        List<Department> list=departmentMapper.selectByExample(departmentExample);
        return list;
    }
    //添加
    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer departmentId) {
        return departmentMapper.deleteByPrimaryKey(departmentId);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }

    @Override
    public Department selectByname(String name) {
        return departmentMapper.selectByname(name);
    }


}
