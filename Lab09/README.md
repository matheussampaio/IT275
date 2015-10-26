# Lab 09
## File IO

*The following exercises are to be completed during lab class.  If you do not have time to finish during lab, they must be completed before the beginning of the following lab session.*


### Set-Up
* Create a new project in your Eclipse workspace named:  Lab09
* In the src folder, create a package named:  edu.ilstu.it275.lab09.<ulid>
* Import the input file, Collection.txt, into the root of your project.

### Problem
You will be writing a program to read a list of Songs from a file and display them to the screen.  

**Class diagram and main algorithm**

| Song |
| :- |
| `- title: String`<br>`- artist: String` |
| `+ Song(String title, String artist)`<br>`+ toString( ): String`<br><br>`all getters and setters`|

```
main algorithm

    OPEN input file

    WHILE (not end of file)
         Read Song object data
        Create Song object
        PRINT Song object
    END WHILE

    CLOSE input file
END MAIN
```

**Processing Instructions (write the code in this order) – use the comments in the program to help with placement.**

1. Create the new class called `Song.java` using the given class diagram.
  * There is no default constructor, only the one sending in both title and artist.
  * `toString` - define it so that it prints in the form:  title by artist

2. Create the new class called `FileSong.java`.  Open the file, read the input data from the file, create a Song object for each one, print the song object to the screen.  When done, close the file.  Remember to use a try/catch when attempting to open the file
