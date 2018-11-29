package com.example.convertcur.bus;

import com.example.convertcur.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;
import com.example.convertcur.model.*;


public class ConvertcurImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Convert> list;
	
	public ConvertcurImpl() {
		Convert currencyMalaysia0= new Convert( "USD", 0.2388);
		Convert currencyMalaysia1 = new Convert( "SGD", 0.33);
		Convert currencyMalaysia2 = new Convert( "IDR",3454.78);
		
		list = new ArrayList<>();
		list.add(currencyMalaysia0);
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		currenciesMap.put("RM", list);
		
		Convert currencySingapore0= new Convert( "USD", 0.7300602);
		Convert currencySingapore1 = new Convert( "RM", 3.0569343);
		Convert currencySingapore2 = new Convert( "IDR", 10488.3741);
		
		list = new ArrayList<>();
		list.add(currencySingapore0);
		list.add(currencySingapore1);
		list.add(currencySingapore2);
		currenciesMap.put("SGD", list);
		
		Convert currencyAmerican0= new Convert( "SGD", 1.36995);
		Convert currencyAmerican1 = new Convert( "RM", 4.188);
		Convert currencyAmerican2 = new Convert( "IDR", 14370.0);
		
		list = new ArrayList<>();
		list.add(currencyAmerican0);
		list.add(currencyAmerican1);
		list.add(currencyAmerican2);
		currenciesMap.put("USD", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}
