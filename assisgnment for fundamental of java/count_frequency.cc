vector<int> Solution::solve(vector<int> &A) {
    unordered_map<int,int> h;
    for(int &x:A) {
        h[x-1]++;
    }
    for(int i = 0; i < A.size();i++) {
        A[i] = h[A[i]-1];
    }
    return A;
}