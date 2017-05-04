# line-duplicator
Simple line duplicator with iteration.

## Example of use
1. Duplicate n times. 
```
java -jar ld.jar "Hello!" 1 4
```
Above command produce:
```
Hello!
Hello!
Hello!
Hello!
```
2. Duplicate n times with iteration.
```
java -jar ld.jar "Hello World @i!" 1 4
```
Above command produce:
```
Hello World 1!
Hello World 2!
Hello World 3!
Hello World 4!
```
