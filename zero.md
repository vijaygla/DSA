# Standard Java Naming Conventions
- Packages --> Names should be in lowercase.
- Classes --> Names should be in CamelCase.
- Interfaces --> Names should be in CamelCase.
- Methods --> Names should be in mixed case.
- Variables --> Names should be in mixed case.
- Constants --> Names should be in uppercase.

## To Compile and Run code with package name
- javac <package-name>/<file-name>.java
- java <package-name>.<filename>



# When this types of error Run both the command with corrrect file and folder name
Error: Could not find or load main class packageFolder.PrintEven
Caused by: java.lang.ClassNotFoundException: packageFolder.PrintEven
`javac packageFolder/*.java packageFolder2/*.java`
`java -cp . packageFolder.PrintEven`

