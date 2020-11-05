package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Patient;
import com.neuedu.hospital.pojo.PatientExample;
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

public interface PatientMapper {
    @SelectProvider(type=PatientSqlProvider.class, method="countByExample")
    int countByExample(PatientExample example);

    @DeleteProvider(type=PatientSqlProvider.class, method="deleteByExample")
    int deleteByExample(PatientExample example);

    @Delete({
        "delete from patient",
        "where patient_id = #{patientId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer patientId);

    @Insert({
        "insert into patient (patient_id, patient_name, ",
        "patient_certId, patient_sex, ",
        "password, patient_tel)",
        "values (#{patientId,jdbcType=INTEGER}, #{patientName,jdbcType=VARCHAR}, ",
        "#{patientCertid,jdbcType=VARCHAR}, #{patientSex,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{patientTel,jdbcType=VARCHAR})"
    })
    int insert(Patient record);

    @InsertProvider(type=PatientSqlProvider.class, method="insertSelective")
    int insertSelective(Patient record);

    @SelectProvider(type=PatientSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="patient_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="patient_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="patient_certId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="patient_sex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="patient_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Patient> selectByExample(PatientExample example);

    @Select({
        "select",
        "patient_id, patient_name, patient_certId, patient_sex, password, patient_tel",
        "from patient",
        "where patient_id = #{patientId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="patient_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="patient_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="patient_certId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="patient_sex", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="patient_tel", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Patient selectByPrimaryKey(Integer patientId);

    @UpdateProvider(type=PatientSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    @UpdateProvider(type=PatientSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    @UpdateProvider(type=PatientSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Patient record);

    @Update({
        "update patient",
        "set patient_name = #{patientName,jdbcType=VARCHAR},",
          "patient_certId = #{patientCertid,jdbcType=VARCHAR},",
          "patient_sex = #{patientSex,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "patient_tel = #{patientTel,jdbcType=VARCHAR}",
        "where patient_id = #{patientId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Patient record);
}