## ⚙️ Installation & Setup

Follow the Dumbass steps to set up the project.

### 1. Database Setup (Importing)
1.  Open **XAMPP** and start **Apache** and **MySQL**.
2.  Open your browser and go to `http://localhost/phpmyadmin`.
3.  Create a new database named **`Velasquez_DB`**.
4.  Click the **Import** tab.
5.  Click **Choose File** and select the `Velasquez_DB.sql` file located inside this project folder.
6.  Click **Go**.

### 2. Project Files Setup
Ensure the following folder structure exists inside the main project directory (where `src` and `build.xml` are located):

```text
OOP_Inventory_System/
│
├── src/                  # Source code
├── Project_Files/       
│   ├── Prelim_Folder/    # Put your Prelim files here
│   ├── Midterm_Folder/   # Put your Midterm files here
│   └── Finals_Folder/    # Put your Finals files here
│
├── Velasquez_DB.sql      # Database Backup
└── ...
```

### 3. IDE Configuration
1.  Open **NetBeans**.
2.  Go to **File > Open Project** and select this folder.
3.  Right-click the project name > **Properties** > **Libraries**.
4.  Ensure the **MySQL JDBC Driver** is added. If it is missing, remove it and add the JAR file located on your computer.

## 🗄️ Database Structure

If you need to create the database manually, run this SQL query in phpMyAdmin:

```sql
-- Create Database
CREATE DATABASE IF NOT EXISTS Velasquez_DB;
USE Velasquez_DB;

-- Create Account Table
CREATE TABLE account (
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);

-- Create Projects Table
CREATE TABLE projects (
    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    project_name VARCHAR(255) NOT NULL,
    file_path VARCHAR(255) NOT NULL
);

-- Insert Default Folders
INSERT INTO projects (project_name, file_path) VALUES 
('Prelim', 'Prelim_Folder'),
('Midterm', 'Midterm_Folder'),
('Finals', 'Finals_Folder');
```

## 🖥️ How to Use

1.  **Run the App:** Right-click `login.java` or `registration.java` and select **Run File**.
2.  **Register:** Create a new account.
3.  **Login:** Use your credentials to access the dashboard.
4.  **Open Project:** Select a row (e.g., Midterm) in the table and click **"OPEN SELECTED FOLDER"**. The corresponding folder inside `Project_Files` will open on your desktop.

---
*Created for OOP Final Assessment - Velasquez, Gabriel E.*
