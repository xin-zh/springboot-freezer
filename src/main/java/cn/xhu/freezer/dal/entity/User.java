package cn.xhu.freezer.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zx
 * @since 2021-02-25
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 员工密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别：1男 2女 3保密
     */
    private Integer sex;

    /**
     * 员工家庭住址
     */
    private String address;

    /**
     * 员工证件信息
     */
    private String identify;

    /**
     * 员工电话
     */
    private String userTel;

    /**
     * 员工邮箱
     */
    private String email;

    /**
     * 是否删除：0未删除 1删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
        "userName=" + userName +
        ", password=" + password +
        ", realName=" + realName +
        ", sex=" + sex +
        ", address=" + address +
        ", identify=" + identify +
        ", userTel=" + userTel +
        ", email=" + email +
        ", isDelete=" + isDelete +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
