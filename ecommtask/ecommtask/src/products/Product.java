package products;

public class Product {
	 private String cat;
	 private int pid;
	 private String pname;
	 private double price;
	 public String getCat() {
		 return cat;
	 }
	 public void setCat(String cat) {
		 this.cat = cat;
	 }
	 public int getPid() {
		 return pid;
	 }
	 public void setPid(int pid) {
		 this.pid = pid;
	 }
	 public String getPname() {
		 return pname;
	 }
	 public void setPname(String pname) {
		 this.pname = pname;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 public Product(String cat, int pid, String pname, double price) {
		super();
		this.cat = cat;
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	 }
	 public Product() {
		super();
	 }
	 
	 
	 

}
