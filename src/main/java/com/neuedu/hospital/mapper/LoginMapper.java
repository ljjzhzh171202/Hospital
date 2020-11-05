package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.pojo.LoginExample;
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

public interface LoginMapper {
    @SelectProvider(type=LoginSqlProvider.class, method="countByExample")
    int countByExample(LoginExample example);

    @DeleteProvider(type=LoginSqlProvider.class, method="deleteByExample")
    int deleteByExample(LoginExample example);

    @Delete({
        "delete from login",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into login (id, username, ",
        "password, role)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{role,jdbcType=VARCHAR})"
    })
    int insert(Login record);

    @InsertProvider(type=LoginSqlProvider.class, method="insertSelective")
    int insertSelective(Login record);

    @SelectProvider(type=LoginSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Login> selectByExample(LoginExample example);

    @Select({
        "select",
        "id, username, password, role",
        "from login",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Login selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, username, password, role",
            "from login",
            "where username = #{username,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="role", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Login selectByName(String name);

    @UpdateProvider(type=LoginSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    @UpdateProvider(type=LoginSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    @UpdateProvider(type=LoginSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Login record);

    @Update({
        "update login",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Login record);
}