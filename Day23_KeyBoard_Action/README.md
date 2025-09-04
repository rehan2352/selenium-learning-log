📌 Day23 – Selenium Advanced Actions

Yeh folder Selenium WebDriver ke advanced features ko demonstrate karta hai, jaise ki multi-tab handling, sliders, window switching aur keyboard actions.

🚀 Programs List
1️⃣ Open_The_Link_In_NewTab.java

Ek link ko CTRL + Click karke naye tab me open karta hai.

Phir naye tab pe action perform karta hai (Manual Testing Materials link click).

Wapas original tab pe switch karke ek value type karta hai.

🔑 Concepts used:

Actions class with keyDown(Keys.CONTROL)

getWindowHandles() + switchTo().window()

2️⃣ Slider_Demo.java

Price Range Slider ko drag & drop karke minimum aur maximum values adjust karta hai.

Before aur After ke slider positions console me print hoti hain.

🔑 Concepts used:

Actions.dragAndDropBy()

Locating slider handles via XPath

getLocation() to check slider position

3️⃣ TabAndWindow.java

Selenium 4.x ka feature use karke nayi Window kholta hai.

Pehle OpenCart demo site kholta hai → fir ek naye Window me OrangeHRM login page.

🔑 Concepts used:

driver.switchTo().newWindow(WindowType.WINDOW)

Multiple website navigation

4️⃣ KeyBord_Action.java

Website: https://text-compare.com/

Pehle text likhta hai → CTRL+A select → CTRL+C copy → TAB next box → CTRL+V paste.

Console me pasted text bhi print hota hai.

🔑 Concepts used:

Actions class with Keys.CONTROL, Keys.TAB

Keyboard shortcuts simulation

Validation by fetching textbox value

⚙️ Requirements

Java 8+

Selenium WebDriver 4.x

ChromeDriver (path set in System)

Maven/Gradle (optional but recommended)

▶️ How to Run

Clone the repo / open folder in your IDE.

Install dependencies (selenium-java in Maven/Gradle).

Run each Java file individually from Day21 package.

Example (Maven dependency):

<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>4.20.0</version>
</dependency>

🎯 Learning Outcomes

Handling multiple tabs & windows

Performing drag & drop slider movements

Using Selenium 4 window management features

Simulating keyboard shortcuts with Actions

⚡ Author: Md Rehan Fazal
📅 Day23 - Selenium Practice Programs