package ders4_odev3.abstracts;

import ders4_odev3.entities.User;
import ders4_odev3.utils.result.Result;

public interface UserCheckService {
	public Result checkIsRealUser(User user);

}
