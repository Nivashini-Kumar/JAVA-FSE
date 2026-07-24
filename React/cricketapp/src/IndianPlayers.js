import React from "react";

function IndianPlayers() {

    const oddTeam = [
        "Virat Kohli",
        "KL Rahul",
        "Ravindra Jadeja",
        "Jasprit Bumrah",
        "Kuldeep Yadav"
    ];

    const evenTeam = [
        "Rohit Sharma",
        "Shubman Gill",
        "Hardik Pandya",
        "R Ashwin",
        "Mohammed Shami",
        "Mohammed Siraj"
    ];

    // Destructuring
    const [odd1, odd2, odd3, odd4, odd5] = oddTeam;
    const [even1, even2, even3, even4, even5, even6] = evenTeam;

    // Merge using Spread Operator
    const T20Players = [
        "Virat Kohli",
        "Rohit Sharma",
        "Hardik Pandya"
    ];

    const RanjiPlayers = [
        "Mayank Agarwal",
        "Cheteshwar Pujara",
        "Hanuma Vihari"
    ];

    const mergedPlayers = [...T20Players, ...RanjiPlayers];

    return (
        <div>

            <h2>Odd Team Players</h2>
            <p>{odd1}</p>
            <p>{odd2}</p>
            <p>{odd3}</p>
            <p>{odd4}</p>
            <p>{odd5}</p>

            <h2>Even Team Players</h2>
            <p>{even1}</p>
            <p>{even2}</p>
            <p>{even3}</p>
            <p>{even4}</p>
            <p>{even5}</p>
            <p>{even6}</p>

            <h2>Merged Players</h2>

            {mergedPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

        </div>
    );
}

export default IndianPlayers;
