package com.example.demo.facade.impl;

import org.springframework.stereotype.Service;

import com.example.demo.facade.AssetTools;
import com.example.demo.model.TransInfo;
@Service
public class AssetToolsImpl implements AssetTools
{

	@Override
	public boolean credit(TransInfo transInfo)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean debit(TransInfo transInfo)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean commit(TransInfo transInfo)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rollback(TransInfo transInfo)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
