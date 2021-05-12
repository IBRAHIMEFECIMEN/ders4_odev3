package ders4_odev3.concretes;

import ders4_odev3.abstracts.BaseUserCheckManager;
import ders4_odev3.abstracts.IdentityValidationService;
import ders4_odev3.entities.Player;
import ders4_odev3.entities.User;
import ders4_odev3.utils.result.Result;

public class PlayerCheckManager extends BaseUserCheckManager {
	private IdentityValidationService identityValidationService;
	
	public PlayerCheckManager(IdentityValidationService identityValidationService){
		this.identityValidationService = identityValidationService;
	}
	
	@Override
	public Result checkIsRealUser(User user) {
		Player player = (Player)user;
		return this.identityValidationService.CheckIfRealPerson(
				player.getIdentityNumber(), 
				player.getFirstName(), 
				player.getLastName(), 
				player.getBirthDate()
				);
	}
}