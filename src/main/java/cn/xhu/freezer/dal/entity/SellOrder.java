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
public class SellOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单序列号
     */
    private String orderNo;

    /**
     * 用户序列号
     */
    private String customerName;

    /**
     * 支付类型：1支付宝 2微信
     */
    private Integer payType;

    /**
     * 支付金额
     */
    private BigDecimal payMoney;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 收货时间
     */
    private LocalDateTime receiveTime;

    /**
     * 订单状态：0已取消 1待付款 2待发货 3待收货 4交易成功 5交易超时
     */
    private Integer status;

    /**
     * 是否删除：1删除 0未删除
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


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "SellOrder{" +
        "orderNo=" + orderNo +
        ", customerName=" + customerName +
        ", payType=" + payType +
        ", payMoney=" + payMoney +
        ", payTime=" + payTime +
        ", receiveTime=" + receiveTime +
        ", status=" + status +
        ", isDelete=" + isDelete +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
