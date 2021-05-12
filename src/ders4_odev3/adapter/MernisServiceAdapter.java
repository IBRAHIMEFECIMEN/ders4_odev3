package ders4_odev3.adapter;

import java.rmi.RemoteException;
import java.time.ZoneId;
import java.util.Date;

import ders4_odev3.abstracts.IdentityValidationService;
import ders4_odev3.utils.result.ErrorResult;
import ders4_odev3.utils.result.Result;
import ders4_odev3.utils.result.SuccessResult;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IdentityValidationService{
	
	@Override
	public Result CheckIfRealPerson(Long identityNumber, String firstName, String lastName, int birthYear) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					identityNumber,
					firstName.toUpperCase(),
					lastName.toUpperCase(), 
					birthYear
					);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if(result) {
			return new SuccessResult();
		}else {
			return new ErrorResult(firstName.toUpperCase() + " " + lastName.toUpperCase() + " : Kimlik doðrulama baþarýsýz.");
		}
			
	}
	
	/*
	 * For a `String` identityNumber
	 * */
	@Override
	public Result CheckIfRealPerson(String identityNumber, String firstName, String lastName, Date birthDate) {
		return this.CheckIfRealPerson(
				Long.parseLong(identityNumber), 
				firstName, 
				lastName, 
				birthDate
				);
	}	
	/*
	 * For a `Date` birthDate
	 * */
	@Override
	public Result CheckIfRealPerson(Long identityNumber, String firstName, String lastName, Date birthDate) {
		return this.CheckIfRealPerson(
				identityNumber, 
				firstName, 
				lastName, 
				birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				);
	}


}