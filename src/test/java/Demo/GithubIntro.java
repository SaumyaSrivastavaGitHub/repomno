package Demo;

/*  GitHb - is a central repository where all the project code is being inserted, So ,
 *  that new joinee can take the code directly from there.   
 *
 * 
 * User will use Git to move the code from his local machine to Central Repository or GitHb repository .  . 
 * User will use Git commands . 
 *
 * Git is a version control system. Using Git we can actually maintain the 
 * versions , why we are saying this , because each updated code creates a new 
 * version of the application . 
 *
 *insert the code into certral repo (Github)
 *Take the code from  central repo 
 *
 *we can use normal command prompt to run Git commands .
 *
 *Steps - 
 *1. Create a local folder in your system as localrepo  
 *Navigate to this folder sing command prompt , means yahi pe command prompt open karlo 
 *
 *2. You have to initilize your local repo as a git recognizable local git repository
 *   git init
 *  .git will be created to confirm this (make sure , yor hidden elements selected , then only you will be able to see )
 *    
 * 3.  Register Your self with git . (You have to tell github that who is putting all this commands , you have to tell yor idnentity first)  
 *     git config --global user.name "Saumya"
 *     git config --global user.email "swamisrivastava555@gmail.com"
 *     
 *     
 * 4. Clone the GitHub repo to the loacl repo 
 *    git clone https://github.com/SaumyaSrivastavaGitHub/repomno.git
 *
 *5. Go inside the cloned project folder
 *
 *6. Copy all the Project files to te local Git Repo Folder 
 *
 *7. We have to commit before Pushing the code to the GitHub 
 *(Git will ask two times kind of confirmation)
 * There are 2 levels of commit -
 * Staging and Commit
 *  
 *Adding all the Project Files to Stagging - 
 *  git add*
 *Committing the code -
 *  git commit -m "first commit"  
 *  
 *  Giving the address of GitHub where we need to push the local repository code
 *  to Check the connection between local repo and central repo use this below command - 
    git remote add origin https://github.com/SaumyaSrivastavaGitHub/repomno.git
   (We can find this command ready for us in the GitHub page)

   Push the code to GitHub
   git push origin master

 Import this code into Eclipse IDE:
Launch Eclipse IDE from a different workspace
Import the Project from GitLocalRepo
Do some changes to the LocalRepo code
Check the changes, add to staging and commit
git status 
git add src/test/java/tests/TestFour.java
git status 
git commit -m "second commit comment"
git status
git push origin main
Modify directly from GitHub - Assuming other person has changed code
Get the latest code
git pull origin main
Create a new branch and switch to it
git checkout -b sbranch (create branch and switch)
Note: git checkout sbranch (Will only switch but not create)
git branch (To check the current branch)
Update some code and push to subbranch
Switch to master branch
git checkout main
git pull origin master (Get the latest code from master)
git status (Once everything clear we can go to next step)
Merge the branch to main
git merge devbranch
Merges to the active branch

 *  
 *
 *
 *
 *
 *
 *
 *
 */