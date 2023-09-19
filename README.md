# CONVOLUTION_IN_JAVA

The logic of the code is simple, let us consider an example.

x = [1,2,3,4]
h = [1,1]

we add 1 zero (length of h - 1) at the end of x, another one 0 at the beginning of x.
Now we use a while loop and for loop to multiply the integers according to convolution theory.

0 1 2 3 4 0
1 1
-----------
0 1 ----------> 1
0 1 2 3 4 0
  1 1 
-----------
  1 2 ---------> 3
0 1 2 3 4 0
    1 1
-----------
    2 3 --------> 5
0 1 2 3 4 0
      1 1
-----------
      3 4 -------> 7
0 1 2 3 4 0
        1 1
------------
        4 0 -----> 4

So, now the convolution of x=[1,2,3,4] and h = [1,1] is [1,3,5,7,4]

Thank you.
