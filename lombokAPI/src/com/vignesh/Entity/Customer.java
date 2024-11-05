package com.vignesh.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Customer {
	
	private int cid;
	private String cname;
	private String caddress;
	private double billamt;

}


/*
Getter and Setter annotations can be applied not only at
class level but also at field level.

@Setter
@Getter
public class Customer {	
	private int cid;
	private String cname;
	private String caddress;
	private double billamt;
} 4 setter methods and 4 getter methods
============================================

public class Customer {
	private int cid;
	@Setter
	@Getter
	private String cname;
	private String caddress;
	@Setter
	@Getter
	private double billamt;
}//setCname(),getCname();setBillamt(),getBillamt();
=====================================================

public class Customer {	
	private int cid;
	private String cname;
	private String caddress;
	private double billamt;
}

Customer customer = new Customer();
System.out.println(customer); => com.vignesh.Entity.Customer@4ea54
								 classname+@+hexadecimal notation
Object class' toString() method is called, which gives fully qualified class appended with 
hash code in hexadecimal form.

//source code of toString() of Object class
 * return getClass.getName()+"@"+Integer.toHexString(hashCode());
@ToString
public class Customer {
	
	private int cid;
	private String cname;
	private String caddress;
	private double billamt;

}

System.out.println(new Customer);// Customer(cid=0,cname=null,caddress=null,billamt=0.0)
===========================================================================================
@EqualsAndHashCode
public class Customer {
	private int cid;
	private String cname;
	private String caddress;
	private double billamt;
}

why equals() and hashcode() are given together? - equals() internally uses hashcode()
by default equal(), hashcode() methods of Object class are called.
Object class' hashcode() method give unique hash code for each object.
Even objects of same type and same data are assigned with different hashcodes by Object class.

But hashCode() method of lombok api gives same hashCode for the objects of same type and having same data.
equals() method of Object class works as == operator
i.e two objects are equal only if the are same.
even if objects of same type and having same data are assigned false if equals method of Object is used.
equals() internally uses hashCode().

So lombok api equals() method return true for objects of same type and having same data.

* Actually, the main purpose of hashcode is to identify an object in the heap area.
* So, an object can more than one hashcode, one is unique to every object which is given by Object class
  to identify it uniquely in the heap area. And the another one overridden hashcode given by lombok api.
* orginial hashcode is given by method identityHashCode() by System class

*/