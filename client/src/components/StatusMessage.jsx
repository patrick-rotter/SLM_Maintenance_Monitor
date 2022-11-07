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
    const interval = setInterval(getMessage, 1000);
    return () => clearInterval(interval);
  }, []);

  return (
    <div style={{ backgroundColor: message ? "red" : "green" }}>
      <h1>Maintenance Monitor</h1>
      <div>{message}</div>
      <div>last update: {date.toLocaleTimeString("fr-FR")}</div>
    </div>
  );
};
