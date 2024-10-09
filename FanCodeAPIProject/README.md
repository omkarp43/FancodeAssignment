


This project is a Test Automation framework built using Java, TestNG, and Rest-Assured for API testing. It tests whether users from the city `FanCode` have completed more than 50% of their tasks.

## Project Structure

```
FanCodeAPIProject/
│
├── pom.xml                          # Maven build configuration file
├── .gitignore                       # Git ignore file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/fancode/
│   │           ├── api/             # API Client and services
│   │           ├── model/           # POJO classes for API responses
│   │           └── utils/           # Utility classes (e.g., filters)
│   └── test/
│       └── java/
│           └── com/fancode/test/    # TestNG test cases
└── README.md                        # Project readme (this file)
```


## Setup

1. **Clone the Repository:**
   - Unzip the project file or clone it from your GitHub repository (after uploading).
   - Open a terminal in the root folder of the project.

2. **Install Dependencies:**
   Run the following command in the terminal to download the required dependencies (defined in `pom.xml`):
   ```bash
   mvn clean install
   ```

3. **Run Tests:**
   Use the following command to execute the tests via Maven:
   ```bash
   mvn test
   ```

4. **Verify Test Results:**
   After running the tests, the results will be displayed in the terminal, showing which tests passed and failed.

