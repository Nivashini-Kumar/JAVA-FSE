import { Link } from "react-router-dom";
import TrainersData from "./TrainersMock";

function TrainerList() {
    return (
        <div>
            <h2>Trainer List</h2>

            <ul>
                {TrainersData.map((trainer) => (
                    <li key={trainer.trainerId}>
                        <Link to={`/trainers/${trainer.trainerId}`}>
                            {trainer.name}
                        </Link>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default TrainerList;
