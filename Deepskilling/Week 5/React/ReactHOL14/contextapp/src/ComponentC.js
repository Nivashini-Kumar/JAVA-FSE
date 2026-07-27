import React, { useContext } from "react";
import UserContext from "./UserContext";

function ComponentC() {

    const user = useContext(UserContext);

    return (
        <div>
            <h2>Component C</h2>

            <h3>Welcome {user}</h3>
        </div>
    );
}

export default ComponentC;
