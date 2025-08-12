# Day 11 — Handle Checkboxes

This example demonstrates how to locate and interact with multiple checkboxes using Selenium WebDriver (Java).

## File
`HandleCheckBoxes.java` (package: `Day11`)

## Website under test
https://testautomationpractice.blogspot.com/

## What the script does
1. Launches Chrome and opens the test page.
2. Locates all checkbox elements using an XPath:
   `//input[@class='form-check-input' and @type='checkbox']`
3. Selects the first three checkboxes.
4. Waits for 5 seconds to observe the selections.
5. Then checks the first three checkboxes and unselects them if they are selected.

## Methods & functions used
- `findElements(By.xpath)` — to get a list of checkbox WebElements.
- `click()` — to toggle checkbox state.
- `isSelected()` — to verify if a checkbox is currently selected.
- `Thread.sleep()` — to pause for observation (replace with explicit waits in real test suites).

## How to run
1. Ensure Java and ChromeDriver are installed and compatible with your Chrome browser.
2. Add Selenium WebDriver dependencies to your project.
3. Place `HandleCheckBoxes.java` under package `Day11`.
4. Run the class from your IDE.

## Notes
- Prefer explicit waits (`WebDriverWait`) instead of `Thread.sleep()` for robust automation.
- You can easily modify loops to select different ranges (first 3, last 3, every alternate checkbox).
