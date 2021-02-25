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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String customerName;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 用户密码
     */
    private String customerPsw;

    /**
     * 用户性别：1男 2女 3保密
     */
    private Integer sex;

    /**
     * 年龄，最小为0 最大为150
     */
    private Integer age;

    /**
     * 身份证号（若要办理入库需要身份认证）
     */
    private String identify;

    /**
     * 用户联系方式
     */
    private String customerTel;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCustomerPsw() {
        return customerPsw;
    }

    public void setCustomerPsw(String customerPsw) {
        this.customerPsw = customerPsw;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
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
        return "Customer{" +
        "customerName=" + customerName +
        ", realName=" + realName +
        ", customerPsw=" + customerPsw +
        ", sex=" + sex +
        ", age=" + age +
        ", identify=" + identify +
        ", customerTel=" + customerTel +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
