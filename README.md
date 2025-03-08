# SwagLabs
- UI Automation of saucedemo website using Cucumber-Selenium-Java 
- The framework follows the Cucumber BDD approach, using Gherkin syntax to define the test scenarios in feature files. Each step in the feature file has a corresponding Step definition file. Assertions and interactions with web elements are implemented in the Step definition files. 
- To improve readability and reusability, I am following a Page Object Model in this framework. Each web page has a corresponding java class where methods and locators of web elements are written. These page classes are referenced in the Step definition file.
- All the framework related dependencies are in the pom.xml file.
- Each feature file can be executed independently. Also, it can be executed via TestRunner class where we can control which testcases to run using Cucumber tags. 
- For test reporting, ExtentReports are integrated into the framework. HTML and pdf reports can be generated consisting of test results and execution time. 

