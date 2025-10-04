//SW4.cpp
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float Quiz1, Quiz2;
    float Average = 0.00;

    cout << "Input First Quiz: ";cin >> Quiz1;
    cout << "Input Second Quiz: ";cin >> Quiz2;
    cout.setf(ios::fixed);
    cout.precision(2);
    Average = (Quiz1 + Quiz2) / 2;
    cout << "The Average is: " << Average << endl;
    if (Average >= 97.00) {
        cout << "Grade is 1.00" << endl;
    } else if (Average >= 94.00) {
        cout << "Grade is 1.25" << endl;
    } else if (Average >= 91.00) {
        cout << "Grade is 1.50" << endl;
    } else if (Average >= 88.00) {
        cout << "Grade is 1.75" << endl;
    } else if (Average >= 85.00) {
        cout << "Grade is 2.00" << endl;
    } else if (Average >= 83.00) {
        cout << "Grade is 2.25" << endl;
    } else if (Average >= 80.00) {
        cout << "Grade is 2.50" << endl;
    } else if (Average >= 78.00) {
        cout << "Grade is 2.75" << endl;
    } else if (Average >= 75.00) {
        cout << "Grade is 3.00" << endl;
    } else if (Average >= 70.00) {
        cout << "Grade is 4.00" << endl;
    } else if (Average >= 50.00) {
        cout << "Grade is 5.00" << endl;
    }
    return 0;
    
}

