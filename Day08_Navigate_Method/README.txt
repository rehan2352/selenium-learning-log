
## 🚀 What the Code Does

1. Opens the **Chrome browser**.
2. Navigates to **Flipkart homepage**.
3. Then goes to the **Flipkart login page**.
4. Performs:
   - **Back** navigation to the homepage
   - **Forward** navigation to the login page
   - **Refreshes** the login page
5. Prints the current URL after back and forward operations.

## 💻 Requirements

- Java (JDK 17 or above recommended)
- Selenium WebDriver (4.x)
- Chrome browser
- ChromeDriver (compatible version with your Chrome browser)

## ⚙️ How to Run

1. Make sure Selenium and ChromeDriver are correctly set up in your project.
2. Run the `NavigateCommand.java` file.
3. You will see navigation operations being performed automatically in the Chrome browser.

## 📌 Notes

- `navigate().to(url)` works just like `get(url)` but also allows history tracking (back/forward).
- This demo is useful for learning **browser navigation in automation scripts**.

---

✅ Created as part of Selenium learning exercises.
