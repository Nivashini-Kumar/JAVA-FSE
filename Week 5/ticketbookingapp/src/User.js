import React from "react";
import FlightDetails from "./FlightDetails";

function User() {
    return (
        <div>
            <h2>Welcome User</h2>

            <p>You can now book your flight tickets.</p>

            <FlightDetails />

            <br />

            <button onClick={() => alert("Ticket Booked Successfully!")}>
    Book Ticket
</button>
        </div>
    );
}

export default User;
