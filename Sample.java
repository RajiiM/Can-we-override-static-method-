Can we override static method?

Method Overriding:
If the same method name is declared in both the superclass and the subclass, then the method of the sub class overrides the method of the superclass. This is known as method overriding.

Ex 1:
public class Parent {
     
    public void study()
    {
        System.out.println("Early Morning Study - Best");
    }
}

	
public class Child extends Parent {
 
    public static void main(String[] args) 
    {
        Child child_obj = new Child();
        child_obj.study();
    }
}

Output:

Early Morning Study – Best

-------------------------------------

Ex 2:
	
public class Parent {
     
    public void study()
    {
        System.out.println("Early Morning Study - Best");
    }
}

public class Child extends Parent {
 
    public static void main(String[] args) 
    {
        Child child_obj = new Child();
        child_obj.study();
    }
     
    public void study()
    {
        System.out.println("Group Study - Best");
    }
}

Output:

Group Study – Best

------------------------------

Code Explanation:

    In Ex 1, Parent class have work method. If child class object called work method, parent class work method will be processed.
    In Ex 2, Parent class & child class both have work method. If child class object called work method, child class work method will be processed. Here, parent class work method is over rided by child class work method.
	
--------------------------

Ex 3: Using Dynamic Binding
	
public class Parent {
     
    public void study()
    {
        System.out.println("Early Morning Study - Best");
    }
}

	
public class Child extends Parent {
 
    public static void main(String[] args) 
    {
        Parent parent_obj = new Child();
        parent_obj.study();
    }
 
    public void study()
    {
        System.out.println("Group Study - Best");
    }
 
}

Output:

Group Study – Best
------------------------------

Code Explanation:

    Inside the Child class,
        reference -> Parent Class
        object -> Child Class
    This Parent Class reference can access child class methods those are already written in Parent Class.
    Parent Class reference can not access child class own methods
---------------------
Ex 4: Static Methods, Dynamic Binding

public class Parent {
     
    public static void study()
    {
        System.out.println("Early Morning Study - Best");
    }
}

	
public class Child extends Parent {
 
    public static void main(String[] args) 
    {
        Parent parent_obj = new Child();
        parent_obj.study();
    }
 
    public static void study()
    {
        System.out.println("Group Study - Best");
    }
 
}

Output:

Early Morning Study – Best
---------------------------------

Code Explanation:

    Here, Both Parent & Child class have static study methods.
    Inside the Child class, Parent class object reference called study method.
    Parent class study method is processed.
    Does not happened like previous program Ex 3.
---------------------

Ex 5: Static Methods, Without Object Creation

Ex 5.1:
	
public class Parent {
     
    public static void study()
    {
        System.out.println("Early Morning Study - Best");
    }
}

public class Child extends Parent {
 
    public static void main(String[] args) 
    {
        study();
    }   
     
}

Output:

Early Morning Study – Best

———————————–

Ex 5.2:
	
public class Parent {
     
    public static void study()
    {
        System.out.println("Early Morning Study - Best");
    }
}

public class Child extends Parent {
 
    public static void main(String[] args) 
    {
        study();
    }
     
    public static void study()
    {
        System.out.println("Group Study - Best");
    }
     
}

Output:

Group Study – Best

———————–

Code Explantion:

    In Ex 5.1, Parent class have static study method.
    We can access static methods without object creation, so we called this study method inside the Child class.
    Parent class study method is processed.
    In Ex 5.2, Parent class & Child class both have static study method.
    We called study method inside the Child class.
    Child class study method is processed.
    It doesn’t means, Child class static method over ride the Parent class static method.
    It means, Parent Class static method is hidden inside the Child class.
    So that, we got Parent class static method output in previous Ex 4.
    Therefore, Static methods cannot over rided.

    WE CAN’T OVERRIDE THE STATIC METHODS

    Static means class property.
    If a variable or method is static, It is common for all the objects inside the class.
    If we want to update the static method, we must do that inside the same class. Then only, all the objects are known about that.
    If we edit or override the parent class static method inside the child class, then how did parent class objects are know?
    Hence, we can’t override the static method.
-----------
