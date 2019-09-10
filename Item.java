/**
 * 
 */

/**
 * @author Andish
 *
 */
public class Item {
	/*static attribute*/
	private static int totalItems = 0;
	
	/*attributes*/
	private String Name;
	private String Description;
	private String Category;
	private String Supplier_Name;
	private String Supplier_Contacts;
	private double Price;
	private int Available_Quantity;
	private String Item_Id;

	
	/*constructor*/
	/**
	 * default constructor
	 */
	public Item() {
		this.Name = null;
		this.Description = null;
		this.Category = null;
		this.Supplier_Name = null;
		this.Supplier_Contacts = null;
		this.Price = 0.0;
		this.Available_Quantity = 0;
		this.Item_Id = null;
		
		//incrementing the count to track
		setTotalItems(getTotalItems() + 1);
	}
	
	/**
	 * 8 overloaded constructors
	 * @param Name of item
	 * @param Description of item
	 * @param Category of item
	 * @param Supplier_Name of item
	 * @param Supplier_Contacts of item
	 * @param Price of item
	 * @param Available_Quantity of item
	 * @param Item_Id of item
	 */
	public Item(String Name, String Description, String Category, String Supplier_Name, String Supplier_Contacts, double Price, int Available_Quantity, String Item_Id) {
		this.Name = Name;
		this.Description = Description;
		this.Category = Category;
		this.Supplier_Name = Supplier_Name;
		this.Supplier_Contacts = Supplier_Contacts;
		this.Price = Price;
		this.Available_Quantity = Available_Quantity;
		this.Item_Id = Item_Id;
	}
	
	/*Behaviours*/
	
	/*Getters*/

	/**
	 * @return the name of item
	 */
	public String getName() {
		return this.Name;
	}

	/**
	 * @return the description of item
	 */
	public String getDescription() {
		return this.Description;
	}

	/**
	 * @return the category of item
	 */
	public String getCategory() {
		return this.Category;
	}

	/**
	 * @return the supplier_Name of item
	 */
	public String getSupplier_Name() {
		return this.Supplier_Name;
	}

	/**
	 * @return the supplier_Contacts of item
	 */
	public String getSupplier_Contacts() {
		return this.Supplier_Contacts;
	}

	/**
	 * @return the price of item
	 */
	public double getPrice() {
		return this.Price;
	}

	/**
	 * @return the available_Quantity of item
	 */
	public int getAvailable_Quantity() {
		return this.Available_Quantity;
	}

	/**
	 * @return the item_Id of item
	 */
	public String getItem_Id() {
		return this.Item_Id;
	}

	
	/*setters*/
	
	
	/**
	 * @param name the name to set item
	 */
	public void setName(String name) {
		this.Name = name;
	}

	/**
	 * @param description the description to set item
	 */
	public void setDescription(String description) {
		this.Description = description;
	}

	/**
	 * @param category the category to set item
	 */
	public void setCategory(String category) {
		this.Category = category;
	}

	/**
	 * @param supplier_Name the supplier_Name to set item
	 */
	public void setSupplier_Name(String supplier_Name) {
		this.Supplier_Name = supplier_Name;
	}

	/**
	 * @param supplier_Contacts the supplier_Contacts to set item
	 */
	public void setSupplier_Contacts(String supplier_Contacts) {
		this.Supplier_Contacts = supplier_Contacts;
	}

	/**
	 * @param price the price to set item
	 */
	public void setPrice(double price) {
		this.Price = price;
	}

	/**
	 * @param available_Quantity the available_Quantity to set item
	 */
	public void setAvailable_Quantity(int available_Quantity) {
		this.Available_Quantity = available_Quantity;
	}

	/**
	 * @param item_Id the item_Id to set item
	 */
	public void setItem_Id(String item_Id) {
		this.Item_Id = item_Id;
	}
	
	
	@Override
	public String toString() {
		return "Item [Name=" + Name + ", Description=" + Description + ", Category=" + Category + ", Supplier_Name="
				+ Supplier_Name + ", Supplier_Contacts=" + Supplier_Contacts + ", Price=" + Price
				+ ", Available_Quantity=" + Available_Quantity + ", Item_Id=" + Item_Id + "]";
	}
	
	/**
	 *  a method to compare if 2 items objects are the same based on their ITEM_ID
	 * @param p is the other item with whom we are trying to compare
	 * @return true if they are the same
	 */
	public boolean equals(Item p) {
		if(this.Item_Id.equalsIgnoreCase(p.Item_Id)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

	/**
	 * @return the totalItems of item
	 */
	public static int getTotalItems() {
		return totalItems;
	}

	/**
	 * @param totalItems the totalItems to set item
	 */
	public static void setTotalItems(int totalItems) {
		Item.totalItems = totalItems;
	}
	
	/**
	 * 
	 * @return
	 */
	public String findItemByCat() {
		return(this.Name + " " + this.Description + " " + this.Category + " " + this.Supplier_Name + " " + this.Supplier_Contacts + " " + this.Price + " " + this.Available_Quantity + " " + this.Item_Id + " ");
	}

}
