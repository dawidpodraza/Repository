using System.IO.IsolatedStorage;

class HospitalApp
{
    static void Main(string[] args)
    {
        Hospital hospital = new Hospital();
        int choice;



        do
        {

            Console.WriteLine("0-wyjdź z programu , 1-dodaj pacjentów , 2-pokaż pacjentów");
            choice = int.Parse(Console.ReadLine());

            switch (choice)
            {
                case 0:
                    Environment.Exit(0);
                    break;
                case 1:
                    hospital.add();
                    break;

                case 2:
                    hospital.showQueue();
                    break;
                
            }
        }while (choice != 0);





    }
}

class Hospital
{



    Patient[] patients = new Patient[3];
    int index = 0;



    public void add()
    {
        if (index < 3)
        {
            Patient patient = new Patient();

            Console.WriteLine("Podaj imie: ");
            patient.FirstName = Console.ReadLine();
            Console.WriteLine("Podaj nazwisko: ");
            patient.LastName = Console.ReadLine();
            Console.WriteLine("Podaj PESEL");
            patient.Pesel = Console.ReadLine();
            patients[index] = patient;
            index++;
        }
        else
        {
            Console.WriteLine("Koniec kolejki");
        }
        
            
        
       


    }

    public void showQueue()

    {
        Console.WriteLine("Koleja pacjentów wygląda następująco");
        for (int i = 0; i < patients.Length; i++)
        {
            if (patients[i] != null) // sprawdzamy, czy pacjent istnieje
            {
                Console.WriteLine($"{i + 1}. {patients[i].FirstName} {patients[i].LastName}, PESEL: {patients[i].Pesel}");
            }
        }
    }







    class Patient
    {
        private string firstName;
        private string lastName;
        private string pesel;

        public string FirstName
        {
            get { return firstName; }
            set { firstName = value; }

        }
        public string LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }
        public string Pesel
        {
            get { return pesel; }
            set { pesel = value; }
        }
        public Patient(string firstName, string lastName, string pesel)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.pesel = pesel;
        }

        public Patient()
        {
            // bezargumentowy
        }

    }
}




