//SW5.cpp
#include <iostream>
using namespace std;

int main() {
    char choice = 'y'; 
    while (choice == 'y' || choice == 'Y') {
        int multiplier;

        cout << "INPUT A MULTIPLIER: ";
        cin >> multiplier;

        for (int i = 1; i <= multiplier; ++i) { 
            for (int j = 1; j <= multiplier; ++j) { 
                cout << i * j << "\t"; 
            }
            cout << endl;
        }

        cout << "\nDo you want to generate another table? (y/n): ";
        cin >> choice;
    }

    cout << "Program exited. Goodbye!\n";

    cout<<endl;
    
	cout<<"This code is created by: Emanuel Maverick G. Yasay";
	
    return 0;
}
