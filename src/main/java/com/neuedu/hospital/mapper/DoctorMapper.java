package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Doctor;
import com.neuedu.hospital.pojo.DoctorExample;
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

public interface DoctorMapper {
    @SelectProvider(type=DoctorSqlProvider.class, method="countByExample")
    int countByExample(DoctorExample example);

    @DeleteProvider(type=DoctorSqlProvider.class, method="deleteByExample")
    int deleteByExample(DoctorExample example);

    @Delete({
        "delete from doctor",
        "where doctor_id = #{doctorId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer doctorId);

    @Insert({
        "insert into doctor (doctor_id, doctor_iname, ",
        "doctor_icertId, doctor_isex, ",
        "doctor_idepartment, password, ",
        "doctor_tel, doctor_price, ",
        "doctor_itext,doctor_img)",
        "values (#{doctorId,jdbcType=INTEGER}, #{doctorIname,jdbcType=VARCHAR}, ",
        "#{doctorIcertid,jdbcType=VARCHAR}, #{doctorIsex,jdbcType=VARCHAR}, ",
        "#{doctorIdepartment,jdbcType=INTEGER}, #{password,jdbcType=VARCHAR}, ",
        "#{doctorTel,jdbcType=VARCHAR}, #{doctorPrice,jdbcType=DECIMAL}, ",
        "#{doctorItext,jdbcType=LONGVARCHAR},#{doctorImg,jdbcType=VARCHAR})"
    })
    int insert(Doctor record);

    @InsertProvider(type=DoctorSqlProvider.class, method="insertSelective")
    int insertSelective(Doctor record);

    @SelectProvider(type=DoctorSqlProvider.class, method="selectByExampleWithBLOBs")
    @ConstructorArgs({
        @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="doctor_iname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_icertId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_isex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_idepartment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_price", javaType=Double.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="doctor_itext", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR),
            @Arg(column="doctor_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Doctor> selectByExampleWithBLOBs(DoctorExample example);

    @SelectProvider(type=DoctorSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="doctor_iname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_icertId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_isex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_idepartment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_price", javaType=Double.class, jdbcType=JdbcType.DECIMAL),
            @Arg(column="doctor_itext", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR),
            @Arg(column="doctor_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Doctor> selectByExample(DoctorExample example);

    @Select({
        "select",
        "doctor_id, doctor_iname, doctor_icertId, doctor_isex, doctor_idepartment, password, ",
        "doctor_tel, doctor_price, doctor_itext, doctor_img",
        "from doctor",
        "where doctor_iname = #{doctor_iname,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="doctor_iname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_icertId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_isex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_idepartment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="doctor_price", javaType=Double.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="doctor_itext", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR),
            @Arg(column="doctor_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Doctor selectByNmae(String name);

    @Select({
            "select",
            "doctor_id, doctor_iname, doctor_icertId, doctor_isex, doctor_idepartment, password, ",
            "doctor_tel, doctor_price, doctor_itext, doctor_img",
            "from doctor",
            "where doctor_idepartment= #{doctor_idepartment,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="doctor_iname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_icertId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_isex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_idepartment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_price", javaType=Double.class, jdbcType=JdbcType.DECIMAL),
            @Arg(column="doctor_itext", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR),
            @Arg(column="doctor_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Doctor> selectBydepartment(Integer department);

    @Select({
            "select",
            "doctor_id, doctor_iname, doctor_icertId, doctor_isex, doctor_idepartment, password, ",
            "doctor_tel, doctor_price, doctor_itext, doctor_img",
            "from doctor",
            "where doctor_id = #{doctorId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="doctor_iname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_icertId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_isex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_idepartment", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="doctor_price", javaType=Double.class, jdbcType=JdbcType.DECIMAL),
            @Arg(column="doctor_itext", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR),
            @Arg(column="doctor_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Doctor selectByPrimaryKey(Integer doctorId);

    @UpdateProvider(type=DoctorSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    @UpdateProvider(type=DoctorSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Doctor record, @Param("example") DoctorExample example);

    @UpdateProvider(type=DoctorSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    @UpdateProvider(type=DoctorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Doctor record);

    @Update({
        "update doctor",
        "set doctor_iname = #{doctorIname,jdbcType=VARCHAR},",
          "doctor_icertId = #{doctorIcertid,jdbcType=VARCHAR},",
          "doctor_isex = #{doctorIsex,jdbcType=VARCHAR},",
          "doctor_idepartment = #{doctorIdepartment,jdbcType=INTEGER},",
          "password = #{password,jdbcType=VARCHAR},",
          "doctor_tel = #{doctorTel,jdbcType=VARCHAR},",
          "doctor_price = #{doctorPrice,jdbcType=DECIMAL},",
          "doctor_itext = #{doctorItext,jdbcType=LONGVARCHAR},",
            "doctor_img = #{doctorImg,jdbcType=VARCHAR}",
        "where doctor_id = #{doctorId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Doctor record);

    @Update({
        "update doctor",
        "set doctor_iname = #{doctorIname,jdbcType=VARCHAR},",
          "doctor_icertId = #{doctorIcertid,jdbcType=VARCHAR},",
          "doctor_isex = #{doctorIsex,jdbcType=VARCHAR},",
          "doctor_idepartment = #{doctorIdepartment,jdbcType=INTEGER},",
          "password = #{password,jdbcType=VARCHAR},",
          "doctor_tel = #{doctorTel,jdbcType=VARCHAR},",
          "doctor_price = #{doctorPrice,jdbcType=DECIMAL},",
            "doctor_img = #{doctorImg,jdbcType=VARCHAR}",
        "where doctor_id = #{doctorId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Doctor record);
}