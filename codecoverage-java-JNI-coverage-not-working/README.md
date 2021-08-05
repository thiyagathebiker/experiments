# codecoverage

1. Add jacoco.gradle in project root

2. Include the below code in project root\build.gradle
```
subprojects {
    afterEvaluate { project ->
        project.apply from: '../jacoco.gradle'
    }
}
```
3. Run the below command

```
gradlew clean :mathlub:jacocoTestReport
```
4. Report can be found under below path

```
mathlub\build\coverage-report
```
