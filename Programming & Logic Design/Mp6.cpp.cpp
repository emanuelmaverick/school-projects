//MP6.cpp
#include <iostream>

using namespace std;

int main() {
    int n;
    int sum = 0;
    int counter = 1; 

    cout << "Input a number: ";
    cin >> n;

    while (counter <= n) {
        sum += counter * counter; 
        counter++;  
    }

    cout << "The sum of the square of the number is: " << sum << endl;

    return 0;
}

