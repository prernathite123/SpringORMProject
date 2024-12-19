package orm.BooksUnimpl;

import orm.Entity.BookStore;

public interface BookDao {

	public int add(BookStore book);
	public int change(BookStore book,int id);
	public int delete(int bid);
	public void getBookById(int bid);
	public void showAllBooks();
	
}
