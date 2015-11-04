# ITK 275 – Java as a 2nd Language
## Chapter 10 Programming Assignment


All of the java classes should be placed in a package named `edu.iltu.itk275.assignment10.<your ulid>`.  The class should be submitted as an attachment to this assignment.  They may be submitted individually or placed into a single archive (.zip) file.

The text files `boynames.txt` and `girlnames.txt` contain a list of the 1,000 most popular boy and girl names in the U.S. for the year 2003 as compiled by the Social Security Administration.

These are blank delimited where the most popular name is listed first, the second most popular name is listed second, and so on, to the 1,000th most popular name, which is listed last.  Each line consists of the first name followed by a blank space and then the number of registered births using that name in the year.  For example, the `girlnames.txt` file begins with

```
Emily 25494
Emma 22532
Madison 19986
```

This indicates that `Emily` was the most popular name with `25,494` registered namings, `Emma` was the second most popular with `22,532`, and `Madison` was the third most popular with `19,986`.  

Write an application that reads both the boy and girl files into memory using arrays. Then, allow the user to input a name.  The application should search through both arrays.  If there is a match, then it should output the popularity ranking and the number of namings.  The application should also indicate if there is no match.

For example, if the user enters the name `Justice`, then the application should output

```
Justice is ranked 456 in popularity among girls with 655 girls receiving the name
Justice is ranked 401 in popularity among boys with 653 boys receiving the name
```

If the user enters the name `Walter`, then the application should output

```
Walter is not ranked among the top 1,000 girl names
Walter is ranked 356 in popularity among boys with 775 boys receiving the name
```
