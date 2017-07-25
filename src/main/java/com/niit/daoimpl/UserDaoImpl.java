package com.niit.daoimpl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.dao.UserDao;
import com.niit.model.*;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionfactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionfactory = sf;
	}
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		Session s=sessionfactory.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
	
	}

	@Override
	public void getEmailid(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByEmailId(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(String email, String password) {
		// TODO Auto-generated method stub
		
	}

}
