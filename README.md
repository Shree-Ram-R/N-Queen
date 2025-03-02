# N-Queens Problem
The N-Queens Problem is a classic combinatorial puzzle that involves placing N queens on an N×N chessboard such that no two queens threaten each other. The challenge is to find all possible configurations where the queens are placed in a way that no two queens share the same row, column, or diagonal.

### Problem Description:
The task is to place N queens on an N×N chessboard so that no two queens are in the same row, column, or diagonal. The program should find all possible solutions to this problem, ensuring that the queens are placed in a valid configuration.

### Algorithm:
The solution uses a backtracking approach to recursively try to place queens row by row.
At each step, the algorithm checks for conflicts in columns and diagonals. If a conflict is found, it backtracks and tries the next possible position.
Once a valid configuration is found (i.e., all queens are placed correctly), the solution is recorded.

### Features:
Backtracking Algorithm: The solution employs a backtracking technique to explore all possible placements and prune invalid configurations early in the search.
Efficient Conflict Detection: Ensures that no two queens share the same column or diagonal by tracking the attacked columns and diagonals.
Output: Displays all valid configurations of queen placements on the chessboard.

### How to Run:
Clone the repository.
Run the program with an integer N (size of the chessboard).
The program will output all possible valid solutions, displaying the placement of queens on the board for each configuration.
Usage Example:

n = 4  # Size of the chessboard
solveNQueens(n)

### Technologies Used:
Programming Language: Python/Java/C++ (adjust based on your implementation)
Problem Solving: Backtracking, Recursion

### Output:
![image](https://github.com/user-attachments/assets/6e9d91b6-9dd3-4031-9b2e-de0e95b0f538)

### Conclusion:
This README description provides a clear and concise explanation of the N-Queens Problem, the algorithm used, and basic instructions for running the solution. It’s designed to be easily understood for anyone browsing your GitHub repository.
