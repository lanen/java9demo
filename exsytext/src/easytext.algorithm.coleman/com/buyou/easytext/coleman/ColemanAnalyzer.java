package com.buyou.easytext.coleman;

import com.buyou.easytext.api.Analyzer;
import java.util.List;

public class ColemanAnalyzer implements Analyzer {

	public String getName(){
		return "Coleman-Liau";
	}

	public double analyze(List<List<String>> sentences) {
      float totalsentences = sentences.size();
      float words = sentences.stream().mapToInt(sentence -> sentence.size()).sum();
      float letters = sentences.stream().flatMapToInt(sentence -> sentence.stream().mapToInt(word -> word.length())).sum();

      return 0.0588 * (letters / (words / 100)) - 0.296 * (totalsentences / (words / 100)) - 15.8;
	}
}
