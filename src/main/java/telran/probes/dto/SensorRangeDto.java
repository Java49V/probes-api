package telran.probes.dto;

import jakarta.validation.constraints.NotNull;
import static telran.probes.dto.ErrorMessages.*;
public record SensorRangeDto(@NotNull(message=MISSING_SENSOR_ID) Long id,
		@NotNull (message=MISSING_SENSOR_RANGE)SensorRange sensorRange) {

}
