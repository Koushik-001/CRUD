package com.example.practice2;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.practice2.Entity.Student;
import com.example.practice2.dao.Studentdao;

@SpringBootApplication
public class Practice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice2Application.class, args);
	}
@Bean
public CommandLineRunner cmd(Studentdao std1){
	return runner->{
		demtest(std1);
	};
}
private void demtest(Studentdao std1) {
System.out.println("Enter the choice");
System.out.println("1.Create \n 2.Read \n 3.Update \n 4.Delete");
int n;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
if(n==1){
	System.out.println("Enter the values of \nfname:\n lname:\n mail:\n");
	String fname,lname,mail;
	Scanner sc1 = new Scanner(System.in);
	fname=sc1.nextLine();
	lname=sc1.nextLine();
	 mail=sc1.nextLine();
    Student obj1 = new Student(fname, lname, mail);
	std1.create(obj1);
	 sc1.close();
	}
if(n==2){
	System.out.println("Enter the key:\n");
	int key;
	Scanner sc3 = new Scanner(System.in);
	key=sc3.nextInt();
    std1.read(key);
	sc3.close();
}
if(n==3){
	System.out.println("Enter the key:\n");
	int key1,key3;
	Scanner sc3 = new Scanner(System.in);
	key1=sc3.nextInt();
	Student stud = std1.read(key1);
	String a;
	Scanner sc5 = new Scanner(System.in);
	System.out.println("to update 1.First name\n 2.Last Name\n 3.Email\n");
    key3=sc3.nextInt();
	if(key3==1){;
	a=sc5.nextLine();
	 stud.setFirstname(a);
	 std1.update(stud);
	}
	if(key3==2){
		
	a=sc5.nextLine();
	 stud.setLastname(a);
	 std1.update(stud);
	}
	if(key3==3){
	a=sc5.nextLine();
	 stud.setEmail(a);
	 std1.update(stud);	
	}
		sc3.close();
	sc5.close();
}
if(n==4){
	System.out.println("Enter the key to be deleted:\n");
	int key2;
	Scanner sc4 = new Scanner(System.in);
	key2=sc4.nextInt();
    std1.delete(key2);
	sc4.close();
}
sc.close();
}

}