module easytext.algorithm.coleman {
	requires easytext.algorithm.api;
	
	provides com.buyou.easytext.api.Analyzer 
		with com.buyou.easytext.coleman.ColemanAnalyzer;
}
