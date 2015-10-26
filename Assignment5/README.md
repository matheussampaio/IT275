# ITK 275 – Java as a 2nd Language
## Chapter 5 Programming Assignment

**Grade	50.0 (max 50.0)**

All of the java classes should be placed in a package named `edu.iltu.itk275.assignment5.<your ulid>`.  The class should be submitted as an attachment to this assignment.  They may be submitted individually or placed into a single archive (.zip) file.

In the land of Puzzlevania, Aaron, Bob, and Charlie had an argument over which one of them was the greatest puzzler of all time.  To end the argument once and for all, they agreed on a duel to the death.  Aaron was a poor shooter and only hit his target with a probability of 1/3.  Bob was a bit better and hit his target with a probability of ½.  Charlie was an expert marksman and never missed.  A hit means a kill and the person hit drops out of the duel.  

To compensate for the inequities in their marksmanship skills, the three decided that they would fire in turns, starting with Aaron, followed by Bob, and then by Charlie.  The cycle would repeat until there was one man standing, and that man would be the Greatest Puzzler of All Time.

An obvious and reasonable strategy is for each man to shoot at the most accurate shooter still alive, on the grounds this shooter is the deadliest and has the best chance of hitting back.  

Write a Java application to simulate the duel using this strategy.  Your application should use random numbers and the probabilities given in the problem to determine whether a shooter hits the target.  Create a class named `Dueler` that contains the dueler’s name and shooting accuracy, a boolean indicating whether the dueler is still alive and a method `shootAtTarget(Dueler target)` that sets the target to dead if the dueler hits his target (using a random number and the shooting accuracy) and does nothing otherwise.  

Once you can simulate a single duel, add a loop to your application that simulates 1,000 duels.  Count the number of times that each contestant wins and prints the probability of winning for each contestant (ie., for Aaron, your application might output “Aaron won 395/1,000 duels or 39.5%”).

An alternative strategy is for Aaron to intentionally miss on his first shot.  Modify the application to accommodate this new strategy (while retaining the original strategy) and output the probability of winning for each contestant by strategy used.  

Which strategy is better for Aaron: to intentionally miss on the first shot or to try and hit the best shooter?  

Who has the best chance of winning the best shooter or the worst shooter?  

### Additional instructor's comments about your submission

Program is free from compile errors  
2.5 / 2.5

Program contains adequate comments  
2.5 / 2.5

Program follows Java best practices for names (method, variables, and classes) and structure  
2.5 / 2.5

Program code is well formatted and readable  
2.5 / 2.5

Program is not submitted late  
5 / 5

Program will run with normal data without an Exception or Error being thrown.  
5 / 5

Program achieves assignment objectives  
30 / 30

Total 50 / 50
