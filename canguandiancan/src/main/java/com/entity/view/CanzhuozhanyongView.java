package com.entity.view;

import com.entity.CanzhuozhanyongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 餐桌占用
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("canzhuozhanyong")
public class CanzhuozhanyongView extends CanzhuozhanyongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 餐桌状态的值
		*/
		private String canzhuozhanyongValue;



		//级联表 canzhuo
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
				* 是否使用的值
				*/
				private String shiyongValue;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 总积分
			*/
			private Double yonghuSumJifen;
			/**
			* 现积分
			*/
			private Double yonghuNewJifen;
			/**
			* 会员等级
			*/
			private Integer huiyuandengjiTypes;
				/**
				* 会员等级的值
				*/
				private String huiyuandengjiValue;

	public CanzhuozhanyongView() {

	}

	public CanzhuozhanyongView(CanzhuozhanyongEntity canzhuozhanyongEntity) {
		try {
			BeanUtils.copyProperties(this, canzhuozhanyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 餐桌状态的值
			*/
			public String getCanzhuozhanyongValue() {
				return canzhuozhanyongValue;
			}
			/**
			* 设置： 餐桌状态的值
			*/
			public void setCanzhuozhanyongValue(String canzhuozhanyongValue) {
				this.canzhuozhanyongValue = canzhuozhanyongValue;
			}
















				//级联表的get和set canzhuo
					/**
					* 获取： 餐桌名称
					*/
					public String getCanzhuoName() {
						return canzhuoName;
					}
					/**
					* 设置： 餐桌名称
					*/
					public void setCanzhuoName(String canzhuoName) {
						this.canzhuoName = canzhuoName;
					}
					/**
					* 获取： 餐桌图片
					*/
					public String getCanzhuoPhoto() {
						return canzhuoPhoto;
					}
					/**
					* 设置： 餐桌图片
					*/
					public void setCanzhuoPhoto(String canzhuoPhoto) {
						this.canzhuoPhoto = canzhuoPhoto;
					}
					/**
					* 获取： 餐桌位置
					*/
					public String getCanzhuoAddress() {
						return canzhuoAddress;
					}
					/**
					* 设置： 餐桌位置
					*/
					public void setCanzhuoAddress(String canzhuoAddress) {
						this.canzhuoAddress = canzhuoAddress;
					}
					/**
					* 获取： 是否使用
					*/
					public Integer getShiyongTypes() {
						return shiyongTypes;
					}
					/**
					* 设置： 是否使用
					*/
					public void setShiyongTypes(Integer shiyongTypes) {
						this.shiyongTypes = shiyongTypes;
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
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 总积分
					*/
					public Double getYonghuSumJifen() {
						return yonghuSumJifen;
					}
					/**
					* 设置： 总积分
					*/
					public void setYonghuSumJifen(Double yonghuSumJifen) {
						this.yonghuSumJifen = yonghuSumJifen;
					}
					/**
					* 获取： 现积分
					*/
					public Double getYonghuNewJifen() {
						return yonghuNewJifen;
					}
					/**
					* 设置： 现积分
					*/
					public void setYonghuNewJifen(Double yonghuNewJifen) {
						this.yonghuNewJifen = yonghuNewJifen;
					}
					/**
					* 获取： 会员等级
					*/
					public Integer getHuiyuandengjiTypes() {
						return huiyuandengjiTypes;
					}
					/**
					* 设置： 会员等级
					*/
					public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
						this.huiyuandengjiTypes = huiyuandengjiTypes;
					}


						/**
						* 获取： 会员等级的值
						*/
						public String getHuiyuandengjiValue() {
							return huiyuandengjiValue;
						}
						/**
						* 设置： 会员等级的值
						*/
						public void setHuiyuandengjiValue(String huiyuandengjiValue) {
							this.huiyuandengjiValue = huiyuandengjiValue;
						}



}
