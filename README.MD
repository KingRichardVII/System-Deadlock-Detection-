# System Deadlock Detection
## *By Richard Phan*

### Description
This java project simulates system deadlock detection using arrays to represent relationships between processes and resources. It allows users to dynamically modify process-resource relations and analyze the system state to determine if a deadlock exists.

### Deadlock Summary
A deadlock occurs when two or more processes are each waiting for resources held by the others, creating a circular dependency that halts progress.

Each process–resource relationship can be represented as:
- `0`: No relation
- `1`: Process requests the resource
- `2`: Process is allocated the resource

This data is provided in the relation.java file

### Features
The program provides a menu-driven interface with the following options:

1. **Print the process-to-resource relations** : Displays all current relations between processes and resources.

2. **Change a process-to-resource relation**:
Allows users to edit a specific process-resource relation (set to 0, 1, or 2).
Includes validation to prevent invalid allocations (e.g., allocating an already allocated resource).

3. **Detect the system for deadlock**: 
Checks for cycles in the process-resource graph using recursive detection.
If a deadlock exists, the program prints all relations involved in the cycle.

4. **Quit the program**: 
Exits gracefully with a goodbye message.

### Class Structure
`Project2.java`
- Global variables
    - `Scanner input`
    - `Relation[] process`
- Core methods
    - `printRelations()`
    - `changeRelations()`
    - `detectDeadlock()`
    - `detectDeadlockRecursively()`
    - `main()`

`Relation.java`

### Run Instructions
1. Download files
    - `Project2.java`
    - `Relation.java`
2. Run in IDE of choice (Eclipse, VS Code, jGRASP)
### Sample Output

```markdown
[View the full sample output](https://github.com/username/repo-name/blob/main/sample_output.txt)


