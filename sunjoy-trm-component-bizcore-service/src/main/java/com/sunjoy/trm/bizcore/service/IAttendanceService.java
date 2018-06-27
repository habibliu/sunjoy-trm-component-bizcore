package com.sunjoy.trm.bizcore.service;

import java.util.List;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.trm.bizcore.dao.criteria.AttendanceCriteria;
import com.sunjoy.trm.bizcore.dao.entity.Attendance;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface IAttendanceService {
	/**
	 * 分页查询
	 */
	public Page<Attendance> queryByPage(AttendanceCriteria criteria);

	/**
	 * 不分页查询
	 * 
	 * @param criteria
	 * @return
	 */
	public List<Attendance> query(AttendanceCriteria criteria);

	/**
	 * 更新考勤资料
	 * 
	 * @param student
	 * @return
	 */
	public Attendance update(Attendance student);

	/**
	 * 新增考勤记录
	 * 
	 * @param student
	 * @return
	 */
	public Attendance add(Attendance student);

	/**
	 * 根据主键删除考勤记录(逻辑删除)
	 * 
	 * @param id
	 * @return
	 */
	public int remove(String id);

	/**
	 * 根据主键获取考勤记录
	 * @param id
	 * @return
	 */
	public Attendance get(String id);
}
