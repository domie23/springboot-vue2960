package com.entity.model;

import com.entity.CanzhuozhanyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 餐桌占用
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CanzhuozhanyongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 餐桌
     */
    private Integer canzhuoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 餐桌状态
     */
    private Integer canzhuozhanyongTypes;


    /**
     * 备注
     */
    private String canzhuozhanyongContent;


    /**
     * 占用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：餐桌
	 */
    public Integer getCanzhuoId() {
        return canzhuoId;
    }


    /**
	 * 设置：餐桌
	 */
    public void setCanzhuoId(Integer canzhuoId) {
        this.canzhuoId = canzhuoId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：餐桌状态
	 */
    public Integer getCanzhuozhanyongTypes() {
        return canzhuozhanyongTypes;
    }


    /**
	 * 设置：餐桌状态
	 */
    public void setCanzhuozhanyongTypes(Integer canzhuozhanyongTypes) {
        this.canzhuozhanyongTypes = canzhuozhanyongTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getCanzhuozhanyongContent() {
        return canzhuozhanyongContent;
    }


    /**
	 * 设置：备注
	 */
    public void setCanzhuozhanyongContent(String canzhuozhanyongContent) {
        this.canzhuozhanyongContent = canzhuozhanyongContent;
    }
    /**
	 * 获取：占用时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：占用时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
