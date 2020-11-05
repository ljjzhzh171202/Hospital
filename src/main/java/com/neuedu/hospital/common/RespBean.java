package com.neuedu.hospital.common;

import java.util.List;
import java.util.Map;

/**
 *  回复状态 Bean，包括数据：
 *  status:对应前端消息框状态字符串：success/warning/info/error
 *  msg:对应前端消息框显示内容
 *  
 *  分页内容：
 *  totalCount:对应查询数据 总条目数
 *  list:对应查询数据  页面类型
 *  defaultSize:分页条数，为10，本项目不进行改变
 *  
 */
public class RespBean {
    private String status;
    private String msg;
    private int totalCount;
    private List<Map<String,Object>> list;
    public static int defaultSize = 10;
	public RespBean() {
		super();
	}
	public RespBean(String status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public RespBean(String status, String msg, int totalCount, List<Map<String, Object>> list) {
		super();
		this.status = status;
		this.msg = msg;
		this.totalCount = totalCount;
		this.list = list;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + totalCount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RespBean other = (RespBean) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalCount != other.totalCount)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RespBean [status=" + status + ", msg=" + msg + ", totalCount=" + totalCount + ", list=" + list + "]";
	}    
}
