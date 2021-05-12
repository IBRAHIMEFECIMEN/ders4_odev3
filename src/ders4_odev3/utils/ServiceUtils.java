package ders4_odev3.utils;

import ders4_odev3.utils.result.Result;
import ders4_odev3.utils.result.SuccessResult;

public class ServiceUtils {
	public static Result runChecks(Result... results) {
		for (Result result : results) {
			if(!result.isSuccess()) {
				return result;
			}
		}
		return new SuccessResult();
	}

}