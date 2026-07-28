function App() {

  const loggedIn = true;

  return (
    <div>
      <h2>Conditional Rendering</h2>

      {loggedIn ? (
        <h3>Welcome User</h3>
      ) : (
        <h3>Please Login</h3>
      )}

    </div>
  );
}

export default App;