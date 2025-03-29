# Java Streams API

## Introduction
The **Java Streams API** (introduced in Java 8) provides a functional approach to processing collections of data. It enables operations such as filtering, mapping, and reducing, making code more readable and efficient.

## Key Features
- **Functional-style operations**: Uses lambdas and functional interfaces.
- **Lazy evaluation**: Operations are executed only when needed.
- **Parallel processing**: Supports multi-threading with parallel streams.
- **Pipelining**: Intermediate operations return a stream, allowing method chaining.

## Stream Creation
You can create a stream from various sources:

```java
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // Creating a stream from a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream = names.stream();
    }
}
```

## Stream Operations
### 1. Intermediate Operations
These return a stream and are lazily executed.
- **`filter(Predicate<T>)`** – Filters elements based on a condition.
- **`map(Function<T, R>)`** – Transforms elements.
- **`sorted()`** – Sorts the stream.

Example:
```java
List<String> filteredNames = names.stream()
    .filter(name -> name.startsWith("A"))
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
System.out.println(filteredNames);
```

### 2. Terminal Operations
These trigger the execution of intermediate operations.
- **`collect(Collectors.toList())`** – Collects elements into a list.
- **`forEach(Consumer<T>)`** – Iterates through the elements.
- **`count()`** – Returns the number of elements.
- **`reduce(BinaryOperator<T>)`** – Combines elements into a single result.

Example:
```java
long count = names.stream()
    .filter(name -> name.length() > 3)
    .count();
System.out.println("Count: " + count);
```

## Parallel Streams
Parallel streams utilize multiple threads for performance improvements.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream().forEach(System.out::println);
```

## Resources
- [Java Streams API Official Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Baeldung Guide to Java Streams](https://www.baeldung.com/java-8-streams)

---
Feel free to contribute to this repository by adding more examples and explanations!


