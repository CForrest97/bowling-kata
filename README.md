# Bowling-kata

Read a summary for Bob Martin's bowling kata at http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata

Or follow the instructions at http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt

## Installation
Install maven

Install on windows: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/

Install with brew: 
```bash
brew install maven
```

## Usage

Setup project
```bash
mvn install
```
### Testing
```bash
mvn test
```

### Running
```bash
mvn package
java -cp target/com.bowling.kata.java-1.0-SNAPSHOT.jar com.bowling.kata.java.App
```
