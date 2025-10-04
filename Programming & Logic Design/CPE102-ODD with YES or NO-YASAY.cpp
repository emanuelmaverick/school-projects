//EVEN Y/N.cpp
#include <iostream>
#include <limits> 
using namespace std;

int main() {
    int n, counter, number, smallestOdd;
    bool foundOdd;
    char choice;

    do {
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

        cout << "Would you like to continue? (y/n): ";
        cin >> choice;

        cin.ignore(numeric_limits<streamsize>::max(), '\n'); 

    } while (choice == 'y' || choice == 'Y'); 

    cout << "Goodbye!" << endl;

    return 0;
}

