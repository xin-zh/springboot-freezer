package cn.xhu.freezer.dal.entity;

import java.math.BigDecimal;
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
public class Inbound implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 入库序列号
     */
    private String inboundNo;

    /**
     * 用户名
     */
    private String customerName;

    /**
     * 用户联系方式
     */
    private String customerTel;

    /**
     * 处理人员（员工）
     */
    private String operator;

    /**
     * 入库状态：0已预约 1已受理 2库存中 3全出库
     */
    private Integer status;

    /**
     * 扩展信息
     */
    private String extInfo;

    /**
     * 实付款
     */
    private BigDecimal actualPay;

    /**
     * 应付款
     */
    private BigDecimal shouldPay;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public String getInboundNo() {
        return inboundNo;
    }

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public BigDecimal getActualPay() {
        return actualPay;
    }

    public void setActualPay(BigDecimal actualPay) {
        this.actualPay = actualPay;
    }

    public BigDecimal getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(BigDecimal shouldPay) {
        this.shouldPay = shouldPay;
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
        return "Inbound{" +
        "inboundNo=" + inboundNo +
        ", customerName=" + customerName +
        ", customerTel=" + customerTel +
        ", operator=" + operator +
        ", status=" + status +
        ", extInfo=" + extInfo +
        ", actualPay=" + actualPay +
        ", shouldPay=" + shouldPay +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
