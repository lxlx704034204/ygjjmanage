package com.sh.manage.entity;

// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TOaGiffgaff entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_oa_giffgaff"
)

public class TOaGiffgaff  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1834934215694604308L;
	private Integer id;
     private String buyDate;
     private String packDate;
     private String masterCard;
     private String sliverCard;
     private String username;
     private String terminalId;
     private Integer usetimeLimit;
     private double amount;
     private String taobaoId;
     private String weixinNickname;
     private String weixinCode;
     private String deliverCode;
     private String remark;
     private Integer operateId;


    // Constructors

    /** default constructor */
    public TOaGiffgaff() {
    }

    
    /** full constructor */
    public TOaGiffgaff(String buyDate, String packDate, String masterCard,String sliverCard, String username, String terminalId, Integer usetimeLimit, double amount, String taobaoId, String weixinNickname, String weixinCode, String deliverCode, String remark, Integer operateId) {
        this.buyDate = buyDate;
        this.packDate = packDate;
        this.masterCard = masterCard;
        this.sliverCard = sliverCard;
        this.username = username;
        this.terminalId = terminalId;
        this.usetimeLimit = usetimeLimit;
        this.amount = amount;
        this.taobaoId = taobaoId;
        this.weixinNickname = weixinNickname;
        this.weixinCode = weixinCode;
        this.deliverCode = deliverCode;
        this.remark = remark;
        this.operateId = operateId;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="buy_date", length=18)

    public String getBuyDate() {
        return this.buyDate;
    }
    
    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }
    
    @Column(name="pack_date", length=100)

    public String getPackDate() {
        return this.packDate;
    }
    
    public void setPackDate(String packDate) {
        this.packDate = packDate;
    }
    
    @Column(name="master_card", length=50)

    public String getMasterCard() {
        return this.masterCard;
    }
    
    public void setMasterCard(String masterCard) {
        this.masterCard = masterCard;
    }
    
    
    @Column(name="sliver_card", length=50)
    public String getSliverCard() {
		return sliverCard;
	}


	public void setSliverCard(String sliverCard) {
		this.sliverCard = sliverCard;
	}


	@Column(name="username", length=50)

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="terminal_id", length=11)

    public String getTerminalId() {
        return this.terminalId;
    }
    
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    
    @Column(name="usetime_limit")

    public Integer getUsetimeLimit() {
        return this.usetimeLimit;
    }
    
    public void setUsetimeLimit(Integer usetimeLimit) {
        this.usetimeLimit = usetimeLimit;
    }
    
    @Column(name="amount", precision=8)

    public double getAmount() {
        return this.amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Column(name="taobao_id", length=40)

    public String getTaobaoId() {
        return this.taobaoId;
    }
    
    public void setTaobaoId(String taobaoId) {
        this.taobaoId = taobaoId;
    }
    
    @Column(name="weixin_nickname", length=40)

    public String getWeixinNickname() {
        return this.weixinNickname;
    }
    
    public void setWeixinNickname(String weixinNickname) {
        this.weixinNickname = weixinNickname;
    }
    
    @Column(name="weixin_code", length=40)

    public String getWeixinCode() {
        return this.weixinCode;
    }
    
    public void setWeixinCode(String weixinCode) {
        this.weixinCode = weixinCode;
    }
    
    @Column(name="deliver_code", length=25)

    public String getDeliverCode() {
        return this.deliverCode;
    }
    
    public void setDeliverCode(String deliverCode) {
        this.deliverCode = deliverCode;
    }
    
    @Column(name="remark", length=65535)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="operate_id")

    public Integer getOperateId() {
        return this.operateId;
    }
    
    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }
   








}