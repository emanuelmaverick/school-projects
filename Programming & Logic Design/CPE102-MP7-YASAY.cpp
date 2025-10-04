//MP7.cpp
#include <iostream>

using namespace std;

int main() {
    int n;
    long long factorial = 1; 
    int counter = 1; 

    cout << "Input a number: ";
    cin >> n;

    if (n < 0) {
        cout << "Factorial is not defined for negative numbers." << endl;
    } else {
        while (counter <= n) {
            factorial *= counter; 
            counter++; 
        }

        cout << "The factorial value is: " << factorial << endl;
    }

    return 0;
}

