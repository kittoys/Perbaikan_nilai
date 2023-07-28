#include <bits/stdc++.h>
using namespace std;

/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

#include <iostream>
#include <vector>
using namespace std;

int hourglassSum(vector<vector<int>>& arr) {
    int maxSum = INT_MIN;
    for (int i = 0; i <= 3; i++) {
        for (int j = 0; j <= 3; j++) {
            int sum = 0;
            // Top part of the hourglass
            sum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
            // Middle part of the hourglass
            sum += arr[i + 1][j + 1];
            // Bottom part of the hourglass
            sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
            
            maxSum = max(maxSum, sum);
        }
    }
    return maxSum;
}

int main() {
    vector<vector<int>> arr(6, vector<int>(6));

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            cin >> arr[i][j]; // Read the array elements
        }
    }

    int result = hourglassSum(arr);
    cout << result << endl; // Print the maximum hourglass sum

    return 0;
}
