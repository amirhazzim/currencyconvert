package com.example.currencyconvert.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.curencyconvert.bus.CurrencyconvertImpl;
import com.example.currencyconvert.model.Exchange;

@WebService
public class CurrencyconvertService {
	CurrencyconvertImpl cc = new CurrencyconvertImpl();
	
	@WebMethod
	public ArrayList<Exchange> getCurrencyResult (String denomination) {
		return cc.getExchangeResult(denomination);
	}
}
