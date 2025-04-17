
# Leap Year Checker in Java

This Java program checks whether a given year is a leap year or not using standard leap year rules. It takes a year as input from the user and prints whether the year is a leap year.

## 📌 What is a Leap Year?
A leap year is a year that occurs every 4 years to help synchronize the calendar year with the solar year. A leap year has 366 days instead of the usual 365, with an extra day added in February (February 29).

### Leap Year Rules:
A year is a leap year if:
- It is divisible by 4 **and**
- Not divisible by 100 **unless** it is divisible by 400

### Examples:
- 2000 → Leap Year ✅ (divisible by 400)
- 1900 → Not a Leap Year ❌ (divisible by 100 but not by 400)
- 2012 → Leap Year ✅ (divisible by 4 and not 100)
- 2023 → Not a Leap Year ❌ (not divisible by 4)

---

## ✅ Java Program Code

```
import java.util.Scanner;

public class LeapYearOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
```

## 💡 Output Example
```
Enter the Year
2024
Leap Year
```

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-LeapYear_Or_Not.git
```
