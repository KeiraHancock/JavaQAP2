# Java QAP2 – Class Design & Testing Assignment
## Author: Keira Hancock

This project contains solutions to three object-oriented programming problems using Java. Each section demonstrates class creation, composition, and aggregation using constructors, accessors, mutators, and test drivers.

---

##  Contents

###  Problem #1: `MyLine` and `MyPoint` Classes
- **Files:** `MyPoint.java`, `MyLine.java`, `TestMyLine.java`
- **Concepts:** Object composition, getters/setters, distance and gradient calculation
- **Tested in:** `TestMyLine.java`

---

###  Problem #2: `MyRectangle` and `MyPoint` Classes
- **Files:** `MyRectangle.java`, `TestMyRectangle.java`
- **Concepts:** Using two `MyPoint` instances to represent rectangle corners
- **Includes methods:** Width, Height, Area, Perimeter
- **Tested in:** `TestMyRectangle.java`

---

###  Problem #3: `CreditCard`, `Money`, `Person`, and `Address` Classes
- **Files:** `CreditCard.java`, `Money.java`, `Person.java`, `Address.java`, `CreditCardDemo.java`
- **Concepts:** Aggregation, copy constructors, comparison methods, balance/credit tracking
- **Tested in:** `CreditCardDemo.java`

---

##  How to Run

In terminal:

```bash
javac *.java
java TestMyLine
java TestMyRectangle
java CreditCardDemo
