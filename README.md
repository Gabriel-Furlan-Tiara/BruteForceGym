# BruteForceGym

Brute Force is a console-based Java application designed to manage gym members and their personalized workout routines.

This project was developed strictly for study purposes to solidify intermediate Java concepts and foundational software engineering practices. It serves as a practical exercise in architectural design, transitioning from procedural logic to a robust Object-Oriented structure. The ultimate goal of this project is to establish a solid backend foundation that will soon be migrated into a fully functional REST API.

# Key Features
- Member Management: Register new gym members with unique IDs and physical metrics.

- Dynamic Workout Creation: Assign customized workout routines to specific members.

- Categorized Exercises: Support for different exercise profiles (Strength vs. Cardio) with specific data points for each.

- Routine Display: Print cleanly formatted workout regimens for individual members.

# Technical Concepts Applied
  This project heavily emphasizes Object-Oriented Programming (OOP) and clean code principles. The core Java features developed include:

- Inheritance: Implemented abstract parent classes (User, Exercise) to share common attributes and avoid code duplication among child classes (Member, Teacher, StrengthExercise, CardioExercise).

- Polymorphism: Utilized dynamic method dispatch (e.g., the exhibitDetails() method) to allow the application to automatically determine the correct output format based on the specific type of exercise at runtime.

- Encapsulation: Protected class data using strict access modifiers (private), exposing states only through proper Getters and Setters.

- Memory Management: Effectively handled state using Java Collections (List and ArrayList), avoiding NullPointerExceptions through proper constructor initialization.

- Interactive CLI: Built a continuous, user-friendly command-line interface using Scanner and controlled loop structures.

# Roadmap (Next Steps)
[ ] Refactor the application into a Spring Boot project.

[ ] Expose the core functionalities via a RESTful API (Controllers).

[ ] Replace in-memory lists with a real database integration (SQL/NoSQL) using Spring Data JPA.

[ ] Develop a frontend interface utilizing HTML, CSS, and JavaScript.
