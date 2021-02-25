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
public class Outbound implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 出库序列号
     */
    private String outboundNo;

    /**
     * 用户序列号
     */
    private String customerName;

    /**
     * 用户联系方式
     */
    private String customerTel;

    /**
     * 出库状态：0已预约 1已受理 2已出库
     */
    private Integer status;

    /**
     * 扩展信息
     */
    private String extInfo;

    /**
     * 是否邮寄：0否 1是
     */
    private Integer isMail;

    /**
     * 处理人员
     */
    private String operator;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public String getOutboundNo() {
        return outboundNo;
    }

    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Integer getIsMail() {
        return isMail;
    }

    public void setIsMail(Integer isMail) {
        this.isMail = isMail;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
        return "Outbound{" +
        "outboundNo=" + outboundNo +
        ", customerName=" + customerName +
        ", customerTel=" + customerTel +
        ", status=" + status +
        ", extInfo=" + extInfo +
        ", isMail=" + isMail +
        ", operator=" + operator +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
