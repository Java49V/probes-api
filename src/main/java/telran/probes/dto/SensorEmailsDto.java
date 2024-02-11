package telran.probes.dto;

import jakarta.validation.constraints.*;
import static telran.probes.dto.ErrorMessages.*;

import java.util.Objects;
public record SensorEmailsDto(@NotNull(message=MISSING_SENSOR_ID) Long id,
		@NotEmpty(message=EMPTY_EMAILS) String[] emails) {

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SensorEmailsDto other = (SensorEmailsDto) obj;
		return Objects.equals(id, other.id);
	}

}
