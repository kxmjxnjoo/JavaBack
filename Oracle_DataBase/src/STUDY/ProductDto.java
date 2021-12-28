package STUDY;

import java.sql.Date;

public class ProductDto {
	private int num;
	private String name;
	private Date makeyear;
	private int inpri;
	private int sellpri;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getMakeyear() {
		return makeyear;
	}
	public void setMakeyear(Date makeyear) {
		this.makeyear = makeyear;
	}
	public int getInpri() {
		return inpri;
	}
	public void setInpri(int inpri) {
		this.inpri = inpri;
	}
	public int getSellpri() {
		return sellpri;
	}
	public void setSellpri(int sellpri) {
		this.sellpri = sellpri;
	}
}