function App() {

  const students = [
    "Abishek",
    "Rahul",
    "Kavin",
    "Vijay",
    "Arun"
  ];

  return (
    <div>
      <h2>Student List</h2>

      <ul>
        {students.map((student, index) => (
          <li key={index}>{student}</li>
        ))}
      </ul>

    </div>
  );
}

export default App;