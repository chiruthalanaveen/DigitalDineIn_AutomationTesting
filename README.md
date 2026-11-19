# 🍽️ DigitalDineIn – End-to-End Automation Testing

![Katalon Studio](https://img.shields.io/badge/Katalon%20Studio-11.7.0-00A98F)
![Selenium](https://img.shields.io/badge/Selenium-4.46.0-43B02A)
![Browser](https://img.shields.io/badge/Browser-Google%20Chrome-4285F4)
![Testing](https://img.shields.io/badge/Testing-End--to--End-blue)
![Test Status](https://img.shields.io/badge/Test%20Cases-5%2F5%20Passed-brightgreen)

## 📌 Project Overview

**DigitalDineIn Automation Testing** is an end-to-end web automation testing project developed using **Katalon Studio**.

The project automates and validates the essential functionalities of the Digital DineIn Smart QR Restaurant Ordering website.

The automation covers the complete restaurant ordering workflow, from accessing the restaurant menu to searching for food, adding items to the cart, verifying cart contents, and completing checkout.

The primary objective is to ensure that the restaurant ordering application functions correctly, reliably, and consistently through automated functional testing.

## 🎯 Project Objectives

- Automate the restaurant ordering workflow.
- Validate restaurant menu accessibility.
- Verify food search functionality.
- Test the Add to Cart feature.
- Verify selected food items in the shopping cart.
- Validate the checkout and order confirmation process.
- Reduce repetitive manual testing.
- Generate automated test execution reports.

## 🛠️ Technologies and Tools

| Technology | Description |
|---|---|
| Katalon Studio 11.7.0 | Test automation platform |
| Selenium WebDriver 4.46.0 | Browser automation |
| Groovy | Test scripting language |
| Google Chrome | Test execution browser |
| Katalon Web Recorder | Recording user interactions |
| Object Repository | Managing web elements |
| GitHub | Source code version control |
| Windows 11 | Test execution environment |

## 🌐 Application Under Test

**Application:** Digital DineIn – Smart QR Restaurant Ordering

**Website:** https://www.digitaldine-in.online/

**Application Type:** Web-based restaurant ordering system

### Functionalities Tested

1. Restaurant menu navigation
2. Food search
3. Adding food items to the cart
4. Cart item verification
5. Checkout and order confirmation

## 🧪 Automated Test Cases

The automation project consists of five functional test cases.

### TC01 – Verify Restaurant Menu

**Objective:** Verify that users can successfully access the restaurant menu.

**Test Steps:**
1. Launch Google Chrome.
2. Navigate to the Digital DineIn restaurant menu URL.
3. Enter the customer's name.
4. Enter a valid 10-digit mobile number.
5. Click **Browse Menu**.
6. Verify that the restaurant menu displays food items such as Veg Biryani.

**Expected Result:** The restaurant menu should load successfully and display available food items.

**Execution Status:** PASSED

### TC02 – Verify Food Search

**Objective:** Validate the food search functionality.

**Test Steps:**
1. Open the restaurant ordering website.
2. Enter customer details.
3. Navigate to the restaurant menu.
4. Enter "biryani" in the search field.
5. Verify that the Chicken Biryani item is displayed.
6. Click the Chicken Biryani item.

**Expected Result:** The search functionality should display the relevant food item.

**Execution Status:** PASSED

### TC03 – Verify Add to Cart

**Objective:** Verify that users can add food items to the shopping cart.

**Test Steps:**
1. Launch the restaurant ordering website.
2. Enter customer details.
3. Click **Browse Menu**.
4. Click the **ADD** button for a food item.
5. Open the shopping cart.
6. Verify that the selected food item is present.

**Expected Result:** The selected food item should be added to the shopping cart successfully.

**Execution Status:** PASSED

### TC04 – Verify Cart Item

**Objective:** Verify that the selected food item is displayed in the shopping cart.

**Test Steps:**
1. Open the restaurant ordering website.
2. Enter customer details.
3. Navigate to the restaurant menu.
4. Add a food item to the cart.
5. Click the cart icon.
6. Verify that the selected item, Mutton Biryani, is displayed.

**Expected Result:** The shopping cart should display the selected food item.

**Execution Status:** PASSED

### TC05 – Verify Checkout

**Objective:** Validate the checkout and order confirmation process.

**Test Steps:**
1. Launch the restaurant ordering website.
2. Enter customer details.
3. Browse the restaurant menu.
4. Add a food item to the cart.
5. Open the shopping cart.
6. Select **Pay at Counter**.
7. Complete the checkout process.
8. Verify the order confirmation message.
9. Verify that the order number is displayed.
10. Verify the payment method.
11. Verify the displayed order total.

**Expected Result:** The system should confirm the order and display the order details, payment method, and total amount.

**Execution Status:** PASSED

## 📁 Project Structure

```text
DigitalDineIn_AutomationTesting/
│
├── Object Repository/
│   └── Page_Digital Dine-In Smart QR Restaurant Ordering/
│       └── Captured Web Elements
│
├── Scripts/
│   └── Automation Test Scripts
│
├── Test Cases/
│   ├── TC01_Verify_Restaurant_Menu
│   ├── TC02_Verify_Food_Search
│   ├── TC03_Verify_Add_To_Cart
│   ├── TC04_Verify_Cart_Item
│   └── TC05_Verify_Checkout
│
├── Test Suites/
│   └── TS_DigitalDineIn_EndToEnd
│
└── DigitalDineIn_AutomationTesting.prj
```

## ▶️ How to Execute the Automation Tests

### Prerequisites

- Install Katalon Studio.
- Install Google Chrome.
- Ensure a stable internet connection.
- Download or clone this GitHub repository.

### Step 1 – Clone the Repository

```bash
git clone https://github.com/chiruthalanaveen/DigitalDineIn_AutomationTesting.git
```

### Step 2 – Open the Project

1. Launch Katalon Studio.
2. Select **File → Open Project**.
3. Navigate to the cloned project folder.
4. Open `DigitalDineIn_AutomationTesting.prj`.

### Step 3 – Execute Individual Test Cases

1. Expand the **Test Cases** folder.
2. Select the required test case.
3. Click **Run**.
4. Select **Chrome**.
5. Observe the automation execution.

### Step 4 – Execute the Complete Test Suite

1. Expand the **Test Suites** folder.
2. Open `TS_DigitalDineIn_EndToEnd`.
3. Click **Run**.
4. Select **Chrome**.
5. Wait for all five test cases to complete.

### Step 5 – View Test Results

After execution:

1. Open the **Log Viewer**.
2. Review individual test case results.
3. Open the generated test execution report.
4. Verify the test suite summary.

## 📊 Test Execution Results

**Test Suite:** `TS_DigitalDineIn_EndToEnd`

**Execution Date:** 19 November 2026

**Execution Environment:** Windows 11, Google Chrome

| Test Case | Result | Duration |
|---|---|---|
| TC01 – Verify Restaurant Menu | PASSED | 17.875s |
| TC02 – Verify Food Search | PASSED | 10.174s |
| TC03 – Verify Add to Cart | PASSED | 10.044s |
| TC04 – Verify Cart Item | PASSED | 10.542s |
| TC05 – Verify Checkout | PASSED | 15.627s |

### Execution Summary

| Metric | Result |
|---|---|
| Total Test Cases | 5 |
| Passed | 5 |
| Failed | 0 |
| Errors | 0 |
| Incomplete | 0 |
| Skipped | 0 |
| Total Execution Time | 1 minute 4.793 seconds |
| Pass Percentage | 100% |

**Final Test Suite Status: PASSED**

All five automated test cases completed successfully during the recorded test suite execution.

## 🔍 Testing Approach

The project follows a functional end-to-end testing approach using Katalon Studio.

### Record and Playback

Katalon Web Recorder was used to capture user interactions with the restaurant ordering website.

### Object Repository

Web elements such as buttons, input fields, food items, cart controls, and checkout confirmation elements are maintained in the Object Repository.

### Test Validation

Katalon's built-in verification keywords are used to validate the presence of expected UI elements.

### Test Suite Execution

Individual test cases are grouped into a single test suite to execute the complete restaurant ordering workflow.

### Reporting

Katalon Studio generates execution logs and test reports for analyzing test results.

## 📈 Key Project Highlights

- Developed five automated functional test cases.
- Automated essential restaurant ordering workflows.
- Implemented web element verification.
- Organized test objects using Katalon's Object Repository.
- Created an end-to-end test suite.
- Executed automated tests using Google Chrome.
- Generated test execution reports.
- Achieved a 100% pass rate in the recorded test suite run.
- Published the automation project on GitHub.

## 🚀 Future Enhancements

Potential improvements include:

- Data-driven testing using external test data.
- Negative testing for invalid customer inputs.
- Additional cart quantity and pricing validations.
- Cross-browser testing.
- Reusable custom keywords.
- CI/CD integration using GitHub Actions.
- Automated test execution on every code update.
- Improved reporting and test evidence management.

## 👤 Author

**Chiruthala Naveen**

**Project:** DigitalDineIn Automation Testing

**GitHub:** https://github.com/chiruthalanaveen

**Repository:** https://github.com/chiruthalanaveen/DigitalDineIn_AutomationTesting

---

**DigitalDineIn Automation Testing — Automating restaurant ordering workflows with Katalon Studio.**
