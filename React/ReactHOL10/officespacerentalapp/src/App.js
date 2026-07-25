import officeImage from "./Images/office.jpg";
import "./App.css";

function App() {

  const office = {
    name: "Tech Park Office",
    rent: 55000,
    address: "Chennai, Tamil Nadu"
  };

  const officeList = [
    {
      id: 1,
      name: "Tech Park Office",
      rent: 55000,
      address: "Chennai"
    },
    {
      id: 2,
      name: "Business Hub",
      rent: 70000,
      address: "Bangalore"
    },
    {
      id: 3,
      name: "Corporate Center",
      rent: 85000,
      address: "Hyderabad"
    }
  ];

  return (
    <div className="App">

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        className="officeImage"
      />

      <h2>Featured Office</h2>

      <p><strong>Name:</strong> {office.name}</p>

      <p>
        <strong>Rent:</strong>

        <span
          style={{
            color: office.rent < 60000 ? "red" : "green"
          }}
        >
          ₹ {office.rent}
        </span>

      </p>

      <p><strong>Address:</strong> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item) => (

          <div key={item.id} className="card">

            <h3>{item.name}</h3>

            <p>
              Rent :
              <span
                style={{
                  color: item.rent < 60000 ? "red" : "green"
                }}
              >
                ₹ {item.rent}
              </span>
            </p>

            <p>Address : {item.address}</p>

          </div>

        ))
      }

    </div>
  );

}

export default App;
