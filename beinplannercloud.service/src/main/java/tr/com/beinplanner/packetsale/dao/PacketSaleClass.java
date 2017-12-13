package tr.com.beinplanner.packetsale.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Qualifier;

import com.fasterxml.jackson.annotation.JsonTypeName;

import tr.com.beinplanner.packetpayment.dao.PacketPaymentClass;
import tr.com.beinplanner.user.dao.User;
@Entity
@Table(name="packet_sale_class")
@Qualifier("packetSaleClass")
@JsonTypeName("psc")
public class PacketSaleClass extends PacketSaleFactory  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SALE_ID")
	private long 	saleId;
	
	@Column(name="USER_ID")
	private long 	userId;
	
	@Column(name="PROG_ID")
	private int 		progId;
	
	
	@Column(name="SALE_STATU")
	private int 		saleStatu;
	
	@Column(name="SALES_COMMENT")
	private String 	salesComment;
	
	@Column(name="PACKET_PRICE")
	private double 	packetPrice;
	
	@Transient
	private double 	leftPrice;
	
	@Column(name="SALES_DATE")
	private Date 	salesDate;
	
	@Transient
	private String 	salesDateStr;
	
	@Column(name="CHANGE_DATE")
	private Date 	changeDate;
	
	
	@Transient
	private String 	changeDateStr;
	
	@Column(name="STAFF_ID")
	private long 	staffId;
	
	@Column(name="PROG_COUNT")
	private int 	progCount;
	
	@Column(name="BONUS_PAYED_FLAG")
	private int 	bonusPayedFlag;
	
	
	@Transient
	private User user;
	
	@Transient
	private PacketPaymentClass packetPaymentClass;

	
	
	
	public int getProgCount() {
		return progCount;
	}

	public void setProgCount(int progCount) {
		this.progCount = progCount;
	}

	public int getBonusPayedFlag() {
		return bonusPayedFlag;
	}

	public void setBonusPayedFlag(int bonusPayedFlag) {
		this.bonusPayedFlag = bonusPayedFlag;
	}

	
	public long getSaleId() {
		return saleId;
	}

	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getProgId() {
		return progId;
	}

	public void setProgId(int progId) {
		this.progId = progId;
	}

	public int getSaleStatu() {
		return saleStatu;
	}

	public void setSaleStatu(int saleStatu) {
		this.saleStatu = saleStatu;
	}

	public String getSalesComment() {
		return salesComment;
	}

	public void setSalesComment(String salesComment) {
		this.salesComment = salesComment;
	}

	public double getPacketPrice() {
		return packetPrice;
	}

	public void setPacketPrice(double packetPrice) {
		this.packetPrice = packetPrice;
	}

	public double getLeftPrice() {
		return leftPrice;
	}

	public void setLeftPrice(double leftPrice) {
		this.leftPrice = leftPrice;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public String getSalesDateStr() {
		return salesDateStr;
	}

	public void setSalesDateStr(String salesDateStr) {
		this.salesDateStr = salesDateStr;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangeDateStr() {
		return changeDateStr;
	}

	public void setChangeDateStr(String changeDateStr) {
		this.changeDateStr = changeDateStr;
	}

	public long getStaffId() {
		return staffId;
	}

	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PacketPaymentClass getPacketPaymentClass() {
		return packetPaymentClass;
	}

	public void setPacketPaymentClass(PacketPaymentClass packetPaymentClass) {
		this.packetPaymentClass = packetPaymentClass;
	}
	
	
	
}
