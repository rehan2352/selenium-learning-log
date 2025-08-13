# Day 13 – Handling Frames and Nested Iframes in Selenium

## Overview
This program demonstrates how to handle multiple frames and a nested iframe using Selenium WebDriver in Java. Frames are separate HTML documents embedded inside another HTML document, and switching between them is essential when working with elements inside different frames.

## Key Concepts Covered
- Switching to a frame using WebElement
- Returning to the main document using defaultContent()
- Navigating between multiple frames
- Handling nested iframes (iframe inside a frame)
- Clicking an element inside a frame using JavaScriptExecutor

## Steps Performed in Code
1. Launch Chrome Browser and open the test URL:  
   https://ui.vision/demo/webtest/frames/
2. Frame 1: Switch to frame_1.html and enter text in the input field.
3. Return to Main Page using driver.switchTo().defaultContent().
4. Frame 2: Switch to frame_2.html and enter text in its input field.
5. Frame 3: Switch to frame_3.html and enter text in its input field.
6. Inner Iframe: Inside Frame 3, switch to the nested iframe and click a radio button using JavaScript.
7. Go Back to Main Page after completing actions inside frames.

## Tools & Technologies Used
- Language: Java
- Automation Tool: Selenium WebDriver
- Browser: Google Chrome
- Additional API: JavaScriptExecutor for clicking elements inside an iframe

## How to Run
1. Make sure Java and Selenium WebDriver are set up in your system.
2. Save this file as HandleFrame.java in your project folder.
3. Compile the program:
   javac HandleFrame.java
4. Run the program:
   java HandleFrame

## Author
Md Rehan Fazal
