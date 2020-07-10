package org.sample.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.sample.web.domain.LangugageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	List<LangugageModel> data = new ArrayList<LangugageModel>();

	MainController() {
		// init data for testing
		data.add(new LangugageModel(1, "ruby"));
		data.add(new LangugageModel(2, "rails"));
		data.add(new LangugageModel(3, "c / c++"));
		data.add(new LangugageModel(4, ".net"));
		data.add(new LangugageModel(5, "python"));
		data.add(new LangugageModel(6, "java"));
		data.add(new LangugageModel(7, "javascript"));
		data.add(new LangugageModel(8, "c#"));
		data.add(new LangugageModel(9, "scala"));
		data.add(new LangugageModel(10, "matlab"));
		data.add(new LangugageModel(11, "r software"));
		data.add(new LangugageModel(12, "f#"));
		data.add(new LangugageModel(13, "html"));
		data.add(new LangugageModel(14, "node.js"));
		data.add(new LangugageModel(15, "sqlite3"));
		data.add(new LangugageModel(16, "SQL"));

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getPages() {

		ModelAndView model = new ModelAndView("example");
		return model;

	}

	@RequestMapping(value = "/getTags", method = RequestMethod.GET)
	public @ResponseBody
	List<LangugageModel> getTags(@RequestParam String tagName) {

		return simulateSearchResult(tagName);

	}

	private List<LangugageModel> simulateSearchResult(String tagName) {

		List<LangugageModel> result = new ArrayList<LangugageModel>();

		// iterate a list and filter by tagName
		for (LangugageModel tag : data) {
			if (tag.getTagName().contains(tagName)) {
				result.add(tag);
			}
		}

		return result;
	}

}
