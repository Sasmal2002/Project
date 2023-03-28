package com.studentmgt.studentmgt.Dao;

import com.studentmgt.studentmgt.entity.Address;
import com.studentmgt.studentmgt.entity.Student;
import com.studentmgt.studentmgt.entity.Student;

public interface StudentDao {

	public void insertstudent (String name,String contact,Address add);
	public void updatestudent (int id,String name,String contact,Address add);
	public void deletestudent (int id);
	public Student viewstudent (int id);
	
}
