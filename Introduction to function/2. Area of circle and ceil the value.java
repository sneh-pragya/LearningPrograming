//You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.//
//return the ceil value of the area. Ceil value of a real number X is the smallest integer that is greater than or equal to X.

import java.lang.Math.*;
import java.util.*;
public class Solution {
    public int solve(int A) {
        double area = Math.ceil(Math.PI*A*A);
        return (int)area;
    }
}
