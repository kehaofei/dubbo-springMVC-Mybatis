package com.semioe.api.entity;

import java.io.Serializable;
import java.util.Date;

public class UserMessage implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_message.id
	 * @mbg.generated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_message.manager_id
	 * @mbg.generated
	 */
	private Integer managerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_message.address
	 * @mbg.generated
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_message.real_name
	 * @mbg.generated
	 */
	private String realName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_message.create_time
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_message.update_time
	 * @mbg.generated
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_message.id
	 * @return  the value of user_message.id
	 * @mbg.generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_message.id
	 * @param id  the value for user_message.id
	 * @mbg.generated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_message.manager_id
	 * @return  the value of user_message.manager_id
	 * @mbg.generated
	 */
	public Integer getManagerId() {
		return managerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_message.manager_id
	 * @param managerId  the value for user_message.manager_id
	 * @mbg.generated
	 */
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_message.address
	 * @return  the value of user_message.address
	 * @mbg.generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_message.address
	 * @param address  the value for user_message.address
	 * @mbg.generated
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_message.real_name
	 * @return  the value of user_message.real_name
	 * @mbg.generated
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_message.real_name
	 * @param realName  the value for user_message.real_name
	 * @mbg.generated
	 */
	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_message.create_time
	 * @return  the value of user_message.create_time
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_message.create_time
	 * @param createTime  the value for user_message.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_message.update_time
	 * @return  the value of user_message.update_time
	 * @mbg.generated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_message.update_time
	 * @param updateTime  the value for user_message.update_time
	 * @mbg.generated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_message
	 * @mbg.generated
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		UserMessage other = (UserMessage) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getManagerId() == null ? other.getManagerId() == null
						: this.getManagerId().equals(other.getManagerId()))
				&& (this.getAddress() == null ? other.getAddress() == null
						: this.getAddress().equals(other.getAddress()))
				&& (this.getRealName() == null ? other.getRealName() == null
						: this.getRealName().equals(other.getRealName()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_message
	 * @mbg.generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
		result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
		result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_message
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", managerId=").append(managerId);
		sb.append(", address=").append(address);
		sb.append(", realName=").append(realName);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}