import React from "react";

function CourseDetails() {

    const courses = [
        {
            id: 1,
            name: "React Development",
            duration: "8 Weeks",
            trainer: "Elisa Smith"
        },
        {
            id: 2,
            name: "Java Full Stack",
            duration: "12 Weeks",
            trainer: "John Doe"
        }
    ];

    return (
        <div>
            <h2>Course Details</h2>

            <ul>
                {courses.map(course => (
                    <li key={course.id}>
                        <b>{course.name}</b><br />
                        Duration: {course.duration}<br />
                        Trainer: {course.trainer}
                        <br /><br />
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default CourseDetails;
