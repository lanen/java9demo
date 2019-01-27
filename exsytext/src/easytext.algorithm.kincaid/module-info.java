module easytext.algorithm.kincaid {
	requires easytext.algorithm.api;

	provides com.buyou.easytext.api.Analyzer 
		with com.buyou.easytext.kincard.KincaidAnalyzer;
	uses com.buyou.easytext.api.SyllableCounter;
}
