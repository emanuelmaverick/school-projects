//CSTUDY1.cpp
#include <iostream>
using namespace std;

int main() {
    int num;

    cout << "Input three digit number [0-999]: ";
    cin >> num;

    if (num < 0 || num > 999) {
        cout << "Invalid input. Number is out of range." << endl;
        return 0;
    }

    int hundreds = num / 100;
    int tens = (num % 100) / 10;
    int ones = num % 10;

    cout << "The number is read as: ";

    switch (hundreds) {
        case 1: cout << "One hundred"; break;
        case 2: cout << "Two hundred"; break;
        case 3: cout << "Three hundred"; break;
        case 4: cout << "Four hundred"; break;
        case 5: cout << "Five hundred"; break;
        case 6: cout << "Six hundred"; break;
        case 7: cout << "Seven hundred"; break;
        case 8: cout << "Eight hundred"; break;
        case 9: cout << "Nine hundred"; break;
    }

    if (tens == 1) {
        switch (ones) {
            case 0: cout << " ten"; break;
            case 1: cout << " eleven"; break;
            case 2: cout << " twelve"; break;
            case 3: cout << " thirteen"; break;
            case 4: cout << " fourteen"; break;
            case 5: cout << " fifteen"; break;
            case 6: cout << " sixteen"; break;
            case 7: cout << " seventeen"; break;
            case 8: cout << " eighteen"; break;
            case 9: cout << " nineteen"; break;
        }
    } else {
        switch (tens) {
            case 2: cout << " twenty"; break;
            case 3: cout << " thirty"; break;
            case 4: cout << " forty"; break;
            case 5: cout << " fifty"; break;
            case 6: cout << " sixty"; break;
            case 7: cout << " seventy"; break;
            case 8: cout << " eighty"; break;
            case 9: cout << " ninety"; break;
        }

        if (tens != 1 && ones != 0) {
            switch (ones) {
                case 1: cout << "-one"; break;
                case 2: cout << "-two"; break;
                case 3: cout << "-three"; break;
                case 4: cout << "-four"; break;
                case 5: cout << "-five"; break;
                case 6: cout << "-six"; break;
                case 7: cout << "-seven"; break;
                case 8: cout << "-eight"; break;
                case 9: cout << "-nine"; break;
            }
        }
    }

    cout << endl;
    
    cout << endl;
    cout << "This code is created by: Emanuel Maverick G. Yasay" << endl;
    
    return 0;
}

