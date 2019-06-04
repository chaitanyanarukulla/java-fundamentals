# Labs

## Lab 1 | Array Reverse
### Challenges
Reverse an Array

## Lab 2 | Arrays, Loops, Imports, ArrayLists

### Challenges
  - Roll
    - roll a dice n number of times, return array of that length
  - Contains Duplicates
    - iterate through array to determine if the array contains duplicates
  - Averages
    - iterate through array, calculating total sum and dividing by length of array to obtain average
  - Lowest Average
    - iterate through array of arrays to find which array has the lowest average

## Lab 3 |  Maps, File I/O, and Testing

### Challenges

- Analyzing Weather Data using HashSet
- Tallying Election using List
- linter   Method that reads a JavaScript file with a given Path, and prints an error whenever it finds a line that doesn’t end in a semi-colon.


## Lab 6 |  inheritance Vs Interfaces

### Challenges

- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
Implement a Restaurant constructor.
Test that your Restaurant constructor is behaving reasonably.
Implement a reasonable toString method for Restaurants.
Write a test to create an instance of Restaurant and ensure that its toString is working properly.
- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
Write a Review constructor.
Test that your constructor is working reasonably.
Implement a reasonable toString method for Reviews.
Write a test to create an instance of Review and ensure that its toString is working properly.
- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.


```
└── java-fundamentals
├── LICENSE
├── README.md
├── basiclibrary
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── out
│   │   ├── production
│   │   │   └── classes
│   │   │       └── basiclibrary
│   │   │           ├── Library.class
│   │   │           ├── lab2.class
│   │   │           └── lab3.class
│   │   └── test
│   │       └── classes
│   │           └── basiclibrary
│   │               ├── LibraryTest.class
│   │               ├── lab2Test.class
│   │               └── lab3Test.class
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── basiclibrary
│       │   │       ├── Library.java
│       │   │       ├── lab2.java
│       │   │       ├── lab3.java
│       │   │       └── roll.java
│       │   └── resources
│       └── test
│           ├── java
│           │   └── basiclibrary
│           │       ├── LibraryTest.java
│           │       ├── lab2Test.java
│           │       └── lab3Test.java
│           └── resources
├── basics
│   ├── Main.class
│   └── Main.java
├── inheritance
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── inheritance
│       │   │       ├── Library.java
│       │   │       ├── Restaurant.java
│       │   │       └── Review.java
│       │   └── resources
│       └── test
│           ├── java
│           │   └── inheritance
│           │       ├── LibraryTest.java
│           │       └── RestaurantTest.java
│           └── resources
└── linter
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── out
    │   ├── production
    │   │   └── classes
    │   │       └── linter
    │   │           └── App.class
    │   └── test
    │       └── classes
    │           └── linter
    │               └── AppTest.class
    ├── resources
    │   └── gates.js
    ├── settings.gradle
    └── src
        ├── main
        │   ├── java
        │   │   └── linter
        │   │       └── App.java
        │   └── resources
        └── test
            ├── java
            │   └── linter
            │       └── AppTest.java
            └── resources

```
