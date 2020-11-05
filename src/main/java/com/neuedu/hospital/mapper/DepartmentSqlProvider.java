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

import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.DepartmentExample.Criteria;
import com.neuedu.hospital.pojo.DepartmentExample.Criterion;
import com.neuedu.hospital.pojo.DepartmentExample;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public class DepartmentSqlProvider {

    public String countByExample(DepartmentExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("department");
        applyWhere(example, false);
        return SQL().toString();
    }

    public String deleteByExample(DepartmentExample example) {
        BEGIN();
        DELETE_FROM("department");
        applyWhere(example, false);
        return SQL().toString();
    }

    public String insertSelective(Department record) {
        BEGIN();
        INSERT_INTO("department");
        
        if (record.getDepartmentId() != null) {
            VALUES("department_id", "#{departmentId,jdbcType=INTEGER}");
        }
        
        if (record.getDepartmentName() != null) {
            VALUES("department_name", "#{departmentName,jdbcType=VARCHAR}");
        }
        return SQL().toString();
    }

    public String selectByExample(DepartmentExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("department_id");
        } else {
            SELECT("department_id");
        }
        SELECT("department_name");
        FROM("department");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL().toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Department record = (Department) parameter.get("record");
        DepartmentExample example = (DepartmentExample) parameter.get("example");
        
        BEGIN();
        UPDATE("department");
        
        if (record.getDepartmentId() != null) {
            SET("department_id = #{record.departmentId,jdbcType=INTEGER}");
        }
        
        if (record.getDepartmentName() != null) {
            SET("department_name = #{record.departmentName,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL().toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("department");
        
        SET("department_id = #{record.departmentId,jdbcType=INTEGER}");
        SET("department_name = #{record.departmentName,jdbcType=VARCHAR}");
        
        DepartmentExample example = (DepartmentExample) parameter.get("example");
        applyWhere(example, true);
        return SQL().toString();
    }

    public String updateByPrimaryKeySelective(Department record) {
        BEGIN();
        UPDATE("department");
        
        if (record.getDepartmentName() != null) {
            SET("department_name = #{departmentName,jdbcType=VARCHAR}");
        }
        
        WHERE("department_id = #{departmentId,jdbcType=INTEGER}");
        
        return SQL().toString();
    }

    protected void applyWhere(DepartmentExample example, boolean includeExamplePhrase) {
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