import CohortDetails from "./Components/CohortDetails";

function App() {

  const cohorts = [
    {
      name: "Cohort 1",
      startedOn: "01-01-2026",
      status: "Ongoing",
      coach: "John",
      trainer: "Smith"
    },
    {
      name: "Cohort 2",
      startedOn: "15-02-2026",
      status: "Completed",
      coach: "David",
      trainer: "Alex"
    }
  ];

  return (
    <div>

      <h1>Cognizant Academy Dashboard</h1>

      {
        cohorts.map((cohort, index) => (
          <CohortDetails
            key={index}
            name={cohort.name}
            startedOn={cohort.startedOn}
            status={cohort.status}
            coach={cohort.coach}
            trainer={cohort.trainer}
          />
        ))
      }

    </div>
  );
}

export default App;
