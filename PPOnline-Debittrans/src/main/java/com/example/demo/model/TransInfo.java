package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

public class TransInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -811257401277379656L;
	/*交易源账号*/
	private String srcAccountNo;
	
	/*交易目的账号*/
	private String destAccountNo;
	
	/*交易金额*/
	private BigDecimal amount;
	
	/*币种*/
	private Currency currency;
	
	/*发生时间*/
	private String transTime;
	
	/*fluxnexId*/
	private String fluxnetId;
	
	public String getSrcAccountNo()
	{
		return srcAccountNo;
	}
	public void setSrcAccountNo(String srcAccountNo)
	{
		this.srcAccountNo = srcAccountNo;
	}
	public String getDestAccountNo()
	{
		return destAccountNo;
	}
	public void setDestAccountNo(String destAccountNo)
	{
		this.destAccountNo = destAccountNo;
	}
	public BigDecimal getAmount()
	{
		return amount;
	}
	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
	public Currency getCurrency()
	{
		return currency;
	}
	public void setCurrency(Currency currency)
	{
		this.currency = currency;
	}
	public String getTransTime()
	{
		return transTime;
	}
	public void setTransTime(String transTime)
	{
		this.transTime = transTime;
	}
	public String getFluxnetId()
	{
		return fluxnetId;
	}
	public void setFluxnetId(String fluxnetId)
	{
		this.fluxnetId = fluxnetId;
	}
	
	
}
