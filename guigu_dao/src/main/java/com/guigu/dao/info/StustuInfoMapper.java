package com.guigu.dao.info;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.guigu.domain.info.Stuclass;
import com.guigu.domain.info.StudentInfo;
import com.guigu.domain.info.Studorm;

@Mapper
public interface StustuInfoMapper {
	/**
	 * 根据学生学号查询学生基本信息 
	 * @param stuid
	 * @return
	 * @throws Exception
	 */
StudentInfo querybystuid(String stuid) throws Exception;
/**
 * 根据班级编号查询该班学生基本信息
 * @param classid
 * @return
 * @throws Exception
 */
List<StudentInfo> querybyclassid(StudentInfo studentInfo) throws Exception;
/**
 * 查询所有班级编号和名字
 * @param
 * @return
 * @throws Exception
 */
List<Stuclass> querybyallclass() throws Exception;
/**
 * 查询所有宿舍编号和名字
 * @param
 * @return
 * @throws Exception
 */
List<Studorm> querybyalldorm() throws Exception;
/**
 *添加学生
 * @param
 * @return
 * @throws Exception
 */
void addstudentinfo() throws Exception;
/**
 *修改学生
 * @param
 * @return
 * @throws Exception
 */
void updatestudentinfo(StudentInfo studentinfo) throws Exception;
/**
 *根据学号查询学生信息
 * @param
 * @return
 * @throws Exception
 */
StudentInfo querybyupstuid(String stuid) throws Exception;
/**
 *根据学号删除学生信息
 * @param
 * @return
 * @throws Exception
 */
void deletebystuid(String stuid) throws Exception;

}
