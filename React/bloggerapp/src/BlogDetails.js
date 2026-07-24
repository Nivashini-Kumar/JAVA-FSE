import React from "react";

function BlogDetails() {

    const blogs = [
        {
            id: 1,
            title: "Introduction to React",
            author: "Nivashini",
            category: "React"
        },
        {
            id: 2,
            title: "Understanding JavaScript",
            author: "Cognizant",
            category: "JavaScript"
        }
    ];

    return (
        <div>
            <h2>Blog Details</h2>

            <ul>
                {blogs.map(blog => (
                    <li key={blog.id}>
                        <b>{blog.title}</b><br />
                        Author: {blog.author}<br />
                        Category: {blog.category}
                        <br /><br />
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default BlogDetails;
