package servlet_crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_crud.dto.StudentDto;

public class StudentDao
{
EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
EntityManager manager= factory.createEntityManager();
EntityTransaction transaction=manager.getTransaction();

public String insertData(StudentDto studentDto)
{
   transaction.begin();
   manager.persist(studentDto);
   transaction.commit();
return "data inserted successfully";
}

public String updateData(StudentDto studentDto)
{
   transaction.begin();
   manager.merge(studentDto);
   transaction.commit();
return "data updated successfully";
}


public StudentDto fetchById(int id)
{
	StudentDto studentDto=manager.find(StudentDto.class, id);
	return studentDto;
}  	
	
public List<StudentDto> fetchAll()
{
	Query q =manager.createQuery("select s from StudentDto s");
	List<StudentDto> list = q.getResultList();
	return list;
}
	
public String deleteById(int id)
	
{
	    StudentDto studentDto=manager.find(StudentDto.class, id);
		if(studentDto != null)
		
           {
			transaction.begin();
			manager.remove(studentDto);
			transaction.commit();
			return "data deleted succesfully";
		}else {
			return "no data found";
		}
	}
	
	public String deleteAll()
	{
		Query q=manager.createQuery("select s from StudentDto s");
		List<StudentDto> list = q.getResultList();
		
		if(list.isEmpty())
		{
			return "no data found";
		}else {
			for(StudentDto a : list)
			{
				transaction.begin();
				manager.remove(a);
				transaction.commit();
			}
			return " all data deleted";
		}
	}
}

