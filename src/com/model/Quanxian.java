package com.model;

public class Quanxian {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quanxian.quanxian_id
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    private Integer quanxianId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quanxian.body
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    private String body;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quanxian.quanxian_id
     *
     * @return the value of quanxian.quanxian_id
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    public Integer getQuanxianId() {
        return quanxianId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quanxian.quanxian_id
     *
     * @param quanxianId the value for quanxian.quanxian_id
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    public void setQuanxianId(Integer quanxianId) {
        this.quanxianId = quanxianId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quanxian.body
     *
     * @return the value of quanxian.body
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quanxian.body
     *
     * @param body the value for quanxian.body
     *
     * @mbggenerated Tue Jun 20 19:29:04 CST 2017
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}