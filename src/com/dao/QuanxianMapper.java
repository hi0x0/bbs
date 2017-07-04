package com.dao;

import com.model.Quanxian;
import com.model.QuanxianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuanxianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    int countByExample(QuanxianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    int deleteByExample(QuanxianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    int insert(Quanxian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    int insertSelective(Quanxian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    List<Quanxian> selectByExample(QuanxianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") Quanxian record, @Param("example") QuanxianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quanxian
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    int updateByExample(@Param("record") Quanxian record, @Param("example") QuanxianExample example);
}