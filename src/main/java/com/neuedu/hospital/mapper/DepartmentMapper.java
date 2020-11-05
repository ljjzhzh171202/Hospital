package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DepartmentMapper {
    @SelectProvider(type=DepartmentSqlProvider.class, method="countByExample")
    int countByExample(DepartmentExample example);

    @DeleteProvider(type=DepartmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(DepartmentExample example);

    @Delete({
        "delete from department",
        "where department_id = #{departmentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer departmentId);

    @Insert({
        "insert into department (department_id, department_name)",
        "values (#{departmentId,jdbcType=INTEGER}, #{departmentName,jdbcType=VARCHAR})"
    })
    int insert(Department record);

    @InsertProvider(type=DepartmentSqlProvider.class, method="insertSelective")
    int insertSelective(Department record);

    @SelectProvider(type=DepartmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="department_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="department_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Department> selectByExample(DepartmentExample example);

    @Select({
        "select",
        "department_id, department_name",
        "from department",
        "where department_id = #{departmentId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="department_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="department_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Department selectByPrimaryKey(Integer departmentId);

    @Select({
            "select",
            "department_id, department_name",
            "from department",
            "where department_name = #{department_name,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column="department_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="department_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Department selectByname(String name);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Department record);

    @Update({
        "update department",
        "set department_name = #{departmentName,jdbcType=VARCHAR}",
        "where department_id = #{departmentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Department record);
}