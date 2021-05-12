package ders4_odev3.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ders4_odev3.abstracts.BaseUserManager;
import ders4_odev3.abstracts.UserCheckService;
import ders4_odev3.entities.User;
import ders4_odev3.utils.ServiceUtils;
import ders4_odev3.utils.result.Result;

public class PlayerManager extends BaseUserManager {
	private UserCheckService userCheckService;
	
	public PlayerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		Result result = ServiceUtils.runChecks(
				userCheckService.checkIsRealUser(user)
				);
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		super.add(user);
	}
	
	@Override
	public void addBulk(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public List<User> get(Predicate<User> predicate){
		List<User> list = new ArrayList<User>();
		User user = new User(1, "111");
		list.add(user);
		return list.stream().filter(predicate).collect(Collectors.toList());
	}

}
