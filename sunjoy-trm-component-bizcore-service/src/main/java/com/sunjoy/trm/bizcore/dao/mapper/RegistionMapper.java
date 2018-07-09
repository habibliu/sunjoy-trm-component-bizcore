package com.sunjoy.trm.bizcore.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sunjoy.trm.bizcore.dao.dto.RegistionDto;
import com.sunjoy.trm.bizcore.dao.dto.ScheduleStudentDto;
import com.sunjoy.trm.bizcore.dao.entity.Registion;

/**
 * 课程注册MAPPER接口
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface RegistionMapper{
	/**
	 * 查询课程注册记录，支持分页查询 
	 * @param params Map<String,Object>容器，需要提供两个参数：
	 * 	1、参数名为criteria的RegistionCriteria对象
	 *  2、参数名为page的Page对象
	 * @return
	 */
	List<RegistionDto> queryRegistions(Map<String,Object> params);
	
	/**
	 * 查询课程注册的记录数
	 * @param criteria
	 * @return
	 */
	Long queryRegistionsCount(Map<String,Object> params);
	
	/**
	 * 新增课程注册记录
	 * @param registion
	 * @return
	 */
	int addRegistion(Registion registion);
	
	/**
	 * 根据主键获取对应的注册记录
	 * @param pk
	 * @return
	 */
	RegistionDto selectOneByPrimaryKey(@Param("id") String id);
	
	/**
	 * 根据主键更新课程注册记录
	 * @param registion
	 * @return
	 */
	int updateRegistion(Registion registion);
	
	/**
	 * 取课程的报名学生
	 * @param courseId
	 * @return
	 */
	List<ScheduleStudentDto> getCourseStudents(@Param("courseId") String courseId);
	
	/**
	 * 删除注册记录
	 * @param id
	 * @return
	 */
	int deleteRegistion(@Param("id") String id);
}
