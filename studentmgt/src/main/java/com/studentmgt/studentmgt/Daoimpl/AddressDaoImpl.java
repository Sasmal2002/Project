package com.studentmgt.studentmgt.Daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.studentmgt.studentmgt.Dao.AddressDao;
import com.studentmgt.studentmgt.Util.HiberUtil;
import com.studentmgt.studentmgt.entity.Address;
import com.studentmgt.studentmgt.entity.Student;

public class AddressDaoImpl implements AddressDao {
	Session session= HiberUtil.getSession();
public void insertAddress(String hno, String area, String city, String state, String pin) {
		Address add=new Address(hno,area,city,state,pin);
		Transaction tx=session.beginTransaction();
		session.save(add);
		tx.commit();
		
	}

	public void updateAddress(int aid, String hno, String area, String city, String state, String pin) {
		Address add=session.get(Address.class, aid);
		add.setAid(aid);
		add.setHno(hno);
		add.setArea(area);
		add.setCity(city);
		add.setState(state);
		add.setPin(pin);
		Transaction tx=session.beginTransaction();
		session.update(add);
		tx.commit();
		
	}

	public void deleteAddress(int aid) {
		Address add=session.get(Address.class, aid);
		Transaction tx=session.beginTransaction();
		session.delete(add);
		tx.commit();
		
	}

	public Address viewAddress(int aid) {
		
		return session.get(Address.class, aid);
	}

}
