package orm;

import java.util.List;

import java.util.Scanner;

import javax.persistence.Id;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orm.BooksDaoImpl.BooksDaoimpl;
import orm.BooksUnimpl.BookDao;
import orm.Entity.BookStore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Project starting");
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        BookDao b1=(BookDao) con.getBean("bookdao");

        
        boolean flag=true;
        while(flag) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("1:Adding a book");
        	System.out.println("2:Updating a book");
        	System.out.println("3:Deleting a  info of book");
        	System.out.println("4:Showing info using id");
        	System.out.println("5:Show all the books");
        	
        	
        	int choice=sc.nextInt();
        	switch (choice) {
			case 1:
				System.out.println("Enter the name of book");
				String b=sc.next();
			
				System.out.println("Enter the id of book");
				int id=sc.nextInt();
				
				System.out.println("Enter the prize of book");
				double p=sc.nextDouble();
				
				System.out.println("Enter the name of Auther");
				String a=sc.next();
				
				 BookStore book1=new BookStore(b,id,p,a);
				 b1.add(book1);
				break;
			case 2: 
				 BookStore book2=new BookStore();
				 System.out.println("Enter id that you want to update");
                 int id1=sc.nextInt();
				 boolean start=true;
				 while(start) {
					 
                    
					 System.out.println("1:Update name");
					 System.out.println("2:Update Book price");
					 System.out.println("3:Update Author name");
					 System.out.println("4:Exit");
					 int c=sc.nextInt();
					 switch (c) {
					case 1:
						String name1=sc.next();
					     book2.setBname(name1);
						break;
					case 2:
						double bp=sc.nextDouble();
						book2.setBprice(bp);
						break;
					case 3:
						String na=sc.next();
					     book2.setBauthor(na);
						break;

					case 4:
						start=false;
						break;
					}
					 }
				
			        
				int row=b1.change(book2,id1);
				System.out.println("Updated successfully"+row);
			break;
			
			case 3: System.out.println("Enter id that you want to delete");
		       int id3=sc.nextInt();
				b1.delete(id3);
			System.out.println("Deleted successfully");
			break;
			
			case 4: 
				System.out.println("Enter id that you want");
			       int id2=sc.nextInt();
				b1.getBookById(id2);
			break;
			
			case 5:b1.showAllBooks();
			break;
			
			case 6:flag=false;
		          System.out.println("THANK YOU:)");
			break;		
			}
        	
        }
    }
}
