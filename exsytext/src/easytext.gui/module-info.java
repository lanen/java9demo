module easytext.gui {
	requires easytext.algorithm.api;
	
	
	requires javafx.graphics;
	requires javafx.controls;
	exports com.buyou.easytext.gui to javafx.graphics;
	uses com.buyou.easytext.api.Analyzer;
}
