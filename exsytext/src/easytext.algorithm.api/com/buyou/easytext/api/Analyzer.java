package com.buyou.easytext.api;

import java.util.List;

public interface Analyzer {

	String getName();

	double analyze(List<List<String>> text);	
}
