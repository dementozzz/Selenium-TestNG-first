# Selenium-TestNG-first
Hi, my name is Hafidh Dharmawan

<b>Required Tools :</b>
- [Java 17](https://www.oracle.com/id/java/technologies/downloads/#java17)
- [Maven](https://maven.apache.org/download.cgi)
- [Visual Studio Code](https://code.visualstudio.com/download)
- Maven Dependency : [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- Maven Dependency : [TestNG](https://mvnrepository.com/artifact/org.testng/testng)

## Steps :
**1**. Launch Visual Studio Code, then **Create Java project** >> choose **"Maven"** >> choose **"No Archetype"**.

![2](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/f07c23a7-7b81-4936-bc89-2562688578fa)
![1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/f433cec7-090b-40e2-8628-3abb8d7f5919)

Then VSCode will ask you to enter the group ID of the project. You can give the name you like, as long as it start with "com." (e.g : com.demoautomation, com.example, etc). 
In this step, im gonna give the name "com.testngtutorial"

![3](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/d881af2c-93ab-4d14-a2ea-bfd75840c866)

For Artifact ID, it also can be your project name.

![4](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/b3a27921-f78d-474d-8996-71f4753f7ffe)


**2**. In this step, we want to add Selenium Java dependency and TestNG dependency inside **_pom.xml_**. open it through VSCode and add the dependencies below

```xml
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.12.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.8.0</version>
            <scope>test</scope>
        </dependency>
```

The final result should be like the image below

![5 1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/20568d12-d965-4f95-9753-0947fb2bc672)

**NOTE**: Make sure the copied dependency should be placed inside ```<dependencies>``` tag.




