# Online Reservation System (Bus/Flight)

An online reservation system that allows users to view bus or flight schedules, select seats, and make reservations. Admin users can add or cancel trips via the admin panel.

---

## How It's Made:
**Tech used:** Java, Swing/JavaFX (UI), JUnit, Design Patterns (Factory, Strategy, Observer, Composite, Singleton, Iterator)

The system was developed as part of the **Advanced Object Oriented Programming** course at Ege University.  
Key features include:
- User registration and login system  
- Listing and querying available trips  
- Visual display of seat status  
- Creating and canceling reservations  
- Admin panel for adding and removing trips  

To ensure flexibility and extensibility, multiple design patterns were applied:
- **Factory Pattern** → For creating different types of users (Admin, Passenger)  
- **Strategy Pattern** → For handling different reservation strategies  
- **Observer Pattern** → To update seat availability dynamically  
- **Singleton, Adapter, Iterator** → As part of the design requirements  

Additionally, unit tests for selected modules were implemented using **JUnit** to ensure code reliability.

---

## Optimizations
- Implemented design patterns to make the system more scalable and maintainable.  
- Added ready-made users and trips for faster project demonstration and testing.  
- Applied refactoring to improve code readability and maintainability.  

---

## Lessons Learned
- Gained practical experience in applying multiple design patterns in a real-world project.  
- Learned the importance of **unit testing with JUnit** to validate system behavior.  
- Understood how to design an extensible and flexible system architecture.  
- Improved teamwork and documentation skills through collaborative project development.  
