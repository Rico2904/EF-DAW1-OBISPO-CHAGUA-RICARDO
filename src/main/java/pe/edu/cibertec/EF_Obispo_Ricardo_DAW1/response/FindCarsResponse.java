package pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.response;


import pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}
