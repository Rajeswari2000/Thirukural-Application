package com.Rajeswari2000.thirukural.numbersearch;
import java.io.FileReader;
import com.Rajeswari2000.thirukural.Repository.*;
import com.Rajeswari2000.thirukural.dto.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class NumberSearchModel implements NumberSearchModelCallBack{
	
	private NumberSearchModelControllerCallBack numberSearchController;
	
	public NumberSearchModel(NumberSearchModelControllerCallBack numberSearchController) {
		this.numberSearchController = numberSearchController;
	}

	
	

	
	public void getThirukural(long number, String author) {
		Thirukural thirukural =  ThirukuralRepository.getInstance().getThirukuralRepository((int)number, author);
		if(thirukural==null) numberSearchController.exception();
		else numberSearchController.displayThirukural(thirukural);
		
	}

}
