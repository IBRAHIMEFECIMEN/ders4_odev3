package ders4_odev3.concretes;

import java.util.ArrayList;

import ders4_odev3.abstracts.CampaignService;
import ders4_odev3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " created.");		
	}

	@Override
	public void addBulk(Campaign[] entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " updated.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " deleted.");				
	}

	@Override
	public ArrayList<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}