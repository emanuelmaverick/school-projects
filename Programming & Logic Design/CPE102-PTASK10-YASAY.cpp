//PTASK10.cpp
#include <iostream>
using namespace std;

void checkNumber(int number) {
    if (number < 0) {
        cout << "The number is negative." << endl;
    } else {
        if (number >= 0 && number <= 9) {
            cout << "Number read is less than 10" << endl;
        } else if (number == 10) {
            cout << "Number read is 10" << endl;
        } else if (number >= 11 && number <= 99) {
            cout << "Number read is greater than 10" << endl;
        } else if (number == 100) {
            cout << "Number read is 100" << endl;
        } else if (number >= 101) {
            cout << "Number read is greater than 100" << endl;
        }
    }
}

int main ()
{   
    int number;
    
    cout << "Enter a number: ";
    cin >> number;
    
    checkNumber(number);
    
    cout << endl;
    cout << "This code is created by: Emanuel Maverick G. Yasay" << endl;
    
    return 0;
}
