📅 Selenium Date Picker Automation (Java)

This project demonstrates how to automate date selection (both past and future) using Selenium WebDriver with Java on the jQuery UI Date Picker.

🚀 Features

Select future dates (navigate with “Next” arrow).

Select past dates (navigate with “Prev” arrow).

Works for day, month, and year selection.

Uses loops + dynamic locators to handle calendar navigation.

Example website: jQuery UI Datepicker

🛠️ Tech Stack

Java 8+

Selenium WebDriver

ChromeDriver

JUnit / TestNG (optional, for test structure)

📂 Project Structure
src/
 └── Day_20/
      └── Handle_Date_Picker.java

▶️ How It Works

Open the jQuery UI Date Picker demo page.

Switch into the iframe that contains the calendar widget.

Compare the current year & month with the target.

Navigate:

Next arrow → until target year & month (future date).

Prev arrow ← until target year & month (past date).

Once the correct calendar is displayed, select the day.