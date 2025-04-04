//Using Recursion :-

#include <iostream>  
#include <climits>   

using namespace std;

int f(int arr[], int i, int j) {
    if (i == j) {
        return 0;
    }
    
    int mini = INT_MAX;
    
    
    for (int k = i; k < j; k++) {
        int ans = f(arr, i, k) + f(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
        mini = min(mini, ans);
    }
    
    return mini;
}

int matrixMultiplication(int arr[], int N) {
    int i = 1;
    int j = N - 1;
    return f(arr, i, j);
}

int main() {
    int arr[] = {10, 20, 30, 40, 50}; 
    int n = sizeof(arr) / sizeof(arr[0]);  

    cout << "The minimum number of operations is " << matrixMultiplication(arr, n) << endl;
    
    return 0;
}


//Notes :- 
// Matrix Chain Multiplication is an algorithm that is applied to determine the lowest cost way for multiplying matrices.
//Suppose there is a matrix of order (n*m)  and (m*q)
    // Multiplication possible if:- Coloumn of matrix 1 = Row of matrix 2 (m=m)
    // Order of new result matrix :- n*q
    // Total number of multiplication :- n*m*q (Cost)

    //Forumla = m[i,j] = (k=i to j-1) min { m[i.k]+m[k+1,j]+di-1*dk*dj }

