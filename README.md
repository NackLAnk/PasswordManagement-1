# PasswordManagement-1

### Overview

Password Manager is a simple Java application that helps you generate and manage passwords. It utilizes the Singleton and Strategy design patterns to provide flexibility in generating passwords with different complexity levels.

### Features
* Singleton Pattern: The Password Manager is designed as a Singleton, ensuring that only one instance of it can be created. This ensures a single point of access for password management.
* Strategy Pattern: Different strategies for password generation can be implemented. By default, a simple password generation strategy is provided, but you can easily switch to a more complex strategy if needed.
### Usage
**Get Password Manager Instance**: To use the Password Manager, first get an instance of it using the `getInstance` method.
```java
PasswordManager passwordManager = PasswordManager.getInstance();
```
**Generate Passwords**: You can generate passwords using the currently set strategy (which is simple by default) by calling the `generatePassword` method.
```java
String password = passwordManager.generatePassword();
System.out.println("Generated Password: " + password);
```
**Change Password Generation Strategy**: You can change the password generation strategy at any time by calling the `setPasswordGenerationStrategy` method and providing a new strategy.
```java
passwordManager.setPassword(new PasswordManager.ComplexPassword());
```
**Example Strategies**: Two example strategies, `SimplePassword` and `ComplexPassword`, are provided. You can use them or create your own.
