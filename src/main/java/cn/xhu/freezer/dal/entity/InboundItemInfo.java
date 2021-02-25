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
public class InboundItemInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 入库编号
     */
    private String inboundNo;

    /**
     * item项名称
     */
    private String itemName;

    /**
     * 入库数量
     */
    private Integer inboundNum;

    /**
     * 库存量
     */
    private Integer inventory;

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getInboundNum() {
        return inboundNum;
    }

    public void setInboundNum(Integer inboundNum) {
        this.inboundNum = inboundNum;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
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
        return "InboundItemInfo{" +
        "inboundNo=" + inboundNo +
        ", itemName=" + itemName +
        ", inboundNum=" + inboundNum +
        ", inventory=" + inventory +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
