import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    let average = props.total / props.goal;

    return (
        <div className="box">
            <h2>Student Details</h2>

            <p>Name: {props.name}</p>

            <p>School: {props.school}</p>

            <p>Total Score: {props.total}</p>

            <p>Goal: {props.goal}</p>

            <p>Average Score: {average}</p>

        </div>
    );
}

export default CalculateScore;
