# Day 3 - XPath Testing in Selenium

This project demonstrates how to use different types of XPath locators in Selenium WebDriver using Java.

## 📂 Package Name
`Day_3`

## 📄 File Name
`Xpath_Testing.java`

## ✅ Description
The program performs the following steps:

- Opens the Chrome browser using ChromeDriver.
- Navigates to: [https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/](https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/)
- Maximizes the browser window.
- Extracts and prints the `<h1>` title text from the webpage using XPath.

## 🔍 XPath Expressions Used

| Type                      | XPath Expression                                                                 |
|---------------------------|----------------------------------------------------------------------------------|
| Single attribute          | `//input[@placeholder='Search for Products, Brands and More']`                  |
| Multiple attribute        | `//input[@type='text'][@name='q']`                                              |
| OR operator               | `//input[@type='text' or @name='qdd']`                                          |
| Inner tag (text)          | `//span[text()='Log in']`                                                       |
| contains() function       | `//input[contains(@placeholder ,'Search for')]`                                 |
| starts-with() function    | `//input[starts-with(@placeholder ,'Search for')]`                              |

## 💡 Output
```text
Best Selenium Practice Websites in 2025
