package util;

import java.time.LocalDate;
import java.time.Period;

public final class DateUtil {
    public static int obtenerEdad(LocalDate fechaNacimiento) {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now()); // LocalDate.now() -> Fecha actual
        return periodo.getYears();
    }
}
