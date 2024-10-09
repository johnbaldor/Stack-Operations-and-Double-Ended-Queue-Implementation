Stack Operations and Double-Ended Queue Implementation

This project focused on implementing various data structures and operations using Java, including stack manipulation for arithmetic expressions, postfix evaluation, deque (double-ended queue) management, and undo/redo functionality. The tasks involved enhancing an arithmetic expression evaluator, converting postfix expressions, implementing a deque with array-based storage, and supporting multi-level undo/redo operations.


Features

Stack Operations: Modified an existing stack-based evaluator to support new arithmetic operations (exponentiation and logarithms) and handled edge cases with invalid expressions.

Postfix Expression Evaluation: Converted postfix notation to infix with appropriate parentheses and evaluated the resulting arithmetic expression.

ArrayDeque Implementation: Developed an array-based double-ended queue (deque) that supports insertion and removal from both ends, as well as peek operations and clearing the queue.

Undo/Redo Manager: Implemented an undo/redo manager using the deque to maintain a history of operations, supporting multi-level undo and redo functionalities.


Skills Used

Data Structure Implementation: Developed stack and deque structures from scratch, understanding their properties and runtimes.
Algorithm Development: Worked with arithmetic expression parsing and manipulation using stacks.
Object-Oriented Programming (OOP): Followed OOP principles to create modular and reusable code.
JUnit Testing: Created comprehensive test cases to verify the correctness of stack operations, deque methods, and the undo/redo manager.
Code Optimization: Ensured efficient implementations with appropriate runtimes for each operation (O(1) for deque insertions and deletions, O(N) for some queue adjustments).


How to Run

Stack Operations: Execute the ImprovedEvaluate class with the required input expressions for evaluation.
Postfix Evaluation: Run PostfixToInfix with postfix expressions as input.
Deque Operations: Use the ArrayDeque class to test deque methods such as enqueue, dequeue, inject, removeLast, etc.
Undo/Redo Manager: Perform operations using the UndoRedoManager class to see undo/redo functionality in action.
