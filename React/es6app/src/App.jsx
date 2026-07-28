function App() {
  // let and const
  const name = "Abishek";
  let age = 20;

  // Arrow function
  const greet = () => {
    return "Welcome to ES6";
  };

  // Template literals
  const message = `${name} is ${age} years old.`;

  return (
    <div>
      <h2>{greet()}</h2>
      <p>{message}</p>
    </div>
  );
}

export default App;