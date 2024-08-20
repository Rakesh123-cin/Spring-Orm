package com.rakesh.SpringOrm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.rakesh.SpringOrm.model.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//Create Data
    @Transactional
	public void insertStudent(Student s)
	{
		hibernateTemplate.save(s);
	}
    
    //Read Data
    public Student getStudent(int id)
    {
    	return hibernateTemplate.get(Student.class,id);
    }
    
    //Read Multiple Data
    public List<Student> getAllStudents()
    {
    	return hibernateTemplate.loadAll(Student.class);
    }
    
    //Update Data
    @Transactional
    public void updateStudent(Student s)
    {
    	hibernateTemplate.update(s);
    }
    
    //Delete Data
    @Transactional
    public void deleteStudent(int id)
    {
    	Student s = hibernateTemplate.get(Student.class,id);
    	hibernateTemplate.delete(s);
    }
}
