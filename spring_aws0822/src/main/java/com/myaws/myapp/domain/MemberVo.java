package com.myaws.myapp.domain;

public class MemberVo {  // Vo: Value object 媛믪쓣 �떞�뒗 媛앹껜�떎 �삉�뒗 DTO �씪怨좊룄 �븳�떎. 
	private int midx;  // DB�뀒�씠釉붿뿉 �엳�뒗 而щ읆�씠由꾧낵 �룞�씪�븯寃� �옉�꽦�븳�떎. 
	private String memberid;  // 諛붿씤�뵫 湲곗닠�쓣 �궗�슜�븯湲� �쐞�빐 
	private String memberpwd; // html input name 紐낃낵 �룞�씪�븯寃� 留욎텣�떎
	private String membername;
	private String membergender;
	private String memberbirth;
	private String memberaddr;  
	private String memberphone;
	private String memberemail;
	private String memberhobby;
	private String delyn;
	private String writeday;
	private String memberip;
	
	public int getMidx() {
		return midx;
	}
	public void setMidx(int midx) {
		this.midx = midx;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpwd() {
		return memberpwd;
	}
	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMembergender() {
		return membergender;
	}
	public void setMembergender(String membergender) {
		this.membergender = membergender;
	}
	public String getMemberbirth() {
		return memberbirth;
	}
	public void setMemberbirth(String memberbirth) {
		this.memberbirth = memberbirth;
	}
	public String getMemberaddr() {
		return memberaddr;
	}
	public void setMemberaddr(String memberaddr) {
		this.memberaddr = memberaddr;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMemberhobby() {
		return memberhobby;
	}
	public void setMemberhobby(String memberhobby) {
		this.memberhobby = memberhobby;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public String getMemberip() {
		return memberip;
	}
	public void setMemberip(String memberip) {
		this.memberip = memberip;
	}
	
}
