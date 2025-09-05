# Selenium Automation Examples

This repository contains sample Java programs demonstrating different Selenium WebDriver features.

## Files Overview

### 1. FileUploaded.java
- Demonstrates how to upload files in Selenium using `<input type="file">`.
- Shows how to verify uploaded file names from the file list on the web page.
- Useful for automating scenarios where file upload functionality needs to be tested.

### 2. JavaScriptExecutorDemo.java
- Demonstrates usage of `JavascriptExecutor` in Selenium.
- Covers tasks such as:
  - Clicking on elements via JavaScript.
  - Scrolling into view of elements.
  - Retrieving page titles and inner text.
- Useful when standard Selenium methods do not work as expected.

### 3. ScrollBar.java
- Demonstrates handling of scrollbars in web applications.
- Uses JavaScript execution and Actions class to:
  - Scroll vertically and horizontally.
  - Move to a particular element in the DOM.
- Useful for testing large web pages where elements are not visible initially.

### 4. ZoomInZoomOut.java
- Demonstrates zoom in and zoom out functionality using Selenium.
- Uses `JavascriptExecutor` to adjust the zoom level of the webpage.
- Useful for validating UI behavior under different zoom percentages.

---

## How to Run
1. Clone this repository:
   ```bash
   git clone <repo-url>
Open the project in Eclipse or IntelliJ IDEA.

Add Selenium WebDriver dependencies (via Maven or manually).

Run any .java file as a Java Application.

Prerequisites
Java JDK 8 or higher

Selenium WebDriver

ChromeDriver (or other browser drivers)

Eclipse/IntelliJ IDEA

Author- Md Rehan Fazal