    // name
    // hobbies
    // roll no.
// }
// maria
// harry


// class Rational {
//     // n
//     // d
//     // gcd
// }
//     // 3/4
//     // 100 / 20

// 100 / 20 ------ i know for sure that i will need to simplify this fraction in future... Why should i store this object as 100 / 20 ?
//  5 / 1

// 100     10        5
// ___ ==> ___ ===> ___, Constructor: Creates object [ assigns the values to the object ]
// 20       2        1



public class Rational{

    private int numerator;
    private int denominator;


    // Constructor: Creates objects...
    public Rational(int n, int d){

        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be 0");
        }

        if (denominator < 0){
            numerator = -n;
            denominator = -d;
        }

        int gcd = calGCD(numerator, denominator);
        this.numerator = n / gcd;
        this.denominator = d / gcd;
    }  


    // Getter 
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }




    public Rational add(Rational other) {
        int newDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        //                      1 * 3 + 1 * 2 ====> 5

        // 1/4 + 1/6            1 * 6 + 1 * 4 ===> 10

        // 10/24 ------------------> 5/12

        Rational newRational = new Rational(newNumerator, newDenominator);
        return newRational;
    }

    // Purpose of add method,  x + y ---> z
    

    public int calGCD(int m, int n){
        return 0;
    }
}



// x   + y         ====> new Rational

// 3/4 + Rational  ====> solution
    //  rational             // rational
// 3/4 + 5/1 ================> solution

// 1 / 2 +  1 / 3

// 1 / 4 + 1 / 6 




// class Apples ----> kashmir apple / normal apple / pink apple

// // sweetness / // sour / raw / bad

// apple + input / parameter (apple object) -----> new apple object


    // n = 100, d = 30
    // rational ---> simplified fraction
    // 100 / 30 -----gcd / hcf 10-------> 10 / 3



// rational numbers: 3/2, 4/5, 4/1

// 3 numerator

// 2 denominator

// R = a/b

// b != 0

// 6/8 ---> common divisor? 2

// 9/3 ---> common divisor? 3 ---> 3/1

// -9/3 ---> common divisor? 3 ---> -3/1

// some algorithm or method to calculate the common divisor...

// lcm & hcf / gcd

// p x q = lcm x hcf

// gcd ----> 

//      10   5
// 2     5   5
// 5     1   1

// lcm of 10, 18 & 20 ?
// u always start from the smallest number
    // 2   | 10      18       20
    // 2   | 5       9        10
    // 3   | 5       9         5 // smallest number that divides any of those values cleanely?
    // 3   | 5       3         5
    // 5   | 5       1         5
        // | 1       1         1

    // 2 x 2 x 3 x 3 x 5 ---> 180


// GCD of 10 , 18 , 20 ?

// 10 -> 2 x 5
// 18 -> 2 x 3 x 3
// 20 -> 2 x 2 x 5

// GCD of 5, 2 ?
// 5 -> 5 x 1
// 2 -> 2 x 1

// Eucilidean alogrithm
// 5. q + r
// q -> quotient
// r -> remainder
// lhs  rhs

// 5 = 2.q + r
// 5 = 2.2 + 1

// 2 = 1.q + r
// 2 = 1.1 + 0

// 1 = 0.q + r




//      2  |  20
    //  2  |  10
    //  5  |   5


    // clean division, when there is no remainder left
    
        // ____2__________
    // 2 |  4       |
    //      4
    //      0 // is this a clean division? Maria says Yess.... ✨



//    method "add" which takes a rational number value and which returns 
// a rational number value which is the sum of this rational number and the given 
// rational number. 

    // 4 --> integer
    // 4.1 --> float
    // "madhur" --> String
    // 'a' ---> char
    // true ---> boolean




// public class Rational
// {

// public Rational add(Rational)
// {

// }

// public int getNumerator()
// {

// }

// public int getDenominator()
// {

// }

// public Rational sub(Rational)
// {

// }

// public Rational mul(Rational)
// {

// }

// public Rational div(Rational)
// {

// }

// public boolean equals(Rational)
// {

// }

// public boolean isLessThan(Rational)
// {

// }

// public Rational simplify()
// {

// }

// public String toString()
// {

// }

// public static void main(String[] args)
// {

// }
