package ie.ait.factory.entities;

public class OrderRequestProduct {

	private Product product;
	private int quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return product.getId() + "-" + product.getDescription() + " (" + quantity + ")";
	}

}
