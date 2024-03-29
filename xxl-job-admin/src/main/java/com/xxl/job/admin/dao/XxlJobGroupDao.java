package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * XxlJobGroupDao
 */
@Mapper
public interface XxlJobGroupDao {

     List<XxlJobGroup> findAll();

     List<XxlJobGroup> findByAddressType(@Param("addressType") int addressType);

     int save(XxlJobGroup xxlJobGroup);

     int update(XxlJobGroup xxlJobGroup);

     int remove(@Param("id") int id);

     XxlJobGroup load(@Param("id") int id);
}
