// PTASK13.cpp
#include <iostream>
#include <cctype>
#define PI 3.14159

int main() {
    double radius;
    char choice;

    std::cout << "Enter the value: ";
    if (!(std::cin >> radius)) {
        std::cout << "Invalid input for radius. Please enter a number." << std::endl;
        return 1; // Exit the program if the input is invalid
    }

    std::cout.setf(std::ios::fixed);
    std::cout.precision(2);

    std::cout << "Choose an option:\n";
    std::cout << "'C' or 'c' for Circumference\n";
    std::cout << "'A' or 'a' for Area\n";
    std::cout << "'D' or 'd' for Diameter\n";
    std::cout << "Input Letter: " << std::flush;
    std::cin >> choice;

    choice = std::tolower(choice);

    switch (choice) {
        case 'c':
            std::cout << "The Circumference is: " << 2 * PI * radius << std::endl;
            break;
        case 'a':
            std::cout << "The Area is: " << PI * radius * radius << std::endl;
            break;
        case 'd':
            std::cout << "The Diameter is: " << 2 * radius << std::endl;
            break;
        default:
            std::cout << "Invalid choice. Please enter C, A, or D." << std::endl;
    }

    std::cout << "\nThis code is created by: Emanuel Maverick G. Yasay" << std::endl;

    return 0;
}

