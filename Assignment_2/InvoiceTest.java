class Invoice{
private String partnum;
private String desc;
private int quantity;
private double price;
public Invoice(String partnum, String desc, int quantity, double price) {
	super();
	this.partnum = partnum;
	this.desc = desc;
	setQuantity(quantity);
	setPrice(price);
}
public String getPartnum() {
	return partnum;
}
public void setPartnum(String partnum) {
	this.partnum = partnum;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    if (quantity > 0) {
        this.quantity = quantity;
    } else {
        this.quantity = 0;
    }
}
public double getPrice() {
    return price;
}

public void setPrice(double price) {
    if (price > 0) {
        this.price = price;
    } else {
        this.price = 0.0;
    }
}
public double getInvoiceAmount() {
    return quantity * price;
}

	
}
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Invoice iv = new Invoice("1234", "Drill", 10, 15.44);
        System.out.println("Part number:"+iv.getPartnum());
        System.out.println("Description :"+iv.getDesc());
        System.out.println("Quantity : "+iv.getQuantity());
        System.out.println("Price : "+iv.getPrice());
        System.out.println("Invoice amount: "+iv.getInvoiceAmount());
        System.out.println("i!Thank you for your Purchase!i ");
        System.out.println();
        Invoice i2v = new Invoice("22", "Saw", -10, 45.43);
        System.out.println("Part number:"+i2v.getPartnum());
        System.out.println("Description :"+i2v.getDesc());
        System.out.println("Quantity : "+i2v.getQuantity());
        System.out.println("Price : "+i2v.getPrice());
        System.out.println("Invoice amount: "+i2v.getInvoiceAmount());
        System.out.println("i!Thank you for your Purchase!i ");
        System.out.println();
        Invoice i3v = new Invoice("1234", "Drill", 10, -15.44);
        System.out.println("Part number:"+i3v.getPartnum());
        System.out.println("Description :"+i3v.getDesc());
        System.out.println("Quantity : "+i3v.getQuantity());
        System.out.println("Price : "+i3v.getPrice());
        System.out.println("Invoice amount: "+i3v.getInvoiceAmount());
        System.out.println("i!Thank you for your Purchase!i ");
	}

}
