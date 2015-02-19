# CorruptMind

I had this same problem and I was able to fix it. afk5min was right, the problem is the branch that you pulled code from has since changed on the remote repository. 
Per the standard git practices(http://git-scm.com/book/en/Git-Basics-Working-with-Remotes), you need to (now) merge those changes at the remote repository 
into your local changes before you can commit. This makes sense, this forces you to take other's changes and merge them into your code,
 ensuring that your code continues to function with the other changes in place.

Anyway, on to the steps.

    Configure the 'fetch' to fetch the branch you originally pulled from.

    Fetch the remote branch.

    Merge that remote branch onto your local branch.

    Commit the (merge) change in your local repo.

    Push the change to the remote repo.

In detail...

    1). In eclipse, open the view 'Git Repositories'.

    2). Ensure you see your local repository and can see the remote repository as a subfolder. In my version, it's called Remotes,
        and then I can see the remote project within that.

    3). Look for the green arrow pointing to the left, this is the 'fetch' arrow. Right click and select 'Configure Fetch'.

    4). You should see the URI, ensure that it points to the remote repository.

    5). Look in the ref mappings section of the pop-up. Mine was empty. This will indicate which remote references you want to fetch. Click 'Add'.

    6). Type in the branch name you need to fetch from the remote repository. Mine was 'master' (btw, a dropdown here would be great!!, for now, you have to type it). Continue through the pop-up, eventually clicking 'Finish'.

    7). Click 'Save and Fetch'. This will fetch that remote reference.

    8). Look in the 'Branches' folder of your local repository. You should now see that remote branch in the remote folder. Again, I see 'master'.

    9). Right-Click on the local branch in the 'Local' folder of 'Branches', which is named 'master'. Select 'Merge', and then select the remote branch, which is named 'origin/master'.

    10). Process through the merge.

    11). Commit any changes to your local repository.

    12). Push your changes to the remote repository.




