package com.ways.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="user" )
public class User {
    /**
     * 主键，用户id
     */
    private String userId;
    
    private String userCode ;
    /**
     * 用户类型
     */
    private String userType;
    /**
     * 姓名
     */
    private String name;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 电话
     */
    private String phone;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 地址
     */
    private String address;
    /**
     * 性别
     */
    private String sex;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 部门id
     */
    private String deptId;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 1:在职，2:离职，3:停职，4：其他
     */
    private String userStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人id
     */
    private String createId;
    /**
     * 创建人姓名
     */
    private String createName;
    /**
     * 更新人id
     */
    private String updateId;
    /**
     * 更新人姓名
     */
    private String updateName;
    /**
     * 更新时间
     */
    private Date updateTime;
   
    private String status;

    private String udf1;

    private String udf2;

    private String udf3;

    private String udf4;

    private String udf5;
    
    @Id
	@Column(name = "user_id", nullable = false, unique = true)
	@GenericGenerator(name = "userId", strategy = "uuid")
	@GeneratedValue(generator="userId")
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Column(name="user_code")
    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    @Column(name="user_type")
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Column(name="birthday")
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Column(name="phone")
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Column(name="mobile")
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @Column(name="address")
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Column(name="sex")
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Column(name="dept_name")
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    @Column(name="dept_id")
    public String getDeptId() {
        return deptId;
    }
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    @Column(name="role_id")
    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    @Column(name="role_name")
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @Column(name="user_status")
    public String getUserStatus() {
        return userStatus;
    }
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    @Column(name="create_time")
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Column(name="create_id")
    public String getCreateId() {
        return createId;
    }
    public void setCreateId(String createId) {
        this.createId = createId;
    }
    @Column(name="create_name")
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    @Column(name="update_id")
    public String getUpdateId() {
        return updateId;
    }
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }
    @Column(name="update_name")
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
    @Column(name="update_time")
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Column(name="status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Column(name="udf_1")
    public String getUdf1() {
        return udf1;
    }
    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }
    @Column(name="udf_2")
    public String getUdf2() {
        return udf2;
    }
    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }
    @Column(name="udf_3")
    public String getUdf3() {
        return udf3;
    }
    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }
    @Column(name="udf_4")
    public String getUdf4() {
        return udf4;
    }
    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }
    @Column(name="udf_5")
    public String getUdf5() {
        return udf5;
    }
    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

}