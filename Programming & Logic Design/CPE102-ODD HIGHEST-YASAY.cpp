//ODD HIGHEST.cpp
#include <iostream>
using namespace std;

int main() {
    int n, counter, number, highestOdd;
    bool foundOdd;

    cout << "\t\tODD\n" << endl;

    cout << "Input Positive Integer Number: ";
    cin >> n;

    highestOdd = -1;
    foundOdd = false;

    counter = 0;

    while (counter < n) {
        cin >> number;
        
        if (number % 2 != 0 && number != 0) {
            if (number > highestOdd) {
                highestOdd = number;
            }
            foundOdd = true;
        }
        
        counter++;
    }

    if (foundOdd) {
        cout << "The Highest Odd Number is: " << highestOdd << endl;
    } else {
        cout << "No Odd Numbers Entered." << endl;
    }
    
    cout << endl;
    cout << "This code is created by: Emanuel Maverick G. Yasay" << endl;

    return 0;
}

