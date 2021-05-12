package ders4_odev3;

import java.util.Date;
import java.util.GregorianCalendar;

import ders4_odev3.abstracts.CampaignService;
import ders4_odev3.abstracts.CategoryService;
import ders4_odev3.abstracts.OrderService;
import ders4_odev3.abstracts.ProductService;
import ders4_odev3.abstracts.UserService;
import ders4_odev3.adapter.MernisServiceAdapter;
import ders4_odev3.concretes.CampaignManager;
import ders4_odev3.concretes.CategoryManager;
import ders4_odev3.concretes.GameManager;
import ders4_odev3.concretes.OrderManager;
import ders4_odev3.concretes.PlayerCheckManager;
import ders4_odev3.concretes.PlayerManager;
import ders4_odev3.entities.Campaign;
import ders4_odev3.entities.Category;
import ders4_odev3.entities.Game;
import ders4_odev3.entities.Player;
import ders4_odev3.entities.Product;
import ders4_odev3.entities.User;

public class Main {

	public static void main(String[] args) {
		// Categories
		CategoryService categoryService = new CategoryManager();
		Category games = new Category(1, "Games", 0);
		Category category1 = new Category(2, "FPS", 1);
		Category category2 = new Category(3, "MMORPG", 1);
		categoryService.addBulk(new Category[] {games, category1, category2});
		System.out.println("");
		
		// Games
		ProductService productService = new GameManager();
		Product game1 = new Game(1, "Counter-Strike: Global Offensive", 
				"Counter-Strike: Global Offensive (CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago.",
				35, 2, 1);
		Product game2 = new Game(2, "Knight Online", 
				"Knight Online is a leading party based medieval MMORPG that is, and will alyways be, Free to Play! Register now and enjoy Knight Online.", 
				0, 3, 2);
		productService.addBulk(new Product[] {game1, game2});	
		System.out.println("");
		
		// Players + IdentityNumberValidation
		UserService userService1 = new PlayerManager(new PlayerCheckManager(new MernisServiceAdapter()));
		User player1 = new Player(1, "1000", "ibrahim Efe", "Cimen", "100000000", new GregorianCalendar(2005,01,26).getTime());
		User player2 = new Player(2, "1001", "Mehmet Arda", "Cimen", "10000000", new GregorianCalendar(2007,07,11).getTime());
		userService1.addBulk(new User[] {player1, player2});
		System.out.println("");
		
		// Campaign
		CampaignService campaignService = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "CSGOX05", game1, "summer campaign", "", 50, 
				new GregorianCalendar(2021,4,1).getTime(), 
				new GregorianCalendar(2021,5,1).getTime()) ;
		campaignService.add(campaign1);
		System.out.println("");

		// Order
		OrderService orderService = new OrderManager(userService1,productService,campaignService);
		orderService.add(new Date(),1,1,1,1,35);
		System.out.println("");
		
		
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager(new MernisServiceAdapter()));
		playerManager.get(u -> u.getUserCode() == "111").forEach(user->{
			System.out.println(user.getUserCode());
		});
	}

}
