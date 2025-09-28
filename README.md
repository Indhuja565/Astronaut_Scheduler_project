# Astronaut Scheduler Project

This repository contains solutions for the **HC Coding Exercises (2025-26)**.  
It includes:

##  Structure

- **exercise1_design_patterns/**  
  Demonstrates six different software design patterns with simple Java examples:  
  - Observer Pattern  
  - Singleton Pattern  
  - Factory Pattern  
  - Adapter Pattern  
  - (Extendable for other patterns if needed)

- **exercise2_astronaut_scheduler/**  
  A console-based application: **Astronaut Daily Schedule Organizer**.  
  Implements Singleton, Factory, and Observer patterns.

##  Exercise 1: Design Patterns

Each Java file inside `exercise1_design_patterns` demonstrates a design pattern independently.  
Compile and run them as:

```bash
cd exercise1_design_patterns
javac *.java
java ObserverPatternDemo
java SingletonPatternDemo
java FactoryPatternDemo
java AdapterPatternDemo
```

##  Exercise 2: Astronaut Daily Schedule Organizer

### Features
- Add tasks with description, start time, end time, and priority.
- Remove tasks by description.
- View tasks sorted by start time.
- Validates overlapping tasks (conflict detection).  
- Observer pattern alerts on conflicts or updates.
- Singleton ensures only one ScheduleManager exists.

### How to Run
```bash
cd exercise2_astronaut_scheduler
javac *.java
java Main
```

### Example Run
```
--- Astronaut Daily Schedule Organizer ---
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
Choose: 1
Description: Morning Exercise
Start Time (HH:MM): 07:00
End Time (HH:MM): 08:00
Priority (High/Medium/Low): High
[AstronautScheduler] Task added successfully: Morning Exercise
```

##  Technologies & Practices
- **Language**: Java  
- **Design Patterns**: Singleton, Factory, Observer, Adapter  
- **Best Practices**: OOP, SOLID principles, defensive coding, input validation, exception handling.

##  Notes
- This project is console-based (no GUI).  
- Extendable for editing tasks, marking completion, or filtering by priority.  
- Logging can be extended using `java.util.logging` or similar frameworks.
