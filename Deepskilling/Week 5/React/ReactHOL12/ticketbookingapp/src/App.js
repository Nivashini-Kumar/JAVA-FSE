import React, { Component } from "react";
import Guest from "./Guest";
import User from "./User";

class App extends Component {

    constructor() {
        super();

        this.state = {
            isLoggedIn: false
        };
    }

    login = () => {
        this.setState({ isLoggedIn: true });
    };

    logout = () => {
        this.setState({ isLoggedIn: false });
    };

    render() {

        return (
            <div style={{ padding: "20px" }}>
                <h1>Ticket Booking App</h1>

                {this.state.isLoggedIn ? (
                    <div>
                        <button onClick={this.logout}>Logout</button>
                        <User />
                    </div>
                ) : (
                    <div>
                        <button onClick={this.login}>Login</button>
                        <Guest />
                    </div>
                )}
            </div>
        );
    }
}

export default App;
