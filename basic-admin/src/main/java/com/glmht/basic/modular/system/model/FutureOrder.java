package com.glmht.basic.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author mht
 * @since 2019-09-16
 */
@TableName("future_order")
public class FutureOrder extends Model<FutureOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单号
     */
    @TableField("order_no")
    private Long orderNo;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    @TableField("shipping_id")
    private Integer shippingId;
    /**
     * 实际付款金额，单位是元，保留两位小数
     */
    private BigDecimal payment;
    /**
     * 支付类型，1-在线支付
     */
    @TableField("payment_type")
    private Integer paymentType;
    /**
     * 运费，单位是元
     */
    private Integer postage;
    /**
     * 订单状态：0-已取消，10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    private Integer status;
    /**
     * 支付时间
     */
    @TableField("payment_time")
    private Date paymentTime;
    /**
     * 发货时间
     */
    @TableField("send_time")
    private Date sendTime;
    /**
     * 交易完成时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 交易关闭时间
     */
    @TableField("close_time")
    private Date closeTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FutureOrder{" +
        "id=" + id +
        ", orderNo=" + orderNo +
        ", userId=" + userId +
        ", shippingId=" + shippingId +
        ", payment=" + payment +
        ", paymentType=" + paymentType +
        ", postage=" + postage +
        ", status=" + status +
        ", paymentTime=" + paymentTime +
        ", sendTime=" + sendTime +
        ", endTime=" + endTime +
        ", closeTime=" + closeTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
