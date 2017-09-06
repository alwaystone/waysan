package com.ways.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ways.user.dao.UserDao;
import com.ways.user.entity.User;

import net.sf.json.JSONArray;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory ;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession() ;
	}
	public void insertUser(User user) {
		this.getSession().save(user) ;
		//this.getSession().createQuery("from User").list();
		//this.getSession().flush(); 
		//JSONArray arr = new JSONArray() ;
		//JSONArray arr = JSONArray.fromObject(this.getSession().createSQLQuery("select * from user")) ;
		//System.out.println(arr.toString());
		//List<User> list = (List<User>) this.getSession().createSQLQuery("select * from user") ;
		//String createTimeStr =  DateFormatUtils.format(list.get(0).getCreateTime(), "yyyy-MM-dd HH:mm:ss") ;
		//System.out.println(createTimeStr);
	}
	public List<User> getUserList(Map param) {
		//List<User> list = this.getSession().createSQLQuery("select * from user where id = ?").addEntity(User.class).setParameter(0, "402895075d788dae015d788dd82a0000").list() ;
		List list = this.getSession().createQuery("from User").list() ;
		
		//this.getSession().
		return list ;
		//return list;
	}
	public User getUserById(String id) {
		return (User) this.getSession().createQuery("from User where id=:id").setString("id", "402895075d788dae015d788dd82a0000").list().get(0) ;
		//return (User) this.getSession().createSQLQuery("select * from user where id = ?").addEntity(User.class).setParameter(0, "402895075d788dae015d788dd82a0000").list().get(0);
	}

}
