# mutation-testing

Using mutation testing & pitest, this is a demo to showcase that obtaining 100% code coverage does not necessarily mean '100%'

1. Run gradlew `build` and `test` tasks first to generate `test.exec` file.
2. Run `jacocoTestReport` gradle task. Report should state 100% tested.
3. Run `pitest` to generate mutants and test :).