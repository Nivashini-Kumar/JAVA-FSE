# Git Hands-on Lab 4 - Merge Conflict Resolution

## Objective

Learn how merge conflicts occur and resolve them using Git.

## Topics Covered

- Creating conflicting changes
- Comparing branches
- Resolving merge conflicts
- Updating `.gitignore`
- Finalizing merge

## Files Used

- hello.xml
- .gitignore

## Commands Practiced

```bash
git checkout -b GitWork
git add .
git commit -m "Updated branch"
git checkout main
git merge GitWork
git status
git add .
git commit -m "Resolved merge conflict"
git branch -d GitWork
```

## Learning Outcome

Successfully identified, resolved, and committed merge conflicts while maintaining repository consistency.
