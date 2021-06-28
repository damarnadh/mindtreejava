package set2problems;
import java.util.*;

public class Exer26 {
	static Item itemArray[]=new Item[5];
	static int billId =0;
	static int customerId=1;
	static int discount =0;
	static int quantity =0;
	static int billAmount=0;
	static Scanner scanner =new Scanner(System.in);
	
	static Item checkItem(Item arr[],int itemId) {
		for(Item item :arr) {
			if(item.getId()==itemId) {
				System.out.println("Item found !!");
				return item;
			}
		}
		
		System.out.println("Error : Item not found");
		return null;
	}
	
	static void getBilling(Item item) {
		System.out.println("please enter item quantity :");
		quantity=scanner.nextInt();
		billAmount=quantity*item.getPrice();
		billId++;
	}
	
	static void storeItemIdandPrice() {
		Item item1 = new Item();
		item1.setId(1001);
		item1.setPrice(55);
		item1.setPrice(35);
		itemArray[0]=item1;
		
		Item item2 = new Item(1002,54);
		
		itemArray[1]=item2;
		
		Item item3 = new Item();
		item3.setId(1003);
		item3.setPrice(36);
		itemArray[2]=item3;
		
		Item item4 = new Item();
		item4.setId(1004);
		item4.setPrice(48);
		itemArray[3]=item4;
		
		Item item5 = new Item();
		item5.setId(1005);
		item5.setPrice(24);
		itemArray[4]=item5;
	}
	
	public static void showMenu() {
		System.out.println("Menu:");
		System.out.println("-------------------------------------");
		for(Item item:itemArray) {
			System.out.println("item id : "+item.getId()+", item price :"+item.getPrice());
		}
		System.out.println("-------------------------------------");
	}
	
	public static int doPurchase() {
		
		System.out.println("please enter item purchase id:");
		int	purchaseItemId=scanner.nextInt();
		
		return purchaseItemId;
	}
	
	public static void showBillDetails(int purchaseItemId) {
		System.out.println("*****************************************");
		System.out.println("Bill id : "+billId);
		System.out.println("Customer id : "+customerId);
		System.out.println("Purchased item id : "+purchaseItemId);
		System.out.println("Quantity purchased : "+quantity);
		System.out.println("Discount : "+discount);
		System.out.println("Bill Amount : "+billAmount);
		System.out.println("*****************************************");
	}
	
	public static void main(String []args) {
		
		storeItemIdandPrice();
		
		while(true) {	
			showMenu();
			int purchaseItemId= doPurchase();	
			Item item=checkItem(itemArray,purchaseItemId);
			if(item != null) {
				getBilling(item);
				showBillDetails(purchaseItemId);
			}
		}
	}
}
