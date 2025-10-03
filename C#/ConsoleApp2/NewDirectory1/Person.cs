namespace ConsoleApp2.NewDirectory1;

public class Person
{
    private string _firstName;
    private string _lastName;
    private int _age;
    
    public Person(string firstName, string lastName, int age)
    {
        _firstName = firstName; 
        _lastName = lastName;
        _age = age;
        
    }

    public string FirstName
    {
        get { return _firstName; }
        set { _firstName = value; }
        
    }

    public string LastName
    {
        get { return _lastName; }
        set { _lastName = value; }
        
    }

    public int Age
    {
        get { return _age; }
        set { _age = value; }
    }
}