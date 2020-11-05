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

import com.neuedu.hospital.pojo.Patient;
import com.neuedu.hospital.pojo.PatientExample.Criteria;
import com.neuedu.hospital.pojo.PatientExample.Criterion;
import com.neuedu.hospital.pojo.PatientExample;
import java.util.List;
import java.util.Map;

public class PatientSqlProvider {

    public String countByExample(PatientExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("patient");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(PatientExample example) {
        BEGIN();
        DELETE_FROM("patient");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Patient record) {
        BEGIN();
        INSERT_INTO("patient");
        
        if (record.getPatientId() != null) {
            VALUES("patient_id", "#{patientId,jdbcType=INTEGER}");
        }
        
        if (record.getPatientName() != null) {
            VALUES("patient_name", "#{patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientCertid() != null) {
            VALUES("patient_certId", "#{patientCertid,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientSex() != null) {
            VALUES("patient_sex", "#{patientSex,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientTel() != null) {
            VALUES("patient_tel", "#{patientTel,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(PatientExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("patient_id");
        } else {
            SELECT("patient_id");
        }
        SELECT("patient_name");
        SELECT("patient_certId");
        SELECT("patient_sex");
        SELECT("password");
        SELECT("patient_tel");
        FROM("patient");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Patient record = (Patient) parameter.get("record");
        PatientExample example = (PatientExample) parameter.get("example");
        
        BEGIN();
        UPDATE("patient");
        
        if (record.getPatientId() != null) {
            SET("patient_id = #{record.patientId,jdbcType=INTEGER}");
        }
        
        if (record.getPatientName() != null) {
            SET("patient_name = #{record.patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientCertid() != null) {
            SET("patient_certId = #{record.patientCertid,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientSex() != null) {
            SET("patient_sex = #{record.patientSex,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientTel() != null) {
            SET("patient_tel = #{record.patientTel,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("patient");
        
        SET("patient_id = #{record.patientId,jdbcType=INTEGER}");
        SET("patient_name = #{record.patientName,jdbcType=VARCHAR}");
        SET("patient_certId = #{record.patientCertid,jdbcType=VARCHAR}");
        SET("patient_sex = #{record.patientSex,jdbcType=VARCHAR}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("patient_tel = #{record.patientTel,jdbcType=VARCHAR}");
        
        PatientExample example = (PatientExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Patient record) {
        BEGIN();
        UPDATE("patient");
        
        if (record.getPatientName() != null) {
            SET("patient_name = #{patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientCertid() != null) {
            SET("patient_certId = #{patientCertid,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientSex() != null) {
            SET("patient_sex = #{patientSex,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientTel() != null) {
            SET("patient_tel = #{patientTel,jdbcType=VARCHAR}");
        }
        
        WHERE("patient_id = #{patientId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(PatientExample example, boolean includeExamplePhrase) {
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