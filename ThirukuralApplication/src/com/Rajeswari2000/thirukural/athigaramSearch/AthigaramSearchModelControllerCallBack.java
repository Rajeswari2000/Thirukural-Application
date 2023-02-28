package com.Rajeswari2000.thirukural.athigaramSearch;

import java.util.List;

import com.Rajeswari2000.thirukural.dto.Thirukural;

public interface AthigaramSearchModelControllerCallBack {

	void processFailure();

	void kuralAthigaramList(List<Thirukural> tenThirukural, List list);



}
