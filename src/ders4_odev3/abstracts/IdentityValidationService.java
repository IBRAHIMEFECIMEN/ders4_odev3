package ders4_odev3.abstracts;

import java.util.Date;

import ders4_odev3.utils.result.Result;

public interface IdentityValidationService {
	Result CheckIfRealPerson(Long identityNumber, String firstName, String lastName, int birthYear);
	Result CheckIfRealPerson(String identityNumber, String firstName, String lastName, Date birthDate);
	Result CheckIfRealPerson(Long identityNumber, String firstName, String lastName, Date birthDate);
}
