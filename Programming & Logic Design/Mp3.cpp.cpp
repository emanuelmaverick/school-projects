//MP3.cpp
#include <iostream>
using namespace std;
int main ()
{
	cout << "This program coverts temperature from Fahrenheit to Celcius" << endl;

    float fahrenheit, celsius =0;
    cout<<endl;

    cout << "Input temperature in Fahrenheit: ";
    cin >> fahrenheit;

    celsius = 5.0 / 9.0 * (fahrenheit - 32);
    cout.setf(ios::fixed);
	cout.precision(2);

    cout << "The converted temperature in Celsius is: " << celsius << (char)248 << "C" << endl;
	
	cout<<endl;
	cout<<"This code is created by: Emanuel Maverick G. Yasay";
	
	return 0;
}

