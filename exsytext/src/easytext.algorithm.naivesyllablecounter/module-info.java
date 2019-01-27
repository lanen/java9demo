module easytext.algorithm.naivesyllablecounter {

	requires easytext.algorithm.api;

	provides com.buyou.easytext.api.SyllableCounter 
		with com.buyou.easytext.naivesyllablecounter.NaiveSyllableCounter;

}
