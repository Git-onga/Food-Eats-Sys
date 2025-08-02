# 🍽️ Food-Eats Java Program

A simple console-based food ordering system developed in Java. This project simulates a restaurant experience where users can view a menu, place orders, and receive a receipt for their payment.

---

## 📌 Features

- View a menu of available food items
- Place orders as a customer
- Generate a receipt with total cost
- Simulate basic customer interactions
- Organized object-oriented structure

---

## 🏗️ Project Structure

The program is composed of the following Java classes:

| Class     | Description |
|-----------|-------------|
| `Main`    | Entry point of the application. Launches the program and connects other classes. |
| `Customer`| Manages customer information and interaction. |
| `Menu`    | Displays the list of food items and redirects to the `Food` and `Order` classes. |
| `Food`    | Contains the available food items and prices. |
| `Order`   | Handles customer orders and their selection of food. |
| `Receipt` | Generates and displays the final bill and order summary. |

---

## 🧪 How It Works

1. Program starts via the `Main` class.
2. Users are presented with a menu (via `Menu` class).
3. If an order is placed:
   - The `Food` class provides item options.
   - The `Order` class processes selections.
   - The `Receipt` class generates a payment summary.
4. The flow mimics a basic ordering and checkout system.

---

## 🚀 Getting Started

### Prerequisites
- Java JDK installed (version 8+)
- Terminal or any IDE (e.g., IntelliJ, Eclipse)

### Running the Program

1. Clone or download the project files.
2. Compile the code:
   ```bash
   javac *.java
