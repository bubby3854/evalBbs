package com.green.evalBbs.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.evalBbs.dto.EvalBbsDto;


@Mapper
public  interface IEvalBbsDao {
	
	public List<EvalBbsDto> getList();
	public EvalBbsDto getDto(@Param("id") String id);
	public void write(String writer, String title, String content);
	public void delete(@Param("id") String id);

}
