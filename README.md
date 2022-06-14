Manage Jenkins  => configure system  => global pipeline libraries  => add name of shared library  => populate default version with main 
Select modern SCM as retrieval method and add shared library repo url
Go to github and configure a repo ( your shared library repo) 
creat var directory using camel casing
def call (String repoUrl){
echo 'git clone $repoUrl'
}
Create vars folder
Step 2: Create Groovy file
Step 3: Create call() function inside Groovy file
Step 4: confugure under the Library section.
Save changes
.........................................................................
Now that our shared library is configured in Jenkins, let’s create a new Jenkins job to utilize this Jenkins pipeline library.
Step 1: In Jenkins, click on New Item on the left side menu, enter Jenkins job name & choose the pipeline as style & click on the OK button.
Step 2: Inside the job, scroll down to the pipeline section. Here we need our Jenkinsfile, which refers to the Shared Library. Loading Jenkinsfile into Jenkins job can be done via two approaches.
Step 3: Click on Build Now button on the left side menu to trigger the build.
Once the build is complete, check the logs by clicking on the Console
