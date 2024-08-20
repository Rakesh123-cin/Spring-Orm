package com.rakesh.SpringOrm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.SpringOrm.dao.StudentDao;
import com.rakesh.SpringOrm.model.Student;

import java.util.List;

import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao dao = context.getBean("studentDao",StudentDao.class);
    	
//    	Student s1 = new Student(102,"Rakesh","BLR");
//    	dao.insertStudent(s1);
    	Student s1 = new Student(101,"Anmol","Shilong");
    	dao.updateStudent(s1);
    	
    	List<Student> studs = dao.getAllStudents();
    	for(Student s:studs)
    	{
    		System.out.println(s);
    	}
    	
    	
    }
}
