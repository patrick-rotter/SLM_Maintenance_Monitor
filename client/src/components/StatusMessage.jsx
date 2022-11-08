import { useEffect, useState } from "react";

export const StatusMessage = () => {
  const [message, setMessage] = useState("test");
  const [date, setDate] = useState(new Date());

  const getMessage = () => {
    fetch("http://localhost:80/message")
      .then((res) => res.json())
      .then((data) => setMessage(data));

    if (data !== message) {
      setDate(new Date());
    }
  };

  useEffect(() => {
    const interval = setInterval(getMessage, 5000);
    return () => clearInterval(interval);
  }, []);

  return (
    <div
      className="container"
      style={{ backgroundColor: message ? "#ff6666" : "#b3ff99" }}
    >
      <h1>Maintenance Monitor</h1>
      <div className="message">{message}</div>
      <div>last update: {date.toLocaleTimeString("fr-FR")}</div>
    </div>
  );
};
