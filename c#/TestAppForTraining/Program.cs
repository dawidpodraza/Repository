using System.IO.IsolatedStorage;
using TestAppForTraining;

CompanyBase appleCompany = new CompanyBase();

for (int i = 0; i < appleCompany.employees.Length; i++)
{
    appleCompany.employees[i].PrintInfo();
}


