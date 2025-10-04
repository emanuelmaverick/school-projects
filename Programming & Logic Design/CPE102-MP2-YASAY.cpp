//MP2.cpp
#include <iostream>
#include <cmath>
using namespace std;
int main ()
{
	cout << "This program computes the surface area and volume of a sphere" << endl;

    const float PI = 3.1416;

    float radius;
    cout << endl;

    cout << "Input radius (in cm): ";
    cin >> radius;

    float surfaceArea = 4 * PI * pow(radius, 2);
    float volume = (4.0/3.0) * PI * pow(radius, 3);
    cout.setf(ios::fixed);
	cout.precision(2);

    cout << "The surface area of the radius is: " << surfaceArea << " cm^2" << endl;
    cout << "The volume of the radius is: " << volume << " cm^3" << endl;
	
	cout<<endl;
	cout<<"This code is created by: Emanuel Maverick G. Yasay";
	
	return 0;
}

