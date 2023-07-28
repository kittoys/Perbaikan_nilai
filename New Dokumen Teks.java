#include <bits/stdc++.h>
using namespace std;

/*
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts vector<int> ar as parameter.
 */


int simpleArraySum(vector<int> ar) {
    int sum = 0;
    for (int i = 0; i < ar.size(); i++) {
        sum += ar[i];
    }
    return sum;
}

int main() {
    int n;
    cin >> n; // Read the size of the array

    vector<int> ar(n);
    for (int i = 0; i < n; i++) {
        cin >> ar[i]; // Read the array elements
    }

    int result = simpleArraySum(ar);
    cout << result << endl; // Print the sum of the array elements

    return 0;
}
