package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	Product product;
	
	public OrderItem() {		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product name: ");
		sb.append(getProduct().getName() + "\n");		
		sb.append("$" + price + "\n");
		sb.append(quantity);
		
		return sb.toString();
		
	}
}
