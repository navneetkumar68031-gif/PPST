#include <iostream>
using namespace std;

int main() {
    int num, original, reverse = 0, digit;

    cout << "Enter a number: ";
    cin >> num;

    original = num;

    while(num != 0) {
        digit = num % 10;          // get last digit
        reverse = reverse * 10 + digit; // build reverse
        num = num / 10;           // remove last digit
    }

    if(original == reverse)
        cout << original << " is a Palindrome number";
    else
        cout << original << " is NOT a Palindrome number";

    return 0;
}
