----area of square-----
import java.util.Scanner;

class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of square = " + area);
    }
}
-----simple intrest------
import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int p = sc.nextInt();

        System.out.print("Enter Rate: ");
        int r = sc.nextInt();

        System.out.print("Enter Time: ");
        int t = sc.nextInt();

        int si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}

----prime number--------

import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}

------------length of string--------------
import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of string = " + str.length());
    }
}
----------alternate prime count--------------
import java.util.Scanner;

class AlternatePrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int primeCount = 0;

        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2) {   // prime number
                primeCount++;

                if (primeCount % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}



-----------bank-------------
import java.util.Scanner;

class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice, amount;

        System.out.println("1 Deposit");
        System.out.println("2 Withdraw");
        System.out.println("3 Balance");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount: ");
            amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("Balance = " + balance);
        }

        else if (choice == 2) {
            System.out.print("Enter amount: ");
            amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Balance = " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        else if (choice == 3) {
            System.out.println("Balance = " + balance);
        }

        else {
            System.out.println("Invalid choice");
        }
    }
}

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



https://your-jenkins-instance.com



pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
pipeline {
    agent any

    stages {
        stage('Sum of Two Numbers') {
            steps {
                script {
                    int a = 10
                    int b = 20
                    int sum = a + b
                    echo "Sum of ${a} and ${b} is: ${sum}"
                }
            }
        }
    }
}
