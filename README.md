## introduction
This example project show how run unit and integration tests together and separately 

1. Installing the application with tests only

		mvn clean install

2. Running tests only

		mvn test
		
3. Installing the application with tests and integration tests
		
		mvn clean install -Pintegration-test

4.  Running integration tests

		mvn integration-test -Pintegration-test

## Observation 
When run a `integration-test`, `maven` is required to run `test` too, because `test` is a condition to `integration-test` works.

## Activate integration tests by default
You can active integration-test to run by default in `maven clean install`, to do it you have to set 
`activeByDefault` as `true` in maven `integration-tests` profile, as follows

```xml
...
<id>integration-test</id>
<activation>
	<activeByDefault>true</activeByDefault>
</activation>
....
```