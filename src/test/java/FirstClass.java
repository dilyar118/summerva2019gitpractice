public class FirstClass {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("I am working until 5.10");

        /**
          1. Create framework
          2. Add files to the project
          3. Create local repository
          4. Commit to local repository
          5. Create romete repository
          6. Push to remote reopsitory




         Create a local repository
         1. Use terminal
         2. go to the right folder
         3. Git init   ---> create a new repo in the current folder/directory


         We get this confirmation message after running git init:
              Initialized empty Git repository in /Users/dilyaraerken/IdeaProjects/summerva2019gitpractice/.git/

         Git init is used only one time. We create the repo once.

         Git status --> shows the current status of the repository



         Create a gitignore file ----->  gitignore tells git which  files should be ignored by git. reports target folder some output
                folders should be ignored. they should not be tracked by git.

         1.Right click on the project
         2.New ---->    File
         3.Enter name:   .gitignore
         4. OK

         In the gitignore file we give the list of files and folder we want to ignore

         git add --> user to add files to index. This coomand is used to 2 things
         1. for the new files:  this command is used to add them to git and to index
         2. for files which are already tracked by git: this command is used to add to index

         git add .gitignore --> adding the file name .gitignore to index

         git add . --> add everthing to index

         git commit --> used to commit to local repository. All commits have a message. dont just
         say git commit commit with a message

         git commit -m "some_message'

         CREATE REPO IN GITHUB

                     1. Go to github.com
                     2. Login
                     3. Click on the plus icon on right and select New Repository
                     4. Enter name : ---->   summer-va-2019-git-practice
                     5. Click Create repository

         Once the online repo is created push our local repo to online repo. It has 2 steps
         1.We have point from local to the new remote. We do this only one time.

         git remote add origin https://github.com/CybertekSchool/summer-va-2019-git-practice.git

         2. Push the commits in the local repo. Every time we want to push to remote, we have to call this now
                        git push -u origin master

         git push  -->  sends the commits from local repo to the remote repo. you must use the same
         git username in GitHub and in your computer. We must have committed a change to the local repo
         before we can push.

         git pull  ---> takes the changes from remote (fetch) and merges with the local
         modified





         */
    }
}
