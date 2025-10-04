//MP8.cpp
#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
    int counter = 0; 
    
    cout << left << setw(10) << "NUMBER" 
         << setw(10) << "SQUARE" 
         << setw(15) << "SQUARE ROOT" 
         << setw(15) << "FOURTH POWER" << endl;

    while (counter <= 25) {
        cout << setw(10) << counter 
             << setw(10) << counter * counter 
             << setw(15) << fixed << setprecision(2) << sqrt(counter) 
             << setw(15) << pow(counter, 4) << endl;

        counter++; 
    }

    return 0;
}
