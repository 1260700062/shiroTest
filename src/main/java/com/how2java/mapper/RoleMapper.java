package com.how2java.mapper;

import com.how2java.pojo.Role;
import com.how2java.pojo.RoleExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	List<Role> selectByExample(RoleExample example);

	Role selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}