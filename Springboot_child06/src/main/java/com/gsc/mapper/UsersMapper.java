package com.gsc.mapper;

import com.gsc.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);
    int delById(int id);
    List<String> getNameList();
}
