function App() {

  function showMessage() {
    alert("Button Clicked");
  }

  return (
    <div>
      <h2>Event Handling</h2>

      <button onClick={showMessage}>
        Click Me
      </button>
    </div>
  );
}

export default App;