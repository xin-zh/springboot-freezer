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
public class Refund implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户序列号
     */
    private String customerName;

    /**
     * 订单序列号
     */
    private String orderNo;

    /**
     * 提退款原因
     */
    private String refundReason;

    /**
     * 退款到账时间
     */
    private LocalDateTime refundTime;

    /**
     * 退款状态：1已受理 0未受理
     */
    private Integer status;

    /**
     * 退款发起时间
     */
    private LocalDateTime createTime;

    /**
     * 退款处理时间
     */
    private LocalDateTime updateTime;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public LocalDateTime getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(LocalDateTime refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "Refund{" +
        "customerName=" + customerName +
        ", orderNo=" + orderNo +
        ", refundReason=" + refundReason +
        ", refundTime=" + refundTime +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
