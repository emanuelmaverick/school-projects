//PTASK9.cpp
#include <iostream>
#include <string>
#include <vector>
using namespace std;
int main ()
{
    vector<string> names;
    vector<double> salaries;
    vector<double> bonuses;
    
    cout.setf(ios::fixed);
    cout.precision(2);

    int numberOfEmployees;
    cout << "Enter the number of employees: ";
    cin >> numberOfEmployees;

    for (int i = 0; i < numberOfEmployees; i++) {
        string name;
        double salary;

        cout << "Enter the name of employee " << (i + 1) << ": ";
        cin >> name;

        cout << "Enter the salary of employee " << (i + 1) << ": ";
        cin >> salary;

        double bonus;
        if (salary <= 7000) {
            bonus = salary * 0.5;
        } else {
            bonus = 7000;
        }

        names.push_back(name);
        salaries.push_back(salary);
        bonuses.push_back(bonus);
    }

    cout << "\nEmployee Bonus Details:\n";
    cout << "---------------------------------------\n";
    cout << "Name\t\tSalary\t\tBonus\n";
    cout << "---------------------------------------\n";
    for (int i = 0; i < numberOfEmployees; i++) {
        cout << names[i] << "\t\t" << salaries[i] << "\t\t" << bonuses[i] << endl;
    }
    cout << "---------------------------------------\n";
    
    cout<<endl;
	cout<<"This code is created by: Emanuel Maverick G. Yasay";
    
    return 0;
}

