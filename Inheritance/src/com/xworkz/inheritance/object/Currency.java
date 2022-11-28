package com.xworkz.inheritance.object;

public class Currency 
{
	private String code;
	private String unit;
	private String source;
	private String bank;
	private String coinShape;
	private int  firstMinting;
	private String noteColor;
	private String waterMark;
	private double dateOfIssue;
	private String circulation;
	
	public Currency()
	{
		System.out.println("details of the currency");
	}

	public Currency(String code, String unit, String source, String bank, String coinShape, int firstMinting,
			String noteColor, String waterMark, double dateOfIssue, String circulation) {
		super();
		this.code = code;
		this.unit = unit;
		this.source = source;
		this.bank = bank;
		this.coinShape = coinShape;
		this.firstMinting = firstMinting;
		this.noteColor = noteColor;
		this.waterMark = waterMark;
		this.dateOfIssue = dateOfIssue;
		this.circulation = circulation;
	}
	@Override
	public boolean equals(Object object) 
	{
		if(object instanceof Currency)
		{
			Currency currency=(Currency)object;
			if(this.bank.equals(currency.bank) && this.code.equals(currency.code) && this.dateOfIssue==currency.dateOfIssue
					&& this.noteColor.equals(currency.noteColor) && this.coinShape.equals(currency.coinShape))
			{
				System.out.println("reverse bank of india is given a coins");
				return true;
			}
			else
			{
				System.out.println("It is duplicate coins");
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() 
	{
		return "Currency [code=" + code + ", unit=" + unit + ", source=" + source + ", bank=" + bank + ", coinShape="
				+ coinShape + ", firstMinting=" + firstMinting + ", noteColor=" + noteColor + ", waterMark=" + waterMark
				+ ", dateOfIssue=" + dateOfIssue + ", circulation=" + circulation + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCoinShape() {
		return coinShape;
	}

	public void setCoinShape(String coinShape) {
		this.coinShape = coinShape;
	}

	public int getFirstMinting() {
		return firstMinting;
	}

	public void setFirstMinting(int firstMinting) {
		this.firstMinting = firstMinting;
	}

	public String getNoteColor() {
		return noteColor;
	}

	public void setNoteColor(String noteColor) {
		this.noteColor = noteColor;
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	public double getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(double dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getCirculation() {
		return circulation;
	}

	public void setCirculation(String circulation) {
		this.circulation = circulation;
	}
	
	
	
	
	
}
