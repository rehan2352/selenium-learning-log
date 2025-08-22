AutoSuggestDropDown (Selenium Java)

This project demonstrates how to handle Auto-Suggest Dropdowns using Selenium WebDriver in Java.
The example uses the Google Search Box to capture and interact with suggestion results dynamically.

📌 Features

Launches Chrome browser and opens Google
.

Enters the keyword "selenium" in the search box.

Waits for auto-suggest dropdown to load.

Captures all suggestions and prints them in the console.

Selects the suggestion "selenium" from the list and clicks it.

🛠️ Tools & Technologies Used

Language: Java

Automation Tool: Selenium WebDriver

Browser: Chrome

Build Tool: Maven (optional)

IDE: Eclipse/IntelliJ

📂 Code Workflow

Initialize WebDriver and set implicit wait.

Open Google homepage and maximize the window.

Enter the search keyword into the input box.

Capture all auto-suggest dropdown items using XPath:

//ul[@role='listbox']//li//div[@role='option']


Print each suggestion in the console.

Compare suggestion text with the expected value (selenium) and click it.

▶️ How to Run

Clone or download this repository.

Ensure Java, Selenium, and ChromeDriver are installed and configured in your system PATH.

Open the project in your IDE.

Run the AutoSuggestDropDown.java file.

Observe suggestions printed in console and automatic selection of the matching result.