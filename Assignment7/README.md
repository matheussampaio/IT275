# ITK 275 – Java as a 2nd Language
## Chapter 7 Programming Assignment

**Grade	50.0 (max 50.0)**

All of the java classes should be placed in a package named `edu.iltu.itk275.assignment7.<your ulid>`.  The class should be submitted as an attachment to this assignment.  They may be submitted individually or placed into a single archive (.zip) file.

The following is some code designed by J. Hacker for a video game.  There is an `Alien` class to represent a monster and an `AlienPack` class that represents a band of aliens and how much damage they can inflict:

```java
public class Alien {

    public static final int SNAKE_ALIEN = 0;
    public static final int OGRE_ALIEN = 1;
    public static final int MARHSMALLOW_MAN_ALIEN = 2;

    public int type;  // Stores one of the three alien types
    public int health;  // 0=dead, 100=full strength
    public String name;  

    public Alien (int type, int health, String name) {
        this.type = type;
        this.health = health;
        this.name = name;  
    }
}
```

```java
public class AlienPack {

    private Alien[] aliens;

    public AlienPack (int nbrAliens) {
        aliens = new Alien[nbrAliens];
    }
    public void addAlien(Alien newAlien, int index) {
        aliens[index] = newAlien;
    }
    public Alien[] getAliens() {
        return aliens;
    }
    public int calculateDamage() {
        int damage=0;
        for (Alien thisAlien: aliens) {
            if (thisAlien.type == Alien.SNAKE_ALIEN) {
                damage += 10;
            } else if (thisAlien.type == Alien.OGRE_ALIEN) {
                damage += 6;
            } else if (thisAlien.type == Alien.MARHSMALLOW_MAN_ALIEN){
                damage += 1;
            }
        }
        return damage;  
    }
}
```

The code is not very object oriented and does not support information hiding in the `Alien` class.  Rewrite the code so that inheritance is used to represent the different types of aliens instead of the “type” attribute.  This should result in deletion of the “type” attribute.  Also, rewrite the `Alien` class to hide the instance variables and create a `getDamage` method for each derived class that returns the amount of damage the alien inflicts.  Finally, rewrite the `calculateDamage` method to use `getDamage` and write a main method that tests the code.  

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
