# ITK 275 – Java as a 2nd Language
## Chapter 9 Programming Assignment


All of the java classes should be placed in a package named `edu.iltu.itk275.assignment9.<your ulid>`.  The class should be submitted as an attachment to this assignment.  They may be submitted individually or placed into a single archive (.zip) file.

Write an application that converts dates from numerical month / day / year format to normal “month day year” format (for example, 12/25/2000 corresponds to December 25, 2000).  You will define three exception classes; `MonthException`, `DayException`, and `YearException`.  If the user enters anything other than a legal month number (integers from 1 to 12) the application will throw and catch a `MonthException` and ask the user to reenter the month.  Similarly, if the user enters anything other than a valid day number (integers from 1 to either 28, 29, 30 or 31, depending on the month and year), then the application will throw and catch a `DayException` and ask the user to re-enter the day.  If the user enters a year that is not in the range 1000 to 3000 (inclusive), then the application will throw and catch a `YearException` and ask the user to re-enter the year.  
