package com.dao;

import com.model.Leibie;
import com.model.LeibieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeibieMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    int countByExample(LeibieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    int deleteByExample(LeibieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    int insert(Leibie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    int insertSelective(Leibie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    List<Leibie> selectByExample(LeibieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") Leibie record, @Param("example") LeibieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leibie
     *
     * @mbggenerated Tue Jun 20 19:29:05 CST 2017
     */
    int updateByExample(@Param("record") Leibie record, @Param("example") LeibieExample example);
}