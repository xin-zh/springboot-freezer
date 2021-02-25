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
public class Shopcart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户序列号
     */
    private String customerName;

    /**
     * 代销商品批次号
     */
    private String productNo;

    /**
     * 代销商品名称
     */
    private String productName;

    /**
     * 代销商品单价
     */
    private BigDecimal unitPrice;

    /**
     * 加购商品数量
     */
    private Integer cnt;

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

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
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
        return "Shopcart{" +
        "customerName=" + customerName +
        ", productNo=" + productNo +
        ", productName=" + productName +
        ", unitPrice=" + unitPrice +
        ", cnt=" + cnt +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
