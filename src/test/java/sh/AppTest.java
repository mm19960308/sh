package sh;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.Test;

import com.woniu.domain.User;
import com.woniu.util.HibernateUtils;

public class AppTest {
	
	public static void main(String[] args) {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		User u = new User();
		u.setName("aa");
		session.save(u);
		
		session.getTransaction().commit();;
		session.close();
	}
	
	@Test
	public void testName() throws Exception {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		User u = new User();
		u.setName("aa");
		session.save(u);
		
		session.getTransaction().commit();
		session.close();
	}
	
}
