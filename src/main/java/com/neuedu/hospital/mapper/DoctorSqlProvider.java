package com.neuedu.hospital.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.neuedu.hospital.pojo.Doctor;
import com.neuedu.hospital.pojo.DoctorExample.Criteria;
import com.neuedu.hospital.pojo.DoctorExample.Criterion;
import com.neuedu.hospital.pojo.DoctorExample;
import java.util.List;
import java.util.Map;

public class DoctorSqlProvider {

    public String countByExample(DoctorExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("doctor");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(DoctorExample example) {
        BEGIN();
        DELETE_FROM("doctor");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Doctor record) {
        BEGIN();
        INSERT_INTO("doctor");
        
        if (record.getDoctorId() != null) {
            VALUES("doctor_id", "#{doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorIname() != null) {
            VALUES("doctor_iname", "#{doctorIname,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIcertid() != null) {
            VALUES("doctor_icertId", "#{doctorIcertid,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIsex() != null) {
            VALUES("doctor_isex", "#{doctorIsex,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIdepartment() != null) {
            VALUES("doctor_idepartment", "#{doctorIdepartment,jdbcType=INTEGER}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorTel() != null) {
            VALUES("doctor_tel", "#{doctorTel,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorPrice() != null) {
            VALUES("doctor_price", "#{doctorPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getDoctorItext() != null) {
            VALUES("doctor_itext", "#{doctorItext,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExampleWithBLOBs(DoctorExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("doctor_id");
        } else {
            SELECT("doctor_id");
        }
        SELECT("doctor_iname");
        SELECT("doctor_icertId");
        SELECT("doctor_isex");
        SELECT("doctor_idepartment");
        SELECT("password");
        SELECT("doctor_tel");
        SELECT("doctor_price");
        SELECT("doctor_itext");
        FROM("doctor");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String selectByExample(DoctorExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("doctor_id");
        } else {
            SELECT("doctor_id");
        }
        SELECT("doctor_iname");
        SELECT("doctor_icertId");
        SELECT("doctor_isex");
        SELECT("doctor_idepartment");
        SELECT("password");
        SELECT("doctor_tel");
        SELECT("doctor_price");
        SELECT("doctor_itext");

        FROM("doctor");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Doctor record = (Doctor) parameter.get("record");
        DoctorExample example = (DoctorExample) parameter.get("example");
        
        BEGIN();
        UPDATE("doctor");
        
        if (record.getDoctorId() != null) {
            SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorIname() != null) {
            SET("doctor_iname = #{record.doctorIname,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIcertid() != null) {
            SET("doctor_icertId = #{record.doctorIcertid,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIsex() != null) {
            SET("doctor_isex = #{record.doctorIsex,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIdepartment() != null) {
            SET("doctor_idepartment = #{record.doctorIdepartment,jdbcType=INTEGER}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorTel() != null) {
            SET("doctor_tel = #{record.doctorTel,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorPrice() != null) {
            SET("doctor_price = #{record.doctorPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getDoctorItext() != null) {
            SET("doctor_itext = #{record.doctorItext,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("doctor");
        
        SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        SET("doctor_iname = #{record.doctorIname,jdbcType=VARCHAR}");
        SET("doctor_icertId = #{record.doctorIcertid,jdbcType=VARCHAR}");
        SET("doctor_isex = #{record.doctorIsex,jdbcType=VARCHAR}");
        SET("doctor_idepartment = #{record.doctorIdepartment,jdbcType=INTEGER}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("doctor_tel = #{record.doctorTel,jdbcType=VARCHAR}");
        SET("doctor_price = #{record.doctorPrice,jdbcType=DECIMAL}");
        SET("doctor_itext = #{record.doctorItext,jdbcType=LONGVARCHAR}");
        
        DoctorExample example = (DoctorExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("doctor");
        
        SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        SET("doctor_iname = #{record.doctorIname,jdbcType=VARCHAR}");
        SET("doctor_icertId = #{record.doctorIcertid,jdbcType=VARCHAR}");
        SET("doctor_isex = #{record.doctorIsex,jdbcType=VARCHAR}");
        SET("doctor_idepartment = #{record.doctorIdepartment,jdbcType=INTEGER}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("doctor_tel = #{record.doctorTel,jdbcType=VARCHAR}");
        SET("doctor_price = #{record.doctorPrice,jdbcType=DECIMAL}");
        
        DoctorExample example = (DoctorExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Doctor record) {
        BEGIN();
        UPDATE("doctor");
        
        if (record.getDoctorIname() != null) {
            SET("doctor_iname = #{doctorIname,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIcertid() != null) {
            SET("doctor_icertId = #{doctorIcertid,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIsex() != null) {
            SET("doctor_isex = #{doctorIsex,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIdepartment() != null) {
            SET("doctor_idepartment = #{doctorIdepartment,jdbcType=INTEGER}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorTel() != null) {
            SET("doctor_tel = #{doctorTel,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorPrice() != null) {
            SET("doctor_price = #{doctorPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getDoctorItext() != null) {
            SET("doctor_itext = #{doctorItext,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("doctor_id = #{doctorId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(DoctorExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}