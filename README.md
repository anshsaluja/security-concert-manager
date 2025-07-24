# 🎤 Concert Security Manager

A Java-based command-line application that simulates a dynamic line management system for a stadium security check during a concert. Inspired by a K-pop (TWICE 💖) concert, the program ensures attendees line up based on seat number while keeping all lines balanced in size.

---

## 📁 Project Structure

```
src/
├── AllLinesEmptyException.java
├── InvalidLineCountException.java
├── Line.java
├── LineDoesNotExistException.java
├── Person.java
├── SecurityCheck.java
├── SecurityManager.java  ← Contains the main method
├── SingleLineRemovalException.java
└── TakenSeatException.java
```

---

## 🧠 Features

- ✅ Add attendee in ascending seat order
- ✅ Maintain balanced lines (difference of at most 1 person)
- ✅ Dynamically add/remove security lines
- ✅ Remove the next attendee (not necessarily lowest seat number)
- ✅ Print all lines and their attendees
- ✅ Robust exception handling (custom exceptions included)

---

## 🛠️ Data Structures Used

- **Singly Linked Lists**:
  - Each person in a line
  - Each line in the system
- **Custom Exceptions**:
  - `TakenSeatException`
  - `AllLinesEmptyException`
  - `InvalidLineCountException`
  - `LineDoesNotExistException`
  - `SingleLineRemovalException`

---

## 🖥️ How to Compile & Run

### ✅ Compile:
```bash
javac src/*.java
```

### ▶️ Run:
```bash
java src.SecurityManager
```

---

## 🧪 Sample Menu

```
Menu:
(A) – Add Person
(N) – Next Person
(R) – Remove Lines
(L) – Add New Lines
(P) – Print All Lines
(Q) – Quit
```

---

## 📌 Example Output

```
Line 1: 2 People Waiting
Line 2: 2 People Waiting
Line 3: 2 People Waiting

| Line | Name            | Seat Number |
========================================
| 1    | Alan Turing     | 2           |
| 1    | Jennifer Mejia  | 5           |
| 2    | Min-Gi Park     | 4           |
| 2    | James Bond      | 9           |
| 3    | Kyril Zlotnikov | 8           |
| 3    | James Haverdish | 7           |
```

---

## 🛡️ Notes

- The next person removed is **not always** the one with the lowest seat number—it's based on balance.
- Fully modular and uses **no `ArrayList` or built-in collection classes**.
- Uses **core Java only** (`java.util`, `java.io`).

---

##  License

This project is not open source. All rights reserved © 2025 Ansh Saluja.
