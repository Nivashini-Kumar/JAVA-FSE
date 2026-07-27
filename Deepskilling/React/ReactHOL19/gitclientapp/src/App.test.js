import { render, screen } from "@testing-library/react";
import App from "./App";

test("renders GitHub Repository List heading", () => {
  render(<App />);
  expect(screen.getByText(/GitHub Repository List/i)).toBeInTheDocument();
});
