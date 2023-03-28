package com.studentmgt.studentmgt.Daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.studentmgt.studentmgt.Dao.StudentDao;
import com.studentmgt.studentmgt.Util.HiberUtil;
import com.studentmgt.studentmgt.entity.Address;
import com.studentmgt.studentmgt.entity.Student;

public class StudentDaoImpl implements StudentDao{
	Session session= HiberUtil.getSession();
	public void insertstudent(String name, String contact, Address add) {
		Student stu=new Student(name,contact,add);
		Transaction tx=session.beginTransaction();
		session.save(stu);
		tx.commit();
		
	}

	public void updatestudent(int id, String name, String contact, Address add) {
		Student stu=session.get(Student.class,id);
		stu.setId(id);
		stu.setName(name);
		stu.setContact(contact);
		stu.setAddress(add);
		Transaction tx=session.beginTransaction();
		session.update(stu);
		tx.commit();
		
	}

	public void deletestudent(int id) {
		Student stu=session.get(Student.class,id);
		Transaction tx=session.beginTransaction();
		session.delete(stu);
		tx.commit();
		session.close();
		
	}

	public Student viewstudent(int id) {
		
		return session.get(Student.class, id);
	}
	public void closeSession() {
		session.close();
	}

}
