package orm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookStore {

	String bname;
	@Id
	int id;
	double bprice;
	String bauthor;
	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookStore(String bname, int id, double bprice, String bauthor) {
		super();
		this.bname = bname;
		this.id = id;
		this.bprice = bprice;
		this.bauthor = bauthor;
	}
	@Override
	public String toString() {
		return "BookStore [bname=" + bname + ", id=" + id + ", bprice=" + bprice + ", bauthor=" + bauthor + "]";
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	

}
