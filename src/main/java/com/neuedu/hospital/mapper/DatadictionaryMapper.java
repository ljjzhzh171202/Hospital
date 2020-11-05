package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Datadictionary;
import com.neuedu.hospital.pojo.DatadictionaryExample;
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

public interface DatadictionaryMapper {
    @SelectProvider(type=DatadictionarySqlProvider.class, method="countByExample")
    int countByExample(DatadictionaryExample example);

    @DeleteProvider(type=DatadictionarySqlProvider.class, method="deleteByExample")
    int deleteByExample(DatadictionaryExample example);

    @Delete({
        "delete from datadictionary",
        "where datadictionary_id = #{datadictionaryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer datadictionaryId);

    @Insert({
        "insert into datadictionary (datadictionary_id, type, ",
        "value, name)",
        "values (#{datadictionaryId,jdbcType=INTEGER}, #{type,jdbcType=VARCHAR}, ",
        "#{value,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Datadictionary record);

    @InsertProvider(type=DatadictionarySqlProvider.class, method="insertSelective")
    int insertSelective(Datadictionary record);

    @SelectProvider(type=DatadictionarySqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="datadictionary_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Datadictionary> selectByExample(DatadictionaryExample example);

    @Select({
        "select",
        "datadictionary_id, type, value, name",
        "from datadictionary",
        "where datadictionary_id = #{datadictionaryId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="datadictionary_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Datadictionary selectByPrimaryKey(Integer datadictionaryId);

    @Select({
            "select",
            "datadictionary_id, type, value, name",
            "from datadictionary",
            "where type = #{type,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column="datadictionary_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Datadictionary> selectBytype(String type);

    @Select({
            "select",
            "datadictionary_id, type, value, name",
            "from datadictionary",
            "where name = #{name,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column="datadictionary_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Datadictionary selectByname(String name);

    @UpdateProvider(type=DatadictionarySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Datadictionary record, @Param("example") DatadictionaryExample example);

    @UpdateProvider(type=DatadictionarySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Datadictionary record, @Param("example") DatadictionaryExample example);

    @UpdateProvider(type=DatadictionarySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Datadictionary record);

    @Update({
        "update datadictionary",
        "set type = #{type,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR}",
        "where datadictionary_id = #{datadictionaryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Datadictionary record);
}