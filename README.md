# How to Run

## Single File Run

Entrypoint of the application is in `App.java`. Make sure you have the JDK for Java 11+ installed on your machine and run using the following command
```
java App.java
```
You may also use the provideed `run.sh` for convenience

## Docker

Make sure you have Docker installed and run the following commands
```
docker build -t practicum .
docker run --it practicum
```
You may also use the provided `docker-compose.yaml` by using the following command
```
docker compose run --rm practicum
```

# Assignment For

Data Structures and Algorithm Analysis

COSC6025036 (JSCA - LEC) Session 7

**Start** 25 Agt 2025, 00:00 GMT+7

**End** 15 Sep 2025, 12:00 GMT+7

# Members

1. Muhammad Raditya Albani Ekmal (2802643702)
2. Jessica Freza Kumala (2802642776)
3. Fathurrahman Masngudi (2802644535)
4. Andi Ahmad Yusup (2802654246)
5. Yudhistira Tribuana Authar (2802629824)

# File Structure

```
├── App.java <= Entrypoint
├── Menu.java
├── Book.java
├── BookList.java
├── User.java
├── Admin.java
└── Member.java
```

# Tasks

### Login

Prompt user for name, id, and role at app start to create the appropriate subclass

### BookList

Implement methods inside of BookList class

- findBook
- returnBook
- findBook

### Implement book borrowing logic

Book class should keep track who it is being borrowed by

### Fill Admin and Member class

I don't know what to fill these with
