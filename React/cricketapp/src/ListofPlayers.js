import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 90 },
        { name: "Rohit Sharma", score: 75 },
        { name: "Shubman Gill", score: 68 },
        { name: "KL Rahul", score: 82 },
        { name: "Hardik Pandya", score: 60 },
        { name: "Ravindra Jadeja", score: 71 },
        { name: "R Ashwin", score: 55 },
        { name: "Mohammed Shami", score: 40 },
        { name: "Jasprit Bumrah", score: 65 },
        { name: "Mohammed Siraj", score: 72 },
        { name: "Kuldeep Yadav", score: 58 }
    ];

    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>All Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with Score below 70</h2>

            {lowScorers.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListofPlayers;
