# Git Hands-on Lab 3 - Branching and Merging

## Objective

Understand Git branching, switching between branches, merging changes, and cleaning up merged branches.

## Topics Covered

- Creating branches
- Switching branches
- Committing changes
- Merging branches
- Viewing commit history
- Deleting merged branches

## Commands Practiced

```bash
git branch GitNewBranch
git checkout GitNewBranch
git status
git add .
git commit -m "Updated branch"
git checkout main
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
```

## Learning Outcome

Created and merged a feature branch successfully while maintaining the project history using Git.
