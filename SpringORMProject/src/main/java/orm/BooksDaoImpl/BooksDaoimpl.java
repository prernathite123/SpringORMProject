package orm.BooksDaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import orm.BooksUnimpl.BookDao;
import orm.Entity.BookStore;

public class BooksDaoimpl implements BookDao{

	HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional
	public int add(BookStore book) {
		Integer row=(Integer) template.save(book);
		
		return row;
	}

	@Transactional
	public int change(BookStore newbook,int id) {
	BookStore existBook=template.get(BookStore.class, id);
	existBook.setBname(newbook.getBname());
	existBook.setBprice(newbook.getBprice());
	existBook.setBauthor(newbook.getBauthor());
	 template.update(existBook);
		return 1;
	}

	@Transactional
	public int delete(int bid) {
		// TODO Auto-generated method stub
		BookStore b=template.get(BookStore.class,bid);
		template.delete(b);
		return 0 ;
	}

	@Override
	public void getBookById(int bid) {
		// TODO Auto-generated method stub
		BookStore b=template.get(BookStore.class,bid);
		System.out.println(b);
		
		
	}

	@Override
	public void showAllBooks() {
		// TODO Auto-generated method stub+
		List<BookStore> list=template.loadAll(BookStore.class);
		System.out.println(list);
		
	}

	

}
