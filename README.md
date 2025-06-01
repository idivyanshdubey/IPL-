# IPL- 🏏

Welcome to **IPL-**, an interactive platform for exploring, analyzing, and visualizing Indian Premier League (IPL) cricket data. This project is designed as a modern, modular web application:

- **Frontend:** Angular
- **Backend:** Spring Boot (Java)
- **Database:** MySQL

---

## ✨ Key Features

- **Interactive Data Exploration:** Browse IPL matches, teams, players, and seasons with ease.
- **Powerful Visualizations:** Analyze runs, wickets, player stats, win/loss ratios, and more through dynamic charts and graphs.
- **Extensible & Modular Design:** Effortlessly add new datasets or extend analytical capabilities as your needs grow.

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/idivyanshdubey/IPL-.git
cd IPL-
```

### 2. Set Up the Backend

1. **Install Java & Maven:**  
   Ensure you have Java 17+ and Maven installed.
2. **Configure MySQL:**  
   - Create a new MySQL database (e.g., `ipl_db`).
   - Update your database credentials in `src/main/resources/application.properties`.
3. **Run the Spring Boot Server:**  
   ```bash
   mvn spring-boot:run
   ```

### 3. Set Up the Frontend

1. **Install Node.js & npm:**  
   Make sure you have Node.js (v16+) and npm installed.
2. **Navigate to the Frontend Directory:**  
   ```bash
   cd frontend
   ```
3. **Install Dependencies:**  
   ```bash
   npm install
   ```
4. **Run the Angular App:**  
   ```bash
   ng serve
   ```
   The app will be available at [http://localhost:4200](http://localhost:4200).

---

## 🗃️ Project Structure

```text
IPL-/
│
├── backend/            # Spring Boot backend (Java)
│   └── src/
│       └── ...
├── frontend/           # Angular frontend (TypeScript)
│   └── src/
│       └── ...
├── database/           # MySQL schema and seed data
├── README.md
└── ...
```

---

## 📊 Example Visualizations

- **Top Run Scorers by Season**
- **Best Bowling Figures**
- **Team Win/Loss Trends**
- **Player Performance Over Time**

---

## 🤝 Contributing

Contributions are welcome! Please open an issue or submit a pull request for new features, bug fixes, or improvements.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙌 Acknowledgements

- [IPL Official Data](https://www.iplt20.com/stats/all-time)
- [Angular](https://angular.io/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)

---

**Enjoy exploring the IPL like never before! 🏆**
