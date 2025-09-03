# 📅 Date Picker Automation using Selenium + Java

This project demonstrates how to automate **Date Picker widgets** with **Selenium WebDriver (Java)**.  
It focuses on selecting a specific **Year, Month, and Day** dynamically from a jQuery UI Date Picker available on 👉 [Test Automation Practice Blogspot](https://testautomationpractice.blogspot.com/).

---

## 🚀 Features
- Open Chrome browser via Selenium.
- Handle date picker popup smoothly.
- Select **Year** from dropdown.
- Navigate between **Months** (using Java `Month` enum).
- Pick **Day** from the calendar grid.
- Supports both **future** and **past** dates.

---

## 🛠️ Tech Stack
- **Language:** Java 17+
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **IDE:** Eclipse / IntelliJ IDEA
- **Browser Driver:** ChromeDriver

---

## 📂 Project Structure
Day_20/
└── DatePicker_Demo2.java # Main automation script

yaml
Copy code

---

## 📜 Code Flow (DatePicker_Demo2.java)
1. Launch Chrome and open the blogspot demo page.
2. Click on the date input box to open Date Picker.
3. Select the **year** using dropdown.
4. Compare current month with expected month:
   - If past → click `prev`.
   - If future → click `next`.
   - If same → break loop.
5. Select the **day** from the table.
6. Date gets selected successfully.

---

## ▶️ How to Run
1. Clone this repo:
   ```bash
   git clone https://github.com/your-username/DatePicker-Automation.git
   cd DatePicker-Automation
Add Selenium dependency in pom.xml:

xml
Copy code
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.23.0</version>
</dependency>
Download ChromeDriver → make sure it matches your Chrome browser version.
Place it in system PATH or project root.

Run the script:

bash
Copy code
mvn test
or directly run DatePicker_Demo2.java from IDE.

📌 Example Run
Opens browser.

Navigates to the Date Picker.

Selects 5th October 2025 automatically.

Browser shows the selected date in the input field.

✅ Notes
Change values in code:

java
Copy code
String year = "2025";
String month = "October";
String day = "5";
to test other dates.

Script works on jQuery UI Date Picker.

Uses Java Month enum for reliable month comparison.

Add driver.quit(); at the end if you want browser to close after execution.

👤 Author
Md Rehan
SDET | Java + Selenium Automation Enthusiast 🚀
