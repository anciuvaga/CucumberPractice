 **Cucumber Practice project creation purpose is to get acquainted with latest implementation of cucumber 6**

**_**Technical Information:**_**

**1. Regular Expressions**

Two types of Reg Exp in Cucumber:

1. Reg Exp --> [0-9]+ , (\\d+)
2. Cucumber Exp (2017)

rules:
1. Step def file will be generating cucumber exp by default
2. But you can use regular exp also in step def file
3. You can mix both regular exp and cucumber exp in step definition method
4. But you can not mix both exps in a step definition method

Regex Examples:
([0-9]) -> capture group --> 0 to 9 digits appear (once or more then once)

Quantifiers in Reg Exp: + * ? {n}
Define -> How many times a character needs to be occured

([0-9]+) -> 0 to 9 digits appear (once or more)
([0-9]{4}) -> 0000, 9999, 1215
([0-9]*) -> zero or more
([0-9]?) ? zero or once


Short hand characters:

\d -- numeric digits
(\d+)

([a-zA-F])

2. Tags
   Usage
  1. tags = "@Smoke and @Regression or @Prod"
  2. tags = "@Smoke or @Regression or @Prod"
  3. tags = "not @Prod"

execute from maven : maven test
to filter out using maven: mvn test -Dcucumber.filter.tags="@Smoke or @Regression"
