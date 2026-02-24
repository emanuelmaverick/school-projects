//MP8.1.cpp
#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    cout << setw(5) << " " << " |";
    for (int i = 1; i <= 10; ++i) {
        cout << setw(5) << i;
    }
    cout << endl;

    cout << string(6, '-') << "+" << string(5 * 10, '-') << endl;

    for (int row = 1; row <= 10; ++row) {
        cout << setw(5) << row << " |"; 
        for (int col = 1; col <= 10; ++col) {
            cout << setw(5) << row * col;
        }
        cout << endl;
    }

    return 0;
}
