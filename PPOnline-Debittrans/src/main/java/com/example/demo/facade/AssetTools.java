package com.example.demo.facade;

import org.springframework.stereotype.Service;

import com.example.demo.model.TransInfo;


public interface AssetTools
{
	public boolean credit(TransInfo transInfo);
	public boolean debit(TransInfo transInfo);
	public boolean commit(TransInfo transInfo);
	public boolean rollback(TransInfo transInfo);
}
