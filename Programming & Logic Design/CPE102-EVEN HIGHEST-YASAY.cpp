//EVEN HIGHEST.cpp
#include <iostream>
using namespace std;

int main() {
    int n, counter, number, smallestEven;
    bool foundEven;

    cout << "\tEVEN\n" << endl;

    cout << "Input Positive Integer Number: ";
    cin >> n;

    smallestEven = INT_MAX;
    foundEven = false;

    counter = 0;

    while (counter < n) {
        cin >> number;
        
        if (number % 2 == 0 && number != 0) {
            if (number < smallestEven) {
                smallestEven = number;
            }
            foundEven = true;
        }
        
        counter++;
    }

    if (foundEven) {
        cout << "The Smallest Even Number is: " << smallestEven << endl;
    } else {
        cout << "No Even Numbers Entered." << endl;
    }

    return 0;
}

