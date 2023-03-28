package com.studentmgt.studentmgt.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
public static Session getSession() {
	Configuration cfg=new Configuration();
	cfg.configure("studentmgt.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	return factory.openSession();
	
}
}
