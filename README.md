* [TUM_LearnJava_ExSheet3](#TUM_LearnJava_ExSheet3)
* [Primverquerung](#Primverquerung)

# TUM_LearnJava_ExSheet3

Prime numbers calculator. Letter case changing.

# Primverquerung

A java class that calculate for one number n the sum of that prime nimbers p<n the cross sum of which is even. If n<0 returns 0. Testing of the methode in main-methode

# Stringulina

This class contents four methodes:

## substringPos

Searches for one string 'needle' inside another string 'haystack' and returns the first possible start position. If 'needle' is not found -1 is returned

## countSubstring

Calculates how many times is there 'needle' in the 'haystack' appears. For example, substring 'aa' appears inside strin 'aaaa' 3 times.

## correctlyBracketed

Checkes if a given string 'str' correctly bracketed is. Each opened bracket has to have closed one after it and vise versa. If the string is bracketed correctly the methode returns true, otherwise - false.
For example:
– "a(xx(]))" correct
– "a(xx))" not correct
– "a(xx)(" not correct 
– "a)xx()(" not correct

## matches

Checks if a String 'str' which consisted of letters (a-z and A-Z), passes to a pattren 'pattern'. A pattern along with letters can have a special constructs:

1. '.' mathces with any letter
2. after a letter or the dot one can give a quntity in the {}. 
For example:
- The Pattern "P.{2}ngui{1}." passes for instance to the String "Pijnguin".
– The Pattern "Ha{10}..o" passes for instance to the Strin "Haaaaaaaaaawko", but to "Haaawko".



