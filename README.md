# Selenium-TestNG-first
This is my first journey learning the automation using selenium + TestNG. I will share my first code in this section.

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


**2**. In this step, we want to Install Selenium Java and TestNG by adding their dependency inside **_pom.xml_** file. open it and add the dependency below

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

The final result should be like the image below.

![5 1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/20568d12-d965-4f95-9753-0947fb2bc672)

**NOTE**: Make sure the copied dependency should be placed inside ```<dependencies>``` tag.

After done add the dependency, save it and click **Yes** button on the bottom right of your screen.

![6](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/4d887b61-f429-427e-abfe-c6636ad96f4b)

**3**. We're already finish install Selenium and testNG, now let's try scenario "Open the browser" first.
Create a Java file under src\test\java with name ***"{anyname}.java"*** so that VSCode recognize that you want to create a java file and automatically generate the class inside the file.

![7_1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/faf5b9fc-5ed5-476b-8328-f24e0b2757f8)

![7_2](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/88cdaf98-94ce-4312-ab09-a582814c2e58)

Then copy the code below and put it inside your class

```java
public void openWebsite(){
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.saucedemo.com");
}
```
The result should like in the image below

![main_1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/6d810c48-9ed9-4186-b201-8f56c9ff5fc5)

**NOTE**: make sure ```import org.openqa.selenium.WebDriver;``` and ```import org.openqa.selenium.chrome.ChromeDriver;``` is present.

Because we also use TestNG, ```@Test``` annotation should added on top of your _void_, otherwise your test cannot be executed.

![main_2](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/f3413654-e990-401f-916b-b854d5bb9e35)

Now, let's run the code to see if it is work, click play button/green checklist button on the left.

![main_3](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/810435fc-7496-43f1-92b0-803e0ce8981d)

Below is example if your code is run successfully 

https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/bd1c92d4-7f97-4ce4-8d1c-7ae096b66511


Now that we're successfully working on our first scenario, let's try "Login" scenario after the steps above. The steps will be divided into several parts :

- Finding element of username and password inputfield
- Fill the username and password
- Get login button element and click it

**4. Finding element of username and password inputfield**

We can find the element by right click mouse >> choose "Inspect". For better experience, you can right click mouse >> inspect on the username/password field to find the username/password element directly.

![1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/bd7779a2-8b57-47f9-a6e9-20a48e28f152)

![1_2](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/282798b4-ae3e-4e0b-aa87-91b18d91b8fe)


Since both username and password inputfield have "id" attribute, we can use it to fill the username and password with your own keywords.

**5. Fill the username and password**

On VSCode, create a new public void 

![scenario2_1](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/00ca0126-768a-497f-823b-972f7b81f3b8)

Copy the value of attribute "id" of username and password inputfield element from the previous step. Then use it by creating a syntax _driver.findElement(By.id('**{id_of_element}**')).sendKeys("**{keywords}**");_ . The final result should be like image below.

![scenario2_2](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/3682de5a-9ca5-4cb1-a8f7-2f934648f065)

You may notice that there is an error/red underline on _driver_, it is because on our previous step we initiate our Webdriver inside our _openWebsite()_. To resolve this, you need to move the Webdriver outside openWebsite().

![scenario2_3](https://github.com/dementozzz/Selenium-TestNG-first/assets/20464988/acd28b51-0ad0-419a-b788-1b42403cb865)














