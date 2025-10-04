//ODD SMALLEST.cpp
#include <iostream>
using namespace std;

int main() {
    int n, counter, number, smallestOdd;
    bool foundOdd;

    cout << "\t\tODD\n" << endl;

    cout << "Input Positive Integer Number: ";
    cin >> n;

    smallestOdd = INT_MAX;  
    foundOdd = false;

    counter = 0;

    while (counter < n) {
        cin >> number;
        
        if (number % 2 != 0 && number != 0) {
            if (number < smallestOdd) {
                smallestOdd = number;
            }
            foundOdd = true;
        }
        
        counter++;
    }

    if (foundOdd) {
        cout << "The Smallest Odd Number is: " << smallestOdd << endl;
    } else {
        cout << "No Odd Numbers Entered." << endl;
    }
    
    cout << endl;
    cout << "This code is created by: Emanuel Maverick G. Yasay" << endl;

    return 0;
}

