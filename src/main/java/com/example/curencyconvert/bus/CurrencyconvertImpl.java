package com.example.curencyconvert.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;

import com.example.currencyconvert.model.*;


public class CurrencyconvertImpl {
	private Map<String, ArrayList> rateexchangeMap = new HashMap<>();
	private ArrayList<Exchange> list;
	
	public CurrencyconvertImpl() {
		Exchange currencyNewZealand0 = new Exchange( "AUD", 0.948596);
		Exchange currencyNewZealand1 = new Exchange( "CAD", 0.918707);
		Exchange currencyNewZealand2 = new Exchange( "RUB",46.2726);
		
		list = new ArrayList<>();
		list.add(currencyNewZealand0);
		list.add(currencyNewZealand1);
		list.add(currencyNewZealand2);
		rateexchangeMap.put("NZD", list);
		
		Exchange currencyBrazil0= new Exchange( "AUD", 0.356163);
		Exchange currencyBrazil1 = new Exchange( "INR", 18.3160);
		Exchange currencyBrazil2 = new Exchange( "UYU", 8.40064);
		
		list = new ArrayList<>();
		list.add(currencyBrazil0);
		list.add(currencyBrazil1);
		list.add(currencyBrazil2);
		rateexchangeMap.put("BRL", list);
		
		Exchange currencyBritish0= new Exchange( "AUD", 1.73986);
		Exchange currencyBritish1 = new Exchange( "IQD", 1519.34);
		Exchange currencyBritish2 = new Exchange( "KRW", 1413.68);
		
		list = new ArrayList<>();
		list.add(currencyBritish0);
		list.add(currencyBritish1);
		list.add(currencyBritish2);
		rateexchangeMap.put("GBP", list);
		
		
	}
	
	public ArrayList getExchangeResult (String denomination) {
		return rateexchangeMap.get(denomination);
	}


}
