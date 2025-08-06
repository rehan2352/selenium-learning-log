# 🧿 Day 9: Handle Browser Windows using Selenium

This example demonstrates how to handle **multiple browser windows or tabs** using Selenium WebDriver in Java. It shows how to retrieve window handles, switch between windows, and validate window content.

---

## 📌 Topics Covered

- Opening new browser window via link click
- Retrieving window handles using `getWindowHandles()`
- Switching between parent and child windows
- Comparing window titles
- Printing current URL of a specific window

---

## 🚀 Technologies Used

| Tool         | Purpose                     |
|--------------|-----------------------------|
| Java         | Programming Language        |
| Selenium     | Automation Framework        |
| ChromeDriver | WebDriver for Chrome        |

---

## 🗂 Code Flow Summary

- Launches **Flipkart login** page.
- Clicks on **Privacy Policy** (opens a new tab/window).
- Captures all open window handles.
- Two approaches:
  - ✅ **Approach 1:** Converts `Set` to `List`, switches using index.
  - ✅ **Approach 2:** Iterates through windows and switches based on **title match**.
- Prints current URL or title of the desired window.

---

## 📁 File Details

| File Name                | Description                          |
|--------------------------|--------------------------------------|
| `HandleBrowserWindow.java` | Java code for window handling logic |

---

## 👨‍💻 Author

**Md Rehan Fazal**  
📘 Selenium Learning Log
