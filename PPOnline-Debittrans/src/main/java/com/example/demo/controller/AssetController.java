package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.facade.AssetTools;
import com.example.demo.model.TransInfo;
@RestController
@RequestMapping("/asset")
public class AssetController
{
	@Autowired
	private AssetTools assetTools;
	
	@RequestMapping(value="/credit",method ={RequestMethod.GET, RequestMethod.POST})
	public Boolean credit(/*@RequestBody TransInfo transInfo*/){
		System.out.println("123456");
		return Boolean.TRUE;
	}
	@RequestMapping(value="/debit",method ={RequestMethod.GET, RequestMethod.POST})
	public Boolean debit(@RequestBody TransInfo transInfo){
		return null;
	}
}
