/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseThree;

/**
 *
 * @author AldyAkbarrizky
 */
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
//-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("The argument is a negative number.");
        } else if (n > 16) {
            throw new IllegalArgumentException("The argument is too big, it should be less than 17.");
        } else {
            int fac = 1;
            for (int i = n; i > 0; i--) {
                fac *= i;
            }
            return fac;
        }
    }
}
