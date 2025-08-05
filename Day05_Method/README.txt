# Selenium WebDriver Methods - OrangeHRM Automation

This Java program demonstrates the use of core WebDriver methods to interact with the OrangeHRM login page using Selenium. It is part of Day 5 practice under the package `Day05_WebDriver_Methods`.

## 📁 Package
Day05_WebDriver_Methods

## 📄 Class
Get_Method.java

## 🌐 URL Tested
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

## ✅ Methods Demonstrated

- `get(String url)`: Opens the given URL in the browser.
- `getTitle()`: Returns the current page title.
- `getCurrentUrl()`: Returns the current page URL.
- `getWindowHandle()`: Returns the unique ID of the current browser window.
- `getWindowHandles()`: Returns IDs of all open windows.

## 🔍 Actions Performed

1. Open the OrangeHRM login page.
2. Print the page title, current URL, and window handle.
3. Click on the "OrangeHRM, Inc" link to open a new tab/window.
4. Print all open window handles after the click.

## ⏱️ Delay Handling

- `Thread.sleep(5000)` is used to allow the page to fully load before interacting.

## 💻 Technologies Used

- Java  
- Selenium WebDriver  
- ChromeDriver  
- Eclipse or IntelliJ IDEA

## 🧪 Sample Output

