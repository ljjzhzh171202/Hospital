package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Appointment;
import com.neuedu.hospital.pojo.AppointmentExample;
import java.util.Date;
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

public interface AppointmentMapper {
    @SelectProvider(type=AppointmentSqlProvider.class, method="countByExample")
    int countByExample(AppointmentExample example);

    @DeleteProvider(type=AppointmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(AppointmentExample example);

    @Delete({
        "delete from appointment",
        "where appointment_id = #{appointmentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer appointmentId);

    @Insert({
        "insert into appointment (appointment_id, patient_id, ",
        "doctor_id, ilness, ",
        "booktime, createtime, ",
        "status)",
        "values (#{appointmentId,jdbcType=INTEGER}, #{patientId,jdbcType=INTEGER}, ",
        "#{doctorId,jdbcType=INTEGER}, #{ilness,jdbcType=VARCHAR}, ",
        "#{booktime,jdbcType=DATE}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(Appointment record);

    @InsertProvider(type=AppointmentSqlProvider.class, method="insertSelective")
    int insertSelective(Appointment record);

    @SelectProvider(type=AppointmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="appointment_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="patient_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ilness", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="booktime", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="createtime", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<Appointment> selectByExample(AppointmentExample example);

    @Select({
        "select",
        "appointment_id, patient_id, doctor_id, ilness, booktime, createtime, status",
        "from appointment",
        "where appointment_id = #{appointmentId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="appointment_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="patient_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="doctor_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ilness", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="booktime", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="createtime", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Appointment selectByPrimaryKey(Integer appointmentId);

    @UpdateProvider(type=AppointmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    @UpdateProvider(type=AppointmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    @UpdateProvider(type=AppointmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Appointment record);

    @Update({
        "update appointment",
        "set patient_id = #{patientId,jdbcType=INTEGER},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "ilness = #{ilness,jdbcType=VARCHAR},",
          "booktime = #{booktime,jdbcType=DATE},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where appointment_id = #{appointmentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Appointment record);
}