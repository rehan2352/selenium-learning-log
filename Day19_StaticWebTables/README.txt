HandleStaticTable (Selenium Java)

This project demonstrates how to handle and extract data from a static web table using Selenium WebDriver in Java.
The example uses the BookTable from Test Automation Practice Blogspot
.

📌 Features

Launches Chrome browser and navigates to the test site.

Counts the total number of rows and columns in the table.

Reads specific cell data (e.g., 5th row & 1st column).

Reads and prints all rows and columns (loop through the table).

Finds and prints the book name by a specific author (e.g., Mukesh).

Calculates and prints the total price of all books.

🛠️ Tools & Technologies Used

Language: Java

Automation Tool: Selenium WebDriver

Browser: Chrome

Build Tool: Maven (optional)

IDE: Eclipse/IntelliJ

📂 Code Workflow

Initialize WebDriver and set implicit wait.

Open the practice website and maximize the window.

Locate table using XPath:

//table[@name='BookTable']


Perform operations like:

Row count

Column count

Fetch specific cell data

Loop through all rows and columns

Conditional fetch (books by author)

Summation of prices

▶️ How to Run

Clone or download this repository.

Ensure Java, Selenium, and ChromeDriver are installed and configured in your system PATH.

Open the project in your IDE.

Run the HandleStaticTable.java file.

Observe the output in the console (rows, columns, specific data, and total price).

📌 Sample Output (Console)
Total Number Of Row Present in The Table: 7
Total Number Of Column Present in The Table: 4
Learn Selenium
The Total Of All The Book Is:7100