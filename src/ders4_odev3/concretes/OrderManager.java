package ders4_odev3.concretes;

import java.util.Date;

import ders4_odev3.abstracts.CampaignService;
import ders4_odev3.abstracts.OrderService;
import ders4_odev3.abstracts.ProductService;
import ders4_odev3.abstracts.UserService;
import ders4_odev3.entities.Order;

public class OrderManager implements OrderService {
	
	private UserService userService;
	private ProductService productService;
	private CampaignService campaignService;
	
	public OrderManager(UserService userService, ProductService productService, CampaignService campaignService) {
		this.setUserService(userService);
		this.setProductService(productService);
		this.setCampaignService(campaignService);
	}

	@Override
	public void add(Date date, int userId, int productId, int campaignId, int quantity, double unitPrice) {
		
		Order order = new Order(1, date, userId, productId, campaignId, quantity, unitPrice, 0, 0);
	
		System.out.println("|orderId|date|userId|productId|campaignId|quantity|unitPrice|discountPercent|discountedPrice|");
		System.out.println("|---|---|---|---|---|---|---|---|---|");
		System.out.println(
				"|" + order.getId()
				+ "|" + order.getDate()
				+ "|" + order.getUserId()
				+ "|" + order.getProductId()
				+ "|" + order.getCampaignId()
				+ "|" + order.getQuantity()
				+ "|" + order.getUnitPrice()
				+ "|" + order.getDiscountPercent()
				+ "|" + order.getDiscountedPrice()
				);
		
		
	}


	@Override
	public void update(int orderId, Date date, int userId, int productId, int campaignId, int quantity, double unitPrice) {
		System.out.println("Order : " + orderId + " updated. ");
	}

	@Override
	public void delete(int orderId) {
		System.out.println("Order : " + orderId + " deleted. ");	
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public CampaignService getCampaignService() {
		return campaignService;
	}

	public void setCampaignService(CampaignService campaignService) {
		this.campaignService = campaignService;
	}
	
	
}
