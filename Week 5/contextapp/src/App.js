import React from "react";
import UserContext from "./UserContext";
import ComponentA from "./ComponentA";

function App() {

    return (
        <UserContext.Provider value="Nivashini">
            <div style={{ padding: "20px" }}>
                <h1>React Context API Example</h1>

                <ComponentA />
            </div>
        </UserContext.Provider>
    );
}

export default App;
