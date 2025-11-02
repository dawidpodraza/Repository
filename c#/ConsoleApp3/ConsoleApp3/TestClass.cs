namespace ConsoleApp3;

public class TestClass : ITestInterface
{
    private String firstname;
    private String lastname;
    private String email;

    public string Firstname
    {
        get => firstname;
        set => firstname = value ?? throw new ArgumentNullException(nameof(value));
    }

    public string Lastname
    {
        get => lastname;
        set => lastname = value ?? throw new ArgumentNullException(nameof(value));
    }

    public string Email
    {
        get => email;
        set => email = value ?? throw new ArgumentNullException(nameof(value));
    }

    public void Method1()
    {
        Console.WriteLine("Test method");
    }

    public void DoSomethingInterface()
    {
        throw new NotImplementedException();
    }

    private sealed class FirstnameLastnameEmailEqualityComparer : IEqualityComparer<TestClass>
    {
        public bool Equals(TestClass? x, TestClass? y)
        {
            if (ReferenceEquals(x, y)) return true;
            if (x is null) return false;
            if (y is null) return false;
            if (x.GetType() != y.GetType()) return false;
            return x.firstname == y.firstname && x.lastname == y.lastname && x.email == y.email;
        }

        public int GetHashCode(TestClass obj)
        {
            return HashCode.Combine(obj.firstname, obj.lastname, obj.email);
        }
    }

    public static IEqualityComparer<TestClass> FirstnameLastnameEmailComparer { get; } = new FirstnameLastnameEmailEqualityComparer();
}

