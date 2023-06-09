package com.lec.skyticket.dto;

import java.sql.Timestamp;

public class MTicketDto {
	private int rvnum;
	private String atid;
	private String mid;
	private String mkname;
	private int mtseat;
	private String mtservice;
	private String actname;
	private String dctname;
	private int plnum;
	private String atprice;
	private Timestamp atatime;
	private Timestamp atdtime;
	private String actcode;
	private String dctcode;
	private String plcom;
	private String plcomcode;
	private String plname;
	private int    plseat;
	
	public MTicketDto() {}
	public MTicketDto(int rvnum, String atid, String mid, String mkname, int mtseat, String mtservice, String actname, String dctname,
			int plnum, String atprice, Timestamp atatime, Timestamp atdtime, String actcode,
			String dctcode, String plcom, String plcomcode, String plname, int plseat) {
		this.rvnum = rvnum;
		this.atid = atid;
		this.mid = mid;
		this.mkname = mkname;
		this.mtseat = mtseat;
		this.mtservice = mtservice;
		this.actname = actname;
		this.dctname = dctname;
		this.plnum = plnum;
		this.atprice = atprice;
		this.atatime = atatime;
		this.atdtime = atdtime;
		this.actcode = actcode;
		this.dctcode = dctcode;
		this.plcom = plcom;
		this.plcomcode = plcomcode;
		this.plname = plname;
		this.plseat = plseat;
	}
	public MTicketDto(int rvnum, String atid, String mid, int mtseat, String mtservice, String actname, String dctname, 
			String atprice, Timestamp atatime, Timestamp atdtime) {
		super();
		this.rvnum = rvnum;
		this.atid = atid;
		this.mid = mid;
		this.mtseat = mtseat;
		this.mtservice = mtservice;
		this.actname = actname;
		this.dctname = dctname;
		this.atprice = atprice;
		this.atatime = atatime;
		this.atdtime = atdtime;
	}		
	public MTicketDto(int rvnum, String atid, String mid, int mtseat, String mtservice) {
		super();
		this.rvnum = rvnum;
		this.atid = atid;
		this.mid = mid;
		this.mtseat = mtseat;
		this.mtservice = mtservice;
	}
	@Override
	public String toString() {
		return "MTicketDto [rvnum=" + rvnum + ", atid=" + atid + ", mid=" + mid + ", mkname=" + mkname + ", mtseat="
				+ mtseat + ", mtservice=" + mtservice + ", actname=" + actname + ", dctname=" + dctname + ", plnum="
				+ plnum + ", atprice=" + atprice + ", atatime=" + atatime + ", atdtime=" + atdtime + ", actcode="
				+ actcode + ", dctcode=" + dctcode + ", plcom=" + plcom + ", plcomcode=" + plcomcode + ", plname="
				+ plname + ", plseat=" + plseat + "]";
	}
	public String getMkname() {
		return mkname;
	}
	public void setMkname(String mkname) {
		this.mkname = mkname;
	}
	public int getRvnum() {
		return rvnum;
	}
	public void setRvnum(int rvnum) {
		this.rvnum = rvnum;
	}
	public String getAtid() {
		return atid;
	}
	public void setAtid(String atid) {
		this.atid = atid;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public int getMtseat() {
		return mtseat;
	}
	public void setMtseat(int mtseat) {
		this.mtseat = mtseat;
	}
	public String getMtservice() {
		return mtservice;
	}
	public void setMtservice(String mtservice) {
		this.mtservice = mtservice;
	}
	public String getActname() {
		return actname;
	}
	public void setActname(String actname) {
		this.actname = actname;
	}
	public String getDctname() {
		return dctname;
	}
	public void setDctname(String dctname) {
		this.dctname = dctname;
	}
	public int getPlnum() {
		return plnum;
	}
	public void setPlnum(int plnum) {
		this.plnum = plnum;
	}
	public String getAtprice() {
		return atprice;
	}
	public void setAtprice(String atprice) {
		this.atprice = atprice;
	}
	public Timestamp getAtatime() {
		return atatime;
	}
	public void setAtatime(Timestamp atatime) {
		this.atatime = atatime;
	}
	public Timestamp getAtdtime() {
		return atdtime;
	}
	public void setAtdtime(Timestamp atdtime) {
		this.atdtime = atdtime;
	}
	public String getActcode() {
		return actcode;
	}
	public void setActcode(String actcode) {
		this.actcode = actcode;
	}
	public String getDctcode() {
		return dctcode;
	}
	public void setDctcode(String dctcode) {
		this.dctcode = dctcode;
	}
	public String getPlcom() {
		return plcom;
	}
	public void setPlcom(String plcom) {
		this.plcom = plcom;
	}
	public String getPlcomcode() {
		return plcomcode;
	}
	public void setPlcomcode(String plcomcode) {
		this.plcomcode = plcomcode;
	}
	public String getPlname() {
		return plname;
	}
	public void setPlname(String plname) {
		this.plname = plname;
	}
	public int getPlseat() {
		return plseat;
	}
	public void setPlseat(int plseat) {
		this.plseat = plseat;
	}
	
}
