Day19 – Selenium Mouse Actions

This folder contains examples of Advanced Mouse Interactions in Selenium WebDriver.
Each Java class demonstrates how to perform a specific mouse-related action using the Actions class.

📂 Files Included

DoubleClick_Action.java

Demonstrates how to perform a double-click action on a web element.

Useful for scenarios where double-click triggers a specific UI event.

Handle_DragAndDropAction.java

Demonstrates drag and drop functionality using Selenium’s dragAndDrop method.

Commonly used in web apps where items are draggable (e.g., Kanban boards, file upload).

Handle_MouseAction.java

Covers basic mouse interactions like moveToElement, hover, and click.

Useful for handling menus and hidden elements that appear on mouse hover.

Handle_Right_Click_Actions.java

Demonstrates how to perform a right-click (context click) action.

Useful for testing context menus and shortcut options in web applications.

⚙️ Prerequisites

Java 21

Maven/Gradle project setup

Selenium WebDriver dependency

ChromeDriver / GeckoDriver installed

Add this Maven dependency if not already in your project:

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.22.0</version>
</dependency>

▶️ How to Run

Clone this repo or copy the Day19 folder into your Selenium workspace.

Open the class file you want to test (e.g., DoubleClick_Action.java).

Update the WebDriver path and target URL if needed.

Run the file as a Java Application.

📌 Concepts Covered

Double Click

Drag and Drop

Mouse Hover & MoveToElement

Right Click (Context Click)