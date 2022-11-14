import { useEffect, useState } from "react";

export const StatusMessage = () => {
  const [message, setMessage] = useState();
  const [date, setDate] = useState(new Date());

  const getMessage = async () => {
    fetch("http://localhost:8080/message")
      .then((res) => res.text())
      .then((res) => setMessage(res))
      .catch((err) => console.log(err));

    setDate(new Date());
  };

  useEffect(() => {
    const interval = setInterval(getMessage, 5000);
    return () => clearInterval(interval);
  }, []);

  const red = "#ff6666";
  const green = "#b3ff99";

  return (
    <div
      className="container"
      style={{ backgroundColor: message ? red : green }}
    >
      <h1>Maintenance Monitor</h1>
      <div className="message">{message}</div>
      <div>last update: {date.toLocaleTimeString("fr-FR")}</div>
    </div>
  );
};
