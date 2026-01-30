-----1-----------

mkdir Git_Lab_Experiment1
cd Git_Lab_Experiment1
git init
ls
ls -a
git config --global user.name "Your Name"
git config --global user.email your_email@example.com
echo "This is my first Git experiment" > README.txt
git status
git add README.txt
git add .
git status
git commit -m "Initial commit"
echo "Git tracks file changes" >> README.txt
git status
git add README.txt
git commit -m "Updated README file"
git log

------2-------
mkdir sec_exp
cd sec_exp
git init
git branch
git branch feature-branch
git checkout feature-branch
git status
git add .
git commit -m "Added new feature in feature branch"
git checkout main
git status
git add .
git commit -m "Updated file in main branch"
git merge feature-branch
git add .
git commit
git log --oneline
git branch -d feature-branch

------3--------

git config --global user.name "Your Name"
git config --global user.email "your_email@example.com"
git config --global --list
cd Desktop
git clone https://github.com/YourUsername/git-lab-demo.git
cd git-lab-demo
git init
git remote add origin https://github.com/YourUsername/git-lab-demo.git
git pull origin main
touch main.py
git add main.py
git commit -m "Add main.py file"
git push -u origin main
git fetch origin
git log origin/main
git merge origin/main
git pull origin main


------4-------

git clone <repository-url>
cd Git_PullRequests
touch file1.txt
echo "This file is created in master branch" > file1.txt
git status
git add file1.txt
git commit -m "Initial commit in master"
git push origin main
git pull origin main
git branch feature-1
git checkout feature-1
echo "This change is from feature-1 branch" >> file1.txt
touch feature.txt
echo "Feature branch file" > feature.txt
git status
git add .
git commit -m "Changes done in feature-1"
git push origin feature-1
git checkout master
git pull origin master
git log --oneline
git branch -d feature-1
git push origin --delete feature-1


-------5-------
git pull origin main
git tag v1.0
git tag
git tag -a v1.2 -m "v1.2 Created"
git tag
git show v1.0
git tag -l "v1.*"
git push origin v1.0
git tag v2.0
git push --tags
git tag -d v1.0
git push origin -d v1.0


-----6----------
mvn --version
mvn archetype:generate
2309
 9
com.bnmit
sample-app
1.0-SNAPSHOT
 com.bnmit
y
mvn package
mvn clean
mvn site
Output:
target/site/index.html
Open index.html in a browser to explore documentation.
Modify Source Code
Path:
sample-app/src/main/java/com/bnmit/App.java
Rename File
App.java → BankService.java
Clean Project
mvn clean

Step 18: Build Project
mvn package

Result:

target/classes contains:

BankAccount.class

BankService.class

Step 19: Navigate to Target Directory
cd target

Step 20: Execute the Application
java -cp sample-app-1.0-SNAPSHOT.jar com.bnmit.BankService

Output:
Final Balance: 1200.0
s
