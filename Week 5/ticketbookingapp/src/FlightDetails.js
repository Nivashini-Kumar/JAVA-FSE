import React from "react";

function FlightDetails() {
    return (
        <div>
            <h2>Flight Details</h2>

            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Price</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                        <td>₹6500</td>
                    </tr>

                    <tr>
                        <td>AI202</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                        <td>₹5200</td>
                    </tr>

                    <tr>
                        <td>AI303</td>
                        <td>Hyderabad</td>
                        <td>Kolkata</td>
                        <td>₹4800</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default FlightDetails;
