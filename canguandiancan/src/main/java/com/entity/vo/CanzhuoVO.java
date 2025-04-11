package com.entity.vo;

import com.entity.CanzhuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 餐桌
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("canzhuo")
public class CanzhuoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
