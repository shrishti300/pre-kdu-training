function add() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const result = num1 + num2;
    document.getElementById('result').innerText = `Result: ${result}`;
    alert(`Result of addition: ${result}`);
  }

  function subtract() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const result = num1 - num2;
    document.getElementById('result').innerText = `Result: ${result}`;
    alert(`Result of addition: ${result}`);
  }

  function multiply() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const result = num1 * num2;
    document.getElementById('result').innerText = `Result: ${result}`;
    alert(`Result of addition: ${result}`);
  }

  function divide() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    if (num2 === 0) {
      document.getElementById('result').innerText = "Cannot divide by zero";
      alert(`Cannot divide by zero`);
    } else {
      const result = num1 / num2;
      document.getElementById('result').innerText = `Result: ${result}`;
      alert(`Result of addition: ${result}`);
    }
  }