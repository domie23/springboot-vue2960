package com.entity.model;

import com.entity.CanzhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 餐桌
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CanzhuoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 餐桌名称
     */
    private String canzhuoName;


    /**
     * 餐桌图片
     */
    private String canzhuoPhoto;


    /**
     * 餐桌位置
     */
    private String canzhuoAddress;


    /**
     * 是否使用
     */
    private Integer shiyongTypes;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
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
	 * 获取：餐桌名称
	 */
    public String getCanzhuoName() {
        return canzhuoName;
    }


    /**
	 * 设置：餐桌名称
	 */
    public void setCanzhuoName(String canzhuoName) {
        this.canzhuoName = canzhuoName;
    }
    /**
	 * 获取：餐桌图片
	 */
    public String getCanzhuoPhoto() {
        return canzhuoPhoto;
    }


    /**
	 * 设置：餐桌图片
	 */
    public void setCanzhuoPhoto(String canzhuoPhoto) {
        this.canzhuoPhoto = canzhuoPhoto;
    }
    /**
	 * 获取：餐桌位置
	 */
    public String getCanzhuoAddress() {
        return canzhuoAddress;
    }


    /**
	 * 设置：餐桌位置
	 */
    public void setCanzhuoAddress(String canzhuoAddress) {
        this.canzhuoAddress = canzhuoAddress;
    }
    /**
	 * 获取：是否使用
	 */
    public Integer getShiyongTypes() {
        return shiyongTypes;
    }


    /**
	 * 设置：是否使用
	 */
    public void setShiyongTypes(Integer shiyongTypes) {
        this.shiyongTypes = shiyongTypes;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
