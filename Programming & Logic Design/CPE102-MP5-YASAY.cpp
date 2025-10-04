//MP5.cpp
#include <iostream>
#include <limits>  // For std::numeric_limits

using namespace std;

int main() {
    float number;
    float sum = 0.0;
    float min = std::numeric_limits<float>::infinity();
    float max = -std::numeric_limits<float>::infinity();
    int count = 0;

    cout << "Enter positive float values. Enter a negative integer to end input." << endl;

    while (true) {
        cout << "Enter a value: ";
        cin >> number;

        if (number < 0 && number == static_cast<int>(number)) {
            break;
        }

        if (number > 0) {
            sum += number;
            if (number < min) min = number;
            if (number > max) max = number;
            count++;
        }
    }

    if (count == 0) {
        cout << "No data has been entered." << endl;
    } else {
        cout << "Minimum value entered: " << min << endl;
        cout << "Maximum value entered: " << max << endl;
        cout << "Average of the values entered: " << sum / count << endl;
    }

    return 0;
}

