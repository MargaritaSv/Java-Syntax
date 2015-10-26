# Java-Syntax

Homework: Java Syntax
This document defines homework assignments from the “Java Basics“ Course @ Software University. Please submit as homework a single zip / rar / 7z archive holding the solutions (source code) of all below described problems.


Problem 1.	Rectangle Area

Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area. Examples:
Input	Output
7 20	140
5 12	60


Problem 2.	Triangle Area

Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form a triangle, print "0" as result. Examples:
Input	Output		Input	Output		Input	Output
-5 10
25 30
60 15	575		53 18
56 23
24 27	86		1 1
2 2
3 3	0
This resource could help you: http://www.mathopenref.com/coordtrianglearea.html.


Problem 3.	Formatting Numbers

Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a floating-point c and prints them in 4 virtual columns on the console. Each column should have a width of 10 characters. The number a should be printed in hexadecimal, left aligned; then the number a should be printed in binary form, padded with zeroes, then the number b should be printed with 2 digits after the decimal point, right aligned; the number c should be printed with 3 digits after the decimal point, left aligned. Examples:
a	B	C	Result
254	11.6	0.5	|FE        |0011111110|     11.60|0.500     |
499	-0.5559	10000	|1F3       |0111110011|     -0.56|10000.000 |
0	3	-0.1234	|0         |0000000000|      3.00|-0.123    |
444	-7.5	7.5	|1BC       |0110111100|     -7.50|7.500     |



Problem 4.	Calculate expression

Write a program that reads three floating point numbers from the console and calculates their result with the following formulae: 
((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
Then calculate the difference between the average of the three numbers and the average of the two formulae. Average (a, b, c) – Average (f1, f2)
a	B	C	Result
5	2	3	F1 result: 6.45; F2 result: 8.00; Diff: 3.89
3.8	2.5	1.2	F1 result: 569.60; F2 result: 45.84; Diff: 305.22
1.25	1.22	  1.24	F1 result: 239530.27; F2 result: 1.00; Diff: 119764.40
3.21	1	2.1	F1 result: 2.33; F2 result: 4.85; Diff: 1.49
0	0	0	F1 result: NaN; F2 result: 1.00; Diff: NaN


Problem 5.	Convert from decimal system to base-7

Write a program that takes an integer number and converts it to base-7
Decimal	Base-7
10	13
7	10
123	234
1000	2626
1	1



Problem 6.	Convert from base-7 to decimal

Write a program that converts from a base-7 number to its decimal representation
Base-7	Decimal
13	10
10	7
234	123
2626	1000
1	1



Problem 7.	Randomize numbers from N to M

Write a program that takes as input two integers N and M, and randomizes the numbers between them. Note that M may be smaller than or equal to N.
N	M	Randomized (your output may be different : ))
13	10	10 12 13 11
10	20	12 13 20 10 11 18 15 17 14 19 16 
5	5	5



Problem 8.	*Odd and Even Pairs

You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive pairs and prints if both are odd/even or not. Note that the array length should also be an even number
Input	Output
1 2 3 4	1, 2 -> different
3, 4 -> different
2 8 11 15 3 2	2, 8 -> both are even
11, 15 -> both are odd
3, 2 -> different
1 8 11 1 2	Invalid length



Problem 9.	*Hit the Target

Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between 1 and 20, which, if added or subtracted, result in the target.
Target	Output
5	1 + 4 = 5
2 + 3 = 5
3 + 2 = 5
…
19 - 14 = 5
20 - 15 = 5
35	15 + 20 = 35
16 + 19 = 35
17 + 18 = 35
18 + 17 = 35
19 + 16 = 35
20 + 15 = 35
0	1 - 1 = 0
2 - 2 = 0
…
19 - 19 = 0
20 - 20 = 0



Problem 10.	 Extract words

Write a program that extracts words from a string. Words are sequences of characters that are at least two symbols long and consist only of English alphabet letters. Use regex.
Words	Output
Az&76sym&&samo&cvqt&lilav	Az sym samo cvqt lilav
Shoot18297the1231023dwarves!	Shoot the dwarves
1798No(*&Girls)*(09Allowed	No Girls Allowed



Problem 11.	 Starts and Ends With Capital Letter

Write a program that takes as input an array of strings are prints only the words that start and end with capital letter. Words are only strings that consist of English alphabet letters. Use regex.
Words	Output
GoshO blabla NqmaSm1saL KvoStaA	GoshO KvoStaA
AZ AK 47 RoBoT noWayouT	AZ AK RoBoT
DrakonI Navsekyde	DrakonI



Problem 12.	 Character Multiplier

Create a method that takes two strings as arguments and returns the sum of their character codes multiplied (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two characters. If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
Input	Output
Gosho Pesho	53253
123 522	7647
a aaaa	9700


Problem 13.	 Get First Odd or Even Elements

Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
Input	Output
1 2 3 4 5
Get 3 odd 	1 3 5
11 6 2 8 1 0
Get 8 even	6 2 8 0


Problem 14.	Magic exchangeable words

Write a method that takes as input two strings of equal length, and returns Boolean if they are exchangeable or not. Exchangeable are words where the characters in the first string can be replaced to get the second string. Example: egg and add are exchangeable, but aabbccbb and nnooppzz are not. (First bb corresponds to oo, but second bb corresponds to zz)
Input	Output
gosho hapka	True
aabbaa ddeedd	True
foo bar	false

