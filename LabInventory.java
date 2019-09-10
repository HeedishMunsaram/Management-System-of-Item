import java.util.Objects;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Andish
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner
		Scanner keyboard = new Scanner(System.in);
		
		//initialising variable
		int i = 0;
		int size = 0;
		int choice = 0;
		String pwrd = null;
		final String PASSWORD = "DitProg123";
		int wrong = 0;
		
		System.out.println("Welcome to the lab inventory");
		
		System.out.println("Enter maximum number of Items to be store: ");
		size = keyboard.nextInt();
		
		//Create an empty array
		Item[] itemDatabase = new Item[size];
		
		for (i = 0; i<size-3; i++) {
			System.out.println("Item Name: ");
			String Name = keyboard.next();
			
			System.out.println("Item Description: ");
			String Description = keyboard.next();
			
			System.out.println("Item Category: ");
			String Category = keyboard.next();
			
			System.out.println("Item Supplier_Name: ");
			String Supplier_Name = keyboard.next();
			
			System.out.println("Item Supplier_Contacts: ");
			String Supplier_Contacts = keyboard.next();
			
			System.out.println("Item Price: ");
			double Price = keyboard.nextDouble();
			
			System.out.println("Item Available_Quantity: ");
			int Available_Quantity = keyboard.nextInt();
			
			System.out.println("Item Item_Id");
			String Item_Id = keyboard.next();
			
			itemDatabase [i] = new Item(Name, Description, Category, Supplier_Name, Supplier_Contacts, Price, Available_Quantity, Item_Id);
			
			itemDatabase[i].setName(Name);
			itemDatabase[i].setDescription(Description);
			itemDatabase[i].setCategory(Category);
			itemDatabase[i].setSupplier_Contacts(Supplier_Contacts);
			itemDatabase[i].setSupplier_Name(Supplier_Name);
			itemDatabase[i].setPrice(Price);
			itemDatabase[i].setAvailable_Quantity(Available_Quantity);
			itemDatabase[i].setItem_Id(Item_Id);
			
			System.out.println(itemDatabase[i].toString());
			
		}
		
		do {
			System.out.println("What do you want to do? ");
			System.out.println("Enter 1 to add new Item to the inventory ");
			System.out.println("Enter 2 to change information of an existing Item ");
			System.out.println("Enter 3 to display all the Items with specified category ");
			System.out.println("Enter 4 to display all Item to be re-ordered ");
			System.out.println("Enter 5 to know number of Items currently in store ");
			System.out.println("Enter 6 to quit ");
			System.out.println("Enter your choice: ");
			choice = keyboard.nextInt();
			
			
			
			if (choice == 1) {
				System.out.println("Add new Item to the inventory");
				for(int attempt = 0; attempt < 3; attempt++) {
					System.out.println("Enter your password. Attempt "+(attempt + 1)+": ");
					pwrd = keyboard.next();
					
					if(!pwrd.equals(PASSWORD)) {
						wrong++;
						System.out.println("Try again ");
						
						if(wrong == 12) {
							System.out.println("Dell1234");
							break;
						}
					}
					else {
						break;
					}
				}
			}
			
			if(choice == 2) {
				System.out.println("Enter your password for the Lab Inventory");
				pwrd = keyboard.next();
				
				boolean a = false;
				a = Objects.deepEquals(PASSWORD, pwrd);
				if (a = true) {
					System.out.println("Password is OK");
					break;
				}
				
				else if(pwrd != PASSWORD) {
					System.out.println(comparePass(pwrd, PASSWORD, choice));
					break;
					}
			}
			
			if (choice == 3) {
				System.out.println("Please enter category of items you are looking for: ");
				String cat = keyboard.next();
				
				for (int y = 0; y < size; y++) {
					String c = itemDatabase[y].getCategory();
				
				if (cat.equalsIgnoreCase(c)) {
					System.out.println(itemDatabase[y].findItemByCat());
				}
				
				}
			}
			
			if (choice == 5) {
				System.out.println("Total items created: " + Item.getTotalItems());
				break;
			}
			
			if (choice == 6) {
				System.out.println("Program is exiting");
				break;
			}
			
		}
		while(!pwrd.equals(PASSWORD));
		
	}

}
