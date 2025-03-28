# Java Functional Programming

## Introduction

Welcome to the Java Functional Programming repository! This project aims to illustrate the differences between imperative and functional programming paradigms using Java. Rather than specifying how something is to be done, here we specify what needs to be done.

## Imperative Programming vs. Functional Programming

### Imperative Programming

Imperative programming is a programming paradigm that uses statements to change a program's state. It focuses on describing how a program operates. This paradigm is characterized by the following features:

- **Step-by-Step Instructions**: Imperative programming involves writing sequences of commands for the computer to perform.
- **State Changes**: Variables are used to store state, and their values are modified throughout the program.
- **Loops and Conditionals**: Control structures like loops (`for`, `while`) and conditionals (`if`, `switch`) are commonly used.
- **Side Effects**: Functions and methods may modify the state of variables outside their scope, leading to side effects.

Example:
```java
public class ImperativeExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
```

### Functional Programming

Functional programming is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing state and mutable data. It focuses on describing what the program should accomplish. This paradigm has the following characteristics:

- **Pure Functions**: Functions have no side effects and return the same output for the same input.
- **Immutability**: Data is immutable, meaning it cannot be changed once created.
- **First-Class Functions**: Functions are treated as first-class citizens and can be passed as arguments, returned from other functions, and assigned to variables.
- **Higher-Order Functions**: Functions that take other functions as parameters or return them as results.
- **Declarative Approach**: Focuses on what needs to be done rather than how to do it.

Example:
```java
import java.util.stream.IntStream;

public class FunctionalExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum: " + sum);
    }
}
```

## Repository Structure

- `src/imperative`: Contains examples of imperative programming in Java.
- `src/functional`: Contains examples of functional programming in Java.

## Getting Started

To run the examples in this repository, you will need to have Java installed on your machine. You can download and install Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Conclusion

This repository demonstrates the differences between imperative and functional programming paradigms. By understanding these differences, you can choose the appropriate paradigm for your specific use case and write more efficient and maintainable code.
