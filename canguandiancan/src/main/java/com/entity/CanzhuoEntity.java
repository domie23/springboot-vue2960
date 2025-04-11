package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 餐桌
 *
 * @author 
 * @email
 */
@TableName("canzhuo")
public class CanzhuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CanzhuoEntity() {

	}

	public CanzhuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 餐桌名称
     */
    @TableField(value = "canzhuo_name")

    private String canzhuoName;


    /**
     * 餐桌图片
     */
    @TableField(value = "canzhuo_photo")

    private String canzhuoPhoto;


    /**
     * 餐桌位置
     */
    @TableField(value = "canzhuo_address")

    private String canzhuoAddress;


    /**
     * 是否使用
     */
    @TableField(value = "shiyong_types")

    private Integer shiyongTypes;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：餐桌名称
	 */
    public String getCanzhuoName() {
        return canzhuoName;
    }


    /**
	 * 获取：餐桌名称
	 */

    public void setCanzhuoName(String canzhuoName) {
        this.canzhuoName = canzhuoName;
    }
    /**
	 * 设置：餐桌图片
	 */
    public String getCanzhuoPhoto() {
        return canzhuoPhoto;
    }


    /**
	 * 获取：餐桌图片
	 */

    public void setCanzhuoPhoto(String canzhuoPhoto) {
        this.canzhuoPhoto = canzhuoPhoto;
    }
    /**
	 * 设置：餐桌位置
	 */
    public String getCanzhuoAddress() {
        return canzhuoAddress;
    }


    /**
	 * 获取：餐桌位置
	 */

    public void setCanzhuoAddress(String canzhuoAddress) {
        this.canzhuoAddress = canzhuoAddress;
    }
    /**
	 * 设置：是否使用
	 */
    public Integer getShiyongTypes() {
        return shiyongTypes;
    }


    /**
	 * 获取：是否使用
	 */

    public void setShiyongTypes(Integer shiyongTypes) {
        this.shiyongTypes = shiyongTypes;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Canzhuo{" +
            "id=" + id +
            ", canzhuoName=" + canzhuoName +
            ", canzhuoPhoto=" + canzhuoPhoto +
            ", canzhuoAddress=" + canzhuoAddress +
            ", shiyongTypes=" + shiyongTypes +
            ", shangxiaTypes=" + shangxiaTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
