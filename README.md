This is a basic Calculator project and can evaluate binary maths expression with ```+, -, *, /``` operator. This project intends to present how best coding principles and design patterns can be applied in real-world projects for better scalability and readability. We have taken a very basic example of a calculator, to allow beginners to understand the beauty of clean coding and start apply best practices in their projects. The project is a very good example of how ```interfaces``` and ```factory pattern``` can be incorporated in even basic projects to avoid overuse of ```Switch-Case Statement``` and ```If-Else statement```.

## Getting Started
### System Requirements
1. ```Java 8 or above```
2. ```Maven 3.8.5 or above```

### Running the Program

#### Build the Project

```sh
 mvn clean package 
```
#### Run Command
```sh
  java -jar target/calculator-1.0.1.jar
```

## Examples
#### Sum of two numbers
```sh
Write an expression to evaluate or 'exit' to exit
10 + 100
110.0
```
#### Product of two numbers
```sh
Write an expression to evaluate or 'exit' to exit
10 * 5
50.0
```
#### Invalid Expression
```sh
Write an expression to evaluate or 'exit' to exit
10.4
org.calculator.exception.ExpressionParsingException: Size of the expression should be 3
```

### Resources and Links
- [How to write clean code? Lessons learnt from “The Clean Code” — Robert C. Martin](https://medium.com/mindorks/how-to-write-clean-code-lessons-learnt-from-the-clean-code-robert-c-martin-9ffc7aef870c)
- [Clean Code - Uncle Bob - Playlist](https://www.youtube.com/watch?v=7EmboKQH8lM&list=PLmmYSbUCWJ4x1GO839azG_BBw8rkh-zOj)
- [7 Ways to Refactor Java switch Statements | Developer.com](https://www.developer.com/design/seven-ways-to-refactor-java-switch-statements/)
