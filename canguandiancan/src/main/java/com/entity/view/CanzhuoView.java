package com.entity.view;

import com.entity.CanzhuoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 餐桌
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("canzhuo")
public class CanzhuoView extends CanzhuoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 是否使用的值
		*/
		private String shiyongValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public CanzhuoView() {

	}

	public CanzhuoView(CanzhuoEntity canzhuoEntity) {
		try {
			BeanUtils.copyProperties(this, canzhuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否使用的值
			*/
			public String getShiyongValue() {
				return shiyongValue;
			}
			/**
			* 设置： 是否使用的值
			*/
			public void setShiyongValue(String shiyongValue) {
				this.shiyongValue = shiyongValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}












}
