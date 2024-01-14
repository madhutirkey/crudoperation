package com.crudoperationwithoutpostman;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.crudoperationwithoutpostman.model.User;
import com.crudoperationwithoutpostman.repository.UserRepository;

@SpringBootApplication
public class CrudoperationwithoutpostmanApplication {

	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudoperationwithoutpostmanApplication.class, args);
	    UserRepository userrepo=context.getBean(UserRepository.class);
	  /*------------------Save one user---------------------------*/
	    /*User user=new User();
		//user.setId(2);
	    user.setCity("Ranchi");
	    user.setName("Madhu");
	    user.setStatus("Available");
	    userrepo.save(user);
	    
	*/
	/*------------------Save multiple users ---------------------------*/
	
		/*User user1=new User();
		//user.setId(2);
	    user1.setCity("Delhi");
	    user1.setName("Vinitaerrr");
	    user1.setStatus("Available");
	    
	    
	    User user2=new User();
		//user.setId(2);
	    user2.setCity("Mumbai");
	    user2.setName("Vikash");
	    user2.setStatus("Available");
	    List<User> users = List.of(user1,user2);
	    List<User> result = userrepo.saveAll(users);
	     
	    result.forEach(user->{System.out.println(user);
	    	
	    }); */
	    
	   
	  /*--------------------------find data by Id-------------------*/
		/*Optional<User> findById = userrepo.findById(9);
		User user = findById.get();
		
		if(user==null) {
		throw new NoSuchElementException("No value present");
		
		}
		else
		{
		 user.setName("Sawan");
		 User result = userrepo.save(user);
		 System.out.println(result);
		}*/
	    
	    /*--------------------------find all data by FindAll method using Consumer-------------------*/
	       /* List<User> itr = userrepo.findAll();
	       itr.forEach(new Consumer<User>(){

			@Override
			public void accept(User t) {
				System.out.println(t);
				
			}
	    	   
	       }); */
	       
	       /*--------------------------find All by using forEach -------------------*/
	      /* List<User> itr = userrepo.findAll();
	       itr.forEach(user->{System.out.println(user);

	    	 }); */
	    
	       //List<User> itr=userrepo.findAll();
	       //for(int i=0;i<10;i++) itr.add(i);
	       
	       /*--------------------------delete one data-------------------*/
	        /*userrepo.deleteById(11);
	        System.out.println("deleted"); */
	        
	        /*--------------------------delete all data-------------------*/
	        List<User> allusers = userrepo.findAll();
	        allusers.forEach(user->{System.out.println(user);}); 
	        userrepo.deleteAll();
	        System.out.println("deleted");
	        
	
	}
	
	

}
