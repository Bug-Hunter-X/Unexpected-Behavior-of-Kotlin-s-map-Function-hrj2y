# Unexpected Behavior of Kotlin's map Function

This example demonstrates an often overlooked aspect of the `map` function in Kotlin: it doesn't modify the original list; instead, it returns a *new* list containing the transformed elements.  This can lead to unexpected results if you assume in-place modification.

The `bug.kt` file shows the unexpected behavior, while `bugSolution.kt` offers a potential workaround if modification of the original list is needed.  This is a common source of confusion for developers new to Kotlin's functional programming features.  Careful attention to this behavior is essential for writing correct and predictable code.