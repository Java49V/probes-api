package telran.probes.dto;

import jakarta.validation.constraints.NotNull;
import static telran.probes.dto.ErrorMessages.*;
public record SensorRange(@NotNull(message=MISSING_MIN_VALUE) Float minValue,
		@NotNull(message=MISSING_MAX_VALUE) Float maxValue) {

}
