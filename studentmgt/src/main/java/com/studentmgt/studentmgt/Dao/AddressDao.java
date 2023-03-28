package com.studentmgt.studentmgt.Dao;



import com.studentmgt.studentmgt.entity.Address;
public interface AddressDao {

	public void insertAddress (String hno,String area,String city,String state,String pin);
	public void updateAddress (int aid,String hno,String area,String city,String state,String pin);
	public void deleteAddress (int aid);
	public Address viewAddress (int aid);
	
}
