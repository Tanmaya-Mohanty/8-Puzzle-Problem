# 8-Puzzle Problem – Java AWT

This is a simple graphical implementation of the classic **8-Puzzle Problem** using **Java AWT** (Abstract Window Toolkit).  
Users can interact with the GUI to solve the puzzle by selecting directions to move the empty tile.

## 🧩 What is the 8-Puzzle?

The 8-puzzle consists of a 3x3 grid with 8 numbered tiles and one empty space.  
The objective is to rearrange the tiles to reach the goal configuration by sliding tiles into the empty space.

## 🚀 Features

- Graphical UI built with Java AWT
- Manual input support for direction control
- Real-time tile movement and board update
- Clean interface with directional prompt

## 🖥️ GUI Preview

![8-Puzzle GUI](<img width="567" height="464" alt="8-puzzle" src="https://github.com/user-attachments/assets/e7cadaf2-8243-4087-a5eb-87962f3cbe40" />
)

## 🎮 How to Play

1. Run the application.
2. The initial state of the puzzle is shown in a 3x3 grid.
3. Enter a direction in the input field using:
   - `l` for left
   - `r` for right
   - `u` for up
   - `d` for down
4. Click **Done** to perform the move.
5. Continue until you solve the puzzle!

## 📦 How to Run

Make sure you have Java installed. Then:

```bash
javac EightPuzzle.java
java EightPuzzle
