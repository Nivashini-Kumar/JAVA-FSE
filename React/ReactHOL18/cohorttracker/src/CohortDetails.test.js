import { render, screen } from "@testing-library/react";
import CohortDetails from "./CohortDetails";
import { CohortsData } from "./Cohort";

describe("Cohort Details Component", () => {

    test("should create the component", () => {
        render(<CohortDetails cohort={CohortsData[0]} />);
    });

    test("should initialize the props", () => {
        render(<CohortDetails cohort={CohortsData[0]} />);
        expect(screen.getByText(/INTADMDF10/i)).toBeInTheDocument();
    });

    test("should display cohort code in h3", () => {
        render(<CohortDetails cohort={CohortsData[0]} />);
        expect(screen.getByRole("heading")).toHaveTextContent("INTADMDF10");
    });

    test("should always render same html", () => {
        const { asFragment } = render(
            <CohortDetails cohort={CohortsData[0]} />
        );
        expect(asFragment()).toMatchSnapshot();
    });

});
