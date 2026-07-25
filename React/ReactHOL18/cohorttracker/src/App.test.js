import { render, screen } from "@testing-library/react";
import App from "./App";

test("renders Cohorts Details heading", () => {
    render(<App />);
    expect(screen.getByText(/Cohorts Details/i)).toBeInTheDocument();
});
