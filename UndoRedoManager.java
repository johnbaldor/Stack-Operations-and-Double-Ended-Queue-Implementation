/*
 * UndoRedoManager.java
 *
 * Author: Your Name
 * Submitted on: Insert Date
 *
 * Academic Honesty Declaration:
 *
 * The following code represents my own work and I have neither received nor given assistance
 * that violates the collaboration policy posted with this assignment. I have not copied or modified code
 * from any other source other than the homework assignment, course textbook, or course lecture slides.
 * Any unauthorized collaboration or use of materials not permitted will be subjected to academic integrity policies of
 * WPI and CS 2223.
 *
 * I acknowledge that this homework assignment is based upon an assignment created by WPI and that any publishing or
 * posting of this code is prohibited unless I receive written permission from WPI.
 */
package wpialgs.hw01;

/**
 * This class uses the {@link IDeque} and {@link ArrayDeque} to implement a multi-level undo and redo functionality.
 *
 * @version 1.0
 */
public class UndoRedoManager {

    // ===========================================================
    // Member Fields
    // ===========================================================

    public IDeque<String> undoStack;
    public IDeque<String> redoStack;

    // ===========================================================
    // Constructors
    // ===========================================================

    /**
     * <p>
     * This creates a new multi-level undo and redo manager.
     * </p>
     */
    public UndoRedoManager() {
        undoStack = new ArrayDeque<>(100);
        redoStack = new ArrayDeque<>(100);
    }

    // ===========================================================
    // Public Methods
    // ===========================================================

    /**
     * <p>
     * Adds a new operation that can be undone and clears all redo operations.
     * </p>
     * <p>
     * <strong>Note:</strong> For simplicity, all of our operations will be a {@link String}.
     * </p>
     *
     * @param op
     *            A new operation to be performed.
     */
    public void performOperation(String op) {
        undoStack.enqueue(op);
        redoStack.clear();
    }

    /**
     * <p>
     * It undos the most recent operation and adds it as a new one we can redo.
     * </p>
     */
    public void undo() {
        String operation = undoStack.removeLast();
        redoStack.inject(operation);
    }

    /**
     * <p>
     * It redo the most recent operation and adds it as a new one we can undo.
     * </p>
     */
    public void redo() {
        String operation = redoStack.dequeue();
        undoStack.enqueue(operation);
    }

    /**
     * <p>
     * Use the deque's {@code toString()} method to generate a string representation of the operations you can undo.
     * </p>
     */
    public String allUndosAsString() {
        return undoStack.toString();
    }

    /**
     * <p>
     * Use the deque's {@code toString()} method to generate a string representation of the operations you can redo.
     * </p>
     */
    public String allRedosAsString() {
        return redoStack.toString();
    }

    /**
     * <p>
     * Removes all operations.
     * </p>
     */
    public void clear() {
        undoStack.clear();
        redoStack.clear();
    }
}
